package com.example.banchile.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    /*ID del servicio contratado*/
    private Long codigoServicio_id;

    @Column(name = "fecha_contratacion")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private Date fechaContratacion;

    @Column(name = "monto_descuento")
    @NotNull
    @NumberFormat(style = NumberFormat.Style.CURRENCY) //formato $
    private Integer montoDescuento;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "clientesId")
    private Cliente cliente;

    @OneToOne
    private Cuenta cuenta;

}
