package classes;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Professor {
    private String nome;
    private char sexo;
    private int idade;
    private String cpf;
    
    public Professor(){
        this.nome="";
        this.sexo='a';
        this.idade=0;
        this.cpf="";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void preencher(){
        Scanner scr= new Scanner(System.in);
        System.out.println("Digite o nome: ");
        this.nome=scr.nextLine();
        System.out.println("Digite o sexo: f(feminimo) m(masculino)");
        this.nome=scr.next();
        System.out.println("Digite a idade:");
        this.idade=scr.nextInt();
        System.out.println("Digite o cpf:");
        this.cpf=scr.nextLine();
    }
    
    public void imprimir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("Idade: "+this.idade);
        System.out.println("Cpf: "+this.cpf);
    }
    
    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("{Nome: ").append(nome);
        sb.append(" Sexo: ").append(sexo);
        sb.append(" Idade: ").append(idade);
        sb.append(" Cpf: ").append(cpf);
        return sb.toString();
    }
    
    public void copiar(Professor outro){
        this.cpf=outro.getCpf();
        this.idade=outro.getIdade();
        this.nome=outro.getNome();
        this.sexo=outro.getSexo();
    }
}
