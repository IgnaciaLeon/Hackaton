package com.example.banchile.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long productoId;

    private String NombreProducto;



    @OneToOne
    private Servicio servicio;

}
