package com.example.banchile.services;

import com.example.banchile.models.Cliente;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
public interface ClienteService {

    List<Cliente> listaDeClientes();
}
