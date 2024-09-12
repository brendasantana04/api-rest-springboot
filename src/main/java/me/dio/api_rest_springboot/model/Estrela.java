package me.dio.api_rest_springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_estrela")
public class Estrela {

    //atributos
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Double id;

    @Column (unique = true)
    private String nome;
    private String tipo;
    private Double tamanho;
    // private Galaxia galaxia;
    private Double distanciaTerra;
    
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
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    public Double getDistanciaTerra() {
        return distanciaTerra;
    }
    public void setDistanciaTerra(Double distanciaTerra) {
        this.distanciaTerra = distanciaTerra;
    }
    

}
