package classes;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Aluno {

    private String nome;
    private int idade;
    private String matricula;
    private int anoIngresso;

    public Aluno() {
        this.nome = " ";
        this.idade = 0;
        this.matricula = " ";
        this.anoIngresso = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNumQuarto(String matricula) {
        this.matricula = matricula;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getAnoIngresso() {
        return anoIngresso;
    }

    public void preencher() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        this.nome = scr.nextLine();
        System.out.println("Digite a idade: ");
        this.idade = scr.nextInt();
        System.out.println("Digite a matricula: ");
        this.matricula = scr.nextLine();
        System.out.println("Digite o anoIngresso: ");
        this.anoIngresso = scr.nextInt();
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Numero de quartos: " + this.matricula);
        System.out.println("AnoIngresso: " + this.anoIngresso);
    }

    @Override
    public String toString() {
        return "{ Nome: " + this.nome + " , Idade: " + this.idade + " Numero de quartos: " + this.matricula + " AnoIngresso: " + this.anoIngresso + " }";
    }

    public void copiar(Aluno copia) {
        this.nome = copia.nome;
        this.idade = copia.idade;
        this.matricula = copia.matricula;
        this.anoIngresso = copia.anoIngresso;
    }
}
