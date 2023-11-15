package com.example.banchile.controllers;

import com.example.banchile.models.Cliente;
import com.example.banchile.repositories.ClienteRepository;
import com.example.banchile.services.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cliente/")
public class ClienteRestController {
    @Autowired
    ClienteServiceImpl clienteService;

    @Autowired
    ClienteRepository clienteRepository;

    /*@GetMapping("/rut")
    public Cliente buscarPorRut() {
        Cliente buscarClientePorRut = clienteService.buscarPorRut(buscarPorRut().getClienteRut());
        return buscarClientePorRut;
    }

     */

    @GetMapping("/{rut}") //localhost:8080/cliente/10.123.123-1
    public Cliente obtenerClientePorRut(@PathVariable String rut) {

        return clienteRepository.findByRut(rut);
    }

    @GetMapping("/lista") //localhost:8080/cliente/lista
    public List<Cliente> listaClientes() {
        List<Cliente> mostrarListaClientes = clienteService.listaDeClientes();
        return mostrarListaClientes;
    }

}
