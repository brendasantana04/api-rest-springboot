package me.dio.api_rest_springboot.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_planeta")
public class Planeta {

    //atributos
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (unique = true)
    private String nome;
    private Double tamanho;
    // private Galaxia galaxia;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getTamanho() {
        return tamanho;
    }
    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }
    
    // public Galaxia getGalaxia() {
    //     return galaxia;
    // }
    // public void setGalaxia(Galaxia galaxia) {
    //     this.galaxia = galaxia;
    // }

    

}
