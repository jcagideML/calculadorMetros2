package com.bootcampML.calculadorMetros2;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CalculadorMetros2Controller {

    @PostMapping("/calculador")
    public ResumeDTO getInfo(@RequestBody CasaDTO casa) {

        ResumeDTO resume = new ResumeDTO();

        double metros2totales = 0.0;
        Habitacion habMasGrande = null;
        Map<String, Double> metros2PorHabitacion = new HashMap<>();
        double max = 0.0;

        for (Habitacion h : casa.getHabitaciones()) {

            Double metros2 = calcularMetros2(h.getAncho(), h.getLargo());
            metros2PorHabitacion.put(h.getNombre(), metros2);
            metros2totales += metros2;

            if (metros2 > max) {
                max = metros2;
                habMasGrande = h;
            }
        }

        resume.setMetros2PorHabitacion(metros2PorHabitacion);
        resume.setMetros2totales(metros2totales);
        resume.setPrecio(metros2totales * 800);
        resume.setHabitacionMasGrande(habMasGrande);

        return resume;
    }


    private Double calcularMetros2(Double ancho, Double largo) {
        return ancho * largo;
    }

}