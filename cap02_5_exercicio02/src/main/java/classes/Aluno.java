package classes;

import java.util.ArrayList;
import java.util.Scanner;
import classes.Telefone;

/**
 *
 * @author steph
 */
public class Aluno {
    private String nome;
    private String matricula;
    private String email;
    private String curso;
    private ArrayList<Telefone> telefones;
    
    public void Aluno(){
        this.nome="";
        this.matricula="";
        this.email="";
        this.curso="";
        this.telefones= new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }
    
    public void adicionarTelefone(Telefone telefone) {
        this.telefones.add(telefone);
    }
    
    public void removerTelefone(Telefone telefone) {
        this.telefones.remove(telefone);
    }
    
    public void preencher(){
        Scanner scr= new Scanner(System.in);
        System.out.println("Digite o nome: ");
        this.nome=scr.nextLine();
        System.out.println("Digite a matricula: ");
        this.matricula=scr.nextLine();
        System.out.println("Digite o email: ");
        this.email=scr.nextLine();
        System.out.println("Digite o curso: ");
        this.curso=scr.nextLine();
        System.out.println("Digite zero se não houver mais telefones.");
        String telefone=scr.nextLine();
        do{
            Telefone t1= new Telefone();
            adicionarTelefone(t1);
        }while(telefone=="0");
    }
    
    public void imprimir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Matricula: "+ this.matricula);
        System.out.println("Email: "+this.email);
        System.out.println("Curso: "+ this.curso);
        Telefone t1= new Telefone();
        for(Telefone telefone: this.telefones){
            telefone.imprimir();
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("{ Nome: ").append(nome);
        sb.append(" Matrícula: ").append(matricula);
        sb.append(" Email: ").append(email);
        sb.append(" Curso: ").append(curso);
        sb.append(" Telefones: ");
        for (Telefone telefone : telefones) {
            sb.append(" - (").append(telefone.getDDD()).append(") ").append(telefone.getNumero())
              .append(" - ").append(telefone.getDescricao()).append(" (").append(telefone.getOperadora()).append(") ");
        }
        sb.append(" }");
        return sb.toString();
    }
    
    public void copiar(Aluno outro){
        this.curso=outro.getCurso();
        this.email=outro.getEmail();
        this.matricula=outro.getMatricula();
        this.nome=outro.getNome();
        this.telefones.clear();
        for (Telefone telefone : outro.getTelefones()) {
            Telefone novoTelefone = new Telefone();
            novoTelefone.copiar(telefone);
            this.telefones.add(novoTelefone);
        }
    }
}
