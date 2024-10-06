package com.cap01_2.classes;

/**
 *
 * @author steph
 */
public class Proprietario {
    private String nome;
    private String cpf;

    public Proprietario(){
        this.nome= "";
        this.cpf= "000.000.000-00";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
