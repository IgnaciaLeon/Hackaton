package com.example.banchile.services;

import com.example.banchile.DTO.DataDTO;
import com.example.banchile.models.Cliente;
import com.example.banchile.models.Servicio;
import com.example.banchile.repositories.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente buscarPorRut(String rut) {
        return clienteRepository.findByRut(rut);
    }

    public List<DataDTO> findAllServiciosWithDetails (Date fechaContratacion) {
        return clienteRepository.findAllServiciosWithDetails(fechaContratacion);
    }



    @Override
    public List<Cliente> listaDeClientes() {
        List<Cliente> listaClientes = clienteRepository.findAll();
        return listaClientes;
    }
}








