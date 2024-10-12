package classes;

import java.util.Scanner;

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
    
    public void preencher(){
        Scanner scr =new Scanner(System.in);
        System.out.println("Digite o nome: ");
        this.nome=scr.nextLine();
        System.out.println("Digite o cpf: ");
        this.cpf=scr.nextLine();
    }
    
    public void imprimir(){
        System.out.println("Nome: "+ getNome());
        System.out.println("CPF: "+ getCpf());
    }
    
    @Override
    public String toString(){
        return "{ Nome: "+this.nome+" Cpf: "+this.cpf+" }";
    }
    
    public void copiar(Proprietario outro){
        this.nome = outro.getNome();
        this.cpf = outro.getCpf();
    }
}
