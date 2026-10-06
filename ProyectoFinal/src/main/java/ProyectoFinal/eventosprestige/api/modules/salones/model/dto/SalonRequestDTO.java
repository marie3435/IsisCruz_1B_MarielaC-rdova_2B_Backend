package ProyectoFinal.eventosprestige.api.modules.salones.model.dto;


import java.math.BigDecimal;

public class SalonRequestDTO {
    private String nombreSalon;
    private Integer capacidad;
    private BigDecimal precioRenta;
    private String ubicacion;

    public String getNombreSalon() { return nombreSalon; }
    public void setNombreSalon(String nombreSalon) { this.nombreSalon = nombreSalon; }
    public Integer getCapacidad() { return capacidad; }
    public void setCapacidad(Integer capacidad) { this.capacidad = capacidad; }
    public BigDecimal getPrecioRenta() { return precioRenta; }
    public void setPrecioRenta(BigDecimal precioRenta) { this.precioRenta = precioRenta; }
    public String getUbicacion() { returnubicacion;}
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

}
