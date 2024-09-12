package me.dio.api_rest_springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_constelacao")
public class Constelacao {

    //atributos
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Double id;

    @Column (unique = true)
    private String nome;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
