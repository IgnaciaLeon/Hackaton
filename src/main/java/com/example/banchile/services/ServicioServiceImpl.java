package com.example.banchile.services;

import com.example.banchile.models.Servicio;
import com.example.banchile.repositories.ServicioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    ServicioRepository servicioRepository;

    public Integer sumarMontosDeDescuentoFiltrados(String rut, Date fecha, String nombreProducto) {
        return servicioRepository.sumarMontosDeDescuentoFiltrados(rut, fecha, nombreProducto);
    }

    public List<Servicio> orderByAmount() {
        return servicioRepository.orderByAmount();
    }

    public List<Servicio> findByFechaContratacion(Date fechaContratacion) {
        return servicioRepository.findByFechaContratacion(fechaContratacion);
    }

    @Override
    public List<Servicio> listaServicio() {
        List<Servicio> listaServicios = servicioRepository.findAll();
        return listaServicios;
    }

    }
