package domain.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;


    @Data
    @Entity
    public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long idPersona;
     private String nombre;
     private String apellido;
     private String email;
     private String telefono;

 }

