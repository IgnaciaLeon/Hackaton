package com.example.banchile.services;

import com.example.banchile.models.Cliente;
import com.example.banchile.repositories.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente buscarPorRut(String rut) {
        return clienteRepository.findByRut(rut);
    }


    @Override
    public List<Cliente> listaDeClientes() {
        List<Cliente> listaClientes = clienteRepository.findAll();
        return listaClientes;
    }
}








