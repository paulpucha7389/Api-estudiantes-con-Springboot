package com.example.api_est.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long estudiante_id;
    @Column(name="nombre", nullable = false)
    private String nombre;
    @Column(name="apellido", nullable = false)
    private String apellido;
    @Column(name= "correo", unique = true, nullable = false)
    private String email;

}
