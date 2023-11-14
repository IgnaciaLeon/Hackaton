package com.example.banchile.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cliente_id;

    @Column (name = "rut")
    @NotNull
    @NotBlank
    @NotEmpty
    @Pattern(regexp = "[0-9]{1,2}+\\.+[0-9]{3}+\\.+[0-9]{3}+\\-+[A-Z0-9]{1}", message = "ingresa un rut en un formato válido, ejemplo: 11.222.333-4")
    @Size(min = 11, max = 12)
    private String clienteRut;

    @Column (name = "nombre")
    @NotNull
    @NotEmpty
    @NotBlank
    @Pattern(regexp = "[a-zA-Z]+", message = "Sólo se permiten letras")

    private String clienteNombre;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Cuenta> cuentasCliente;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Servicio> servicioCliente;





}
