package com.example.banchile.DTO;

import lombok.Data;

import java.sql.Date;

@Data
public class DataDTO {

    private String clienteRut;
    private String clienteNombre;
    private String clienteNombreBanco;
    private Integer numeroCuentaBanco;
    private String nombreProducto;
    private Date fechaContratacion;
    private Integer montoDescuento;
}
