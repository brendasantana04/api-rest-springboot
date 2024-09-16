package me.dio.api_rest_springboot.domain.model;

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
    private Integer id;

    @Column (unique = true)
    private String nome;
    private String tipo;
    private Double diametro;
    // private Galaxia galaxia;
    private Double distanciaTerra;
    
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
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Double getTamanho() {
        return diametro;
    }
    public void setTamanho(Double tamanho) {
        this.diametro = tamanho;
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
