package com.example.banchile.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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
    private  Long producto_id;

    @Column (name = "nombre")
    @NotNull
    @NotBlank
    @NotEmpty
    @Pattern(regexp = "[a-zA-Z]+", message = "Sólo se permiten letras")
    private String nombreProducto;

    @OneToOne
    private Servicio servicio;

}
