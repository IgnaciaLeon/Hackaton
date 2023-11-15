package com.example.banchile.services;

import com.example.banchile.models.Servicio;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin("*")
public interface ServicioService {

    List<Servicio> listaServicio();

}
