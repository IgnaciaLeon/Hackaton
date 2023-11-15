package com.example.banchile.services;

import com.example.banchile.models.Producto;
import com.example.banchile.repositories.ProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public List<Producto> buscarPorTipoProducto(String tipoProducto) {
        return productoRepository.findByTipoProducto(tipoProducto);
    }
    @Override
    public List<Producto> listaDeProducto() {
        return productoRepository.findAll();}




}
