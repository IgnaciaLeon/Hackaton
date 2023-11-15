package com.example.banchile.repositories;

import com.example.banchile.models.Cliente;
import com.example.banchile.models.Producto;
import com.example.banchile.models.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {


    //Query buscador por RUT
    @Query("SELECT c FROM Cliente c WHERE c.clienteRut = :rut")
    Cliente findByRut(@Param("rut") String rut);

    //Query buscador por todos los datos
    @Query(value = "SELECT * FROM banchile.servicio s" +
    "JOIN cliente c" +
    "JOIN cuenta cu", nativeQuery = true)
    List<Servicio> findAllServiciosWithDetails();
}