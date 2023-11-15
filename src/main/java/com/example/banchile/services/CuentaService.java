package com.example.banchile.services;

import com.example.banchile.models.Cuenta;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin("*")
public interface CuentaService {

    List<Cuenta> listaCuenta();
}

