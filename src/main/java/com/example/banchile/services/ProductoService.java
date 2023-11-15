package com.example.banchile.services;

import com.example.banchile.models.Producto;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.List;
@CrossOrigin("*")

public interface ProductoService {

    List<Producto> listaDeProducto();
}
