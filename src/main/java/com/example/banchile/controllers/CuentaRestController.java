package com.example.banchile.controllers;

import com.example.banchile.models.Cuenta;
import com.example.banchile.services.CuentaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cuenta")
public class CuentaRestController {

    @Autowired
    CuentaServiceImpl cuentaService;

    @GetMapping("/lista") //localhost:8080/cuenta/lista
    public List<Cuenta> listaCuenta() {
        return  cuentaService.listaCuenta();
    }

}