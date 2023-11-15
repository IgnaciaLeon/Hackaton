package com.example.banchile.repositories;

import com.example.banchile.models.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ServicioRepository extends JpaRepository<Servicio, Long> {

    //Query  para ordenar monto de menor a mayor
    @Query(value = "select * from servicio order by comentario.monto_descuento ASC ", nativeQuery= true)
    List<Servicio> orderByAmount();

    //Query para sumar todos los montos de los registros seleccionados después de pasar por los filtros rut, fecha y tipo de producto
    @Query("SELECT SUM(s.montoDescuento) FROM Servicio s, Producto p " +
            "WHERE s.cliente.clienteRut = :rut " +
            "AND s.fechaContratacion > :fecha " +
            "AND p.nombreProducto = :nombreProducto")
    Integer sumarMontosDeDescuentoFiltrados(
            @Param("rut") String rut,
            @Param("fecha") Date fecha,
            @Param("nombreProducto") String nombreProducto
    );

    //Query para filtrar/seleccionar por fecha de cargo (5, 10, 15, 20)
    @Query("SELECT s FROM Servicio s WHERE s.fechaContratacion = :fechaContratacion")
    List<Servicio> findByFechaContratacion(@Param("fechaContratacion") Date fechaContratacion);

}



