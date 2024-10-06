package com.cap01_2.classes;

/**
 *
 * @author steph
 */
public class carro {
    private String marca;
    private String modelo;
    private int ano;
    private Proprietario proprietario;
    
    public carro(){
        this.marca= "";
        this.modelo= "";
        this.ano=0000;
      
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
}
