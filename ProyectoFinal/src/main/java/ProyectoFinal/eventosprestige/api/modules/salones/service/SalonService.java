package ProyectoFinal.eventosprestige.api.modules.salones.service;

import ProyectoFinal.eventosprestige.api.modules.salones.model.dto.SalonRequestDTO;
import ProyectoFinal.eventosprestige.api.modules.salones.model.entity.Salon;
import ProyectoFinal.eventosprestige.api.modules.salones.repository.SalonRepository;

import java.math.BigDecimal;
import java.util.List;

public class SalonService {
private SalonRepository salonRepository;
public List<Salon> obtenerTodos() {return salonRepository.findAll(); }
    public Salon obtenerPorId(Long id) { return salonRepository.findById(id) .orElseThrow(() -> new RuntimeException("Salón no encontrado con el ID: " + id)); }
    public Salon guardar(SalonRequestDTO dto) {
        if (dto.getCapacidad() <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor a 0.");
        }
        if (dto.getPrecioRenta().compareTo(BigDecimal.ZERO) <= 0) {
            throw newIllegalArgumentException("El precio de renta debe ser mayor a 0.");
        }
        Salon s = new Salon();
        s.setNombreSalon(dto.getNombreSalon());
        s.setCapacidad(dto.getCapacidad());
        s.setPrecioRenta(dto.getPrecioRenta());
        s.setUbicacion(dto.getUbicacion());
        return salonRepository.save(s);
    }
