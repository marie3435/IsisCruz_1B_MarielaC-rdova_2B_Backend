package ProyectoFinal.eventosprestige.api.modules.eventos.service;

import ProyectoFinal.eventosprestige.api.modules.clientes.model.entity.Cliente;
import ProyectoFinal.eventosprestige.api.modules.clientes.repository.ClientesRepository;
import ProyectoFinal.eventosprestige.api.modules.eventos.model.dto.EventoRequestDTO;
import ProyectoFinal.eventosprestige.api.modules.eventos.model.entity.Evento;
import ProyectoFinal.eventosprestige.api.modules.eventos.repository.EventoRepository;
import ProyectoFinal.eventosprestige.api.modules.salones.model.entity.Salon;
import ProyectoFinal.eventosprestige.api.modules.salones.repository.SalonRepository;

import java.math.BigDecimal;
import java.util.List;

public class EventoService {
    private final EventoRepository eventoRepository;
    private final ClientesRepository clienteRepository;
    private final SalonRepository salonRepository;

    public EventoService(EventoRepository eventoRepository, ClientesRepository clienteRepository, SalonRepository salonRepository) {
        this.eventoRepository = eventoRepository;
        this.clienteRepository = clienteRepository;
        this.salonRepository = salonRepository;
    }

    public List<Evento> listarTodos() {
        return eventoRepository.findAll();
    }
    public Evento crearEvento(EventoRequestDTO dto) {
        Cliente cliente = clienteRepository.findById(dto.getIdCliente())
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        Salon salon = salonRepository.findById(dto.getIdSalon())
                .orElseThrow(() -> new RuntimeException("Salón no encontrado"));


        if (dto.getCantidadPersonas() > salon.getCapacidad()) {
            throw new IllegalArgumentException("La cantidad de personas excede la capacidad máxima del salón (" + salon.getCapacidad() + ").");
        }


        boolean existe = eventoRepository.existsBySalonAndFechaEventoAndEstadoNot(salon, dto.getFechaEvento(), "CANCELADO");
        if (existe) {
            throw new IllegalArgumentException("El salón seleccionado ya posee un evento reservado en esta fecha.");
        }

        BigDecimal totalPago = salon.getPrecioRenta().multiply(BigDecimal.valueOf(dto.getCantidadHoras()));

        Evento evento = new Evento();
        evento.setCliente(cliente);
        evento.setSalon(salon);
        evento.setNombreEvento(dto.getNombreEvento());
        evento.setFechaEvento(dto.getFechaEvento());
        evento.setCantidadPersonas(dto.getCantidadPersonas());
        evento.setCantidadHoras(dto.getCantidadHoras());
        evento.setEstado("CONFIRMADA"); // Estado inicial[cite: 5]
        evento.setTotalPago(totalPago);

        return eventoRepository.save(evento);

    }
}