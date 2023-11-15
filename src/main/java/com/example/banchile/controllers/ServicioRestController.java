package com.example.banchile.controllers;

import com.example.banchile.models.Servicio;
import com.example.banchile.repositories.ClienteRepository;
import com.example.banchile.repositories.ServicioRepository;
import com.example.banchile.services.ClienteServiceImpl;
import com.example.banchile.services.ServicioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("servicio/")

public class ServicioRestController {

    @Autowired
    ServicioServiceImpl servicioService;

    @Autowired
    ServicioRepository servicioRepository;

    @GetMapping("/lista") //localhost:8080/servicio/lista
    public List<Servicio> listaServicio() {
        return servicioService.listaServicio();
    }


    //REVISAR ESTA QUERY
    @GetMapping("/sumar-montos") //localhost:8080/servicio/sumar-montos?rut=19.567.626-7&fecha=2023-11-15&nombreProducto=APV
    public Integer sumarMontosDeDescuentoFiltrados(
            @RequestParam String rut,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha,
            @RequestParam String nombreProducto) {
        return servicioService.sumarMontosDeDescuentoFiltrados(rut, fecha, nombreProducto);
    }

    @GetMapping("/ordenar-por-monto") //localhost:8080/servicio/ordenar-por-monto
    public List<Servicio> orderByAmount() {
        return servicioService.orderByAmount();
    }

    @GetMapping("/filtrar-por-fecha") //localhost:8080/servicio/filtrar-por-fecha?fechaContratacion=2010-10-09 00:00:00
    public List<Servicio> findByFechaContratacion(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaContratacion) {
        return servicioService.findByFechaContratacion(fechaContratacion);
    }






}
