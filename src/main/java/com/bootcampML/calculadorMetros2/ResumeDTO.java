package com.bootcampML.calculadorMetros2;

import java.util.Map;

public class ResumeDTO {

    private Double metros2totales;
    private Double precio;
    private Habitacion habitacionMasGrande;
    private Map<String,Double> metros2PorHabitacion;

    public Double getMetros2totales() {
        return metros2totales;
    }

    public void setMetros2totales(Double metros2totales) {
        this.metros2totales = metros2totales;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Habitacion getHabitacionMasGrande() {
        return habitacionMasGrande;
    }

    public void setHabitacionMasGrande(Habitacion habitacionMasGrande) {
        this.habitacionMasGrande = habitacionMasGrande;
    }

    public Map<String, Double> getMetros2PorHabitacion() {
        return metros2PorHabitacion;
    }

    public void setMetros2PorHabitacion(Map<String, Double> metros2PorHabitacion) {
        this.metros2PorHabitacion = metros2PorHabitacion;
    }
}