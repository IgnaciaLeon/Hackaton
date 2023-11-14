package com.example.banchile.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    /*ID del servicio contratado*/
    private Long IdCodigoServicio;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fechaContratacion;

    private Integer montoDescuento;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "clientesId")
    private Cliente cliente;
}
