package ProyectoFinal.eventosprestige.api.modules.salones.model.entity;

public class Salon {
    public class Salon { @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SALON")private Long idSalon;
        @Column(name = "NOMBRE_SALON", nullable = false, length = 100) private String nombreSalon;
        @Column(name = "CAPACIDAD", nullable = false) private Integer capacidad;
        @Column(name = "PRECIO_RENTA", nullable = false, precision = 10, scale = 2) private BigDecimal precioRenta;
        @Column(name = "UBICACION", length = 100) private String;

        public Long getIdSalon() { return idSalon; }
        public void setIdSalon(Long idSalon) { this.idSalon = idSalon; }
        public String getNombreSalon() { return nombreSalon; }
        public void setNombreSalon(String nombreSalon) { this.nombreSalon = nombreSalon; }
        public Integer getCapacidad(){ return capacidad; }
        public void setCapacidad(Integer capacidad) { this.capacidad = capacidad; }
        public BigDecimal getPrecioRenta() { return precioRenta; }
        public void setPrecioRenta(BigDecimal precioRenta) { this.precioRenta = precioRenta; }
        public String getUbicacion() { return ubicacion; } public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    }
