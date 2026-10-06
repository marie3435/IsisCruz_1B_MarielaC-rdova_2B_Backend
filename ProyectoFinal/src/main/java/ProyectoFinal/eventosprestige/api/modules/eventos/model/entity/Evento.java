package ProyectoFinal.eventosprestige.api.modules.eventos.model.entity;

public class Evento {

    @Entity
    @Table(name = "EVENTOS")
    public class Evento {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID_EVENTO")
        private Long idEvento;

        @ManyToOne
        @JoinColumn(name = "ID_CLIENTE", nullable = false)
        private Cliente cliente;

        @ManyToOne
        @JoinColumn(name = "ID_SALON", nullable = false)
        private Salon salon;

        @Column(name = "NOMBRE_EVENTO", nullable = false, length = 100)
        private String nombreEvento;

        @Column(name = "FECHA_EVENTO", nullable = false)
        private LocalDate fechaEvento;

        @Column(name = "CANTIDAD_PERSONAS", nullable = false)
        private Integer cantidadPersonas;

        @Column(name = "CANTIDAD_HORAS", nullable = false)

        private Integer cantidadHoras;

        @Column(name = "ESTADO", nullable = false, length = 20)
        private String estado;

        @Column(name = "TOTAL_PAGO", nullable = false)
        private BigDecimal totalPago;

        // Getters y Setters
        public Long getIdEvento() { return idEvento; }
        public void setIdEvento(Long idEvento) { this.idEvento = idEvento; }
        public Cliente getCliente() { return cliente; }
        public void setCliente(Cliente cliente) { this.cliente = cliente; }
        public Salon getSalon() { return salon; }
        public void setSalon(Salon salon) { this.salon = salon; }
        public String getNombreEvento() { return nombreEvento; }
        public void setNombreEvento(String nombreEvento) { this.nombreEvento = nombreEvento; }
        public LocalDate getFechaEvento() { return fechaEvento; }
        public void setFechaEvento(LocalDate fechaEvento) { this.fechaEvento = fechaEvento; }
        public Integer getCantidadPersonas() { return cantidadPersonas; }
        public void setCantidadPersonas(Integer cantidadPersonas) { this.cantidadPersonas = cantidadPersonas; }
        public Integer getCantidadHoras() { return cantidadHoras; }
        public void setCantidadHoras(Integer cantidadHoras) { this.cantidadHoras = cantidadHoras; }
        public String getEstado() { return estado; }
        public void setEstado(String estado) { this.estado = estado; }
        public BigDecimal getTotalPago() { return totalPago; }
        public void setTotalPago(BigDecimal totalPago) { this.totalPago = totalPago; }

    }
