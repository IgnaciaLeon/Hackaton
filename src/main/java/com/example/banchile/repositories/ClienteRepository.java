package com.example.banchile.repositories;

import com.example.banchile.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {


    //Query buscador por RUT
    @Query("SELECT c FROM Cliente c WHERE c.clienteRut = :rut")
    Cliente findByRut(@Param("rut") String rut);

}