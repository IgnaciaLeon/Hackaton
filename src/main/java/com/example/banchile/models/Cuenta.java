package com.example.banchile.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Cuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cuenta_id;

    @Column(name = "nombre_banco")
    @NotNull
    @NotBlank
    @NotEmpty
    @Pattern(regexp = "[a-zA-Z]+", message = "Sólo se permiten letras")
    private String clienteNombreBanco;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "clientesId")
    private Cliente cliente;
}
