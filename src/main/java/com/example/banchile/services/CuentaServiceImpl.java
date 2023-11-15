package com.example.banchile.services;

import com.example.banchile.models.Cuenta;
import com.example.banchile.repositories.CuentaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CuentaServiceImpl implements CuentaService{

    @Autowired
    CuentaRepository cuentaRepository;

    @Override
    public List<Cuenta> listaCuenta() {
        return cuentaRepository.findAll();
    }

}
