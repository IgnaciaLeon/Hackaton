package com.example.banchile.controllers;

import com.example.banchile.models.Producto;
import com.example.banchile.models.Servicio;
import com.example.banchile.repositories.ClienteRepository;
import com.example.banchile.repositories.ProductoRepository;
import com.example.banchile.services.ClienteServiceImpl;
import com.example.banchile.services.ProductoServiceImpl;
import com.example.banchile.services.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoRestController {

    @Autowired
    ProductoServiceImpl productoService;

    @Autowired
    ProductoRepository productoRepository;

    @GetMapping("/lista") //localhost:8080/producto/lista
    public List<Producto> listaProducto(){
        return productoService.listaDeProducto();
    }

    @GetMapping("/tipo/{tipoProducto}") //localhost:8080/tipo/producto/APV o Mis Metas
    public List<Producto> buscarPorTipoProducto(@PathVariable String tipoProducto) {
        return productoService.buscarPorTipoProducto(tipoProducto);
    }

}
