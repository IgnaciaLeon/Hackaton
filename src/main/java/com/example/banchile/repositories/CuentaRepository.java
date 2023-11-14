package com.example.banchile.repositories;

import com.example.banchile.models.Cliente;
import com.example.banchile.models.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
}

