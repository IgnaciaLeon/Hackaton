package com.example.banchile.repositories;

import com.example.banchile.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    // Query para filtrar búsqueda por producto (APV/Mis Metas)
    @Query("SELECT p FROM Producto p WHERE p.nombreProducto LIKE %:tipoProducto%")
    List<Producto> findByTipoProducto(@Param("tipoProducto") String tipoProducto);

}



