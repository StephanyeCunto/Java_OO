package classes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Disciplina {
    private String nome;
    private int semestre;
    private String horario;
    private Professor ministrante;
    private List<Aluno> lstAlunos;

    public Disciplina() {
        this.nome = "";
        this.semestre = 0;
        this.horario = "";
        this.ministrante = new Professor();
        this.lstAlunos = new ArrayList<>(); 
    }

    public Professor getMinistrante() {
        return ministrante;
    }

    public void setMinistrante(Professor ministrante) {
        this.ministrante = ministrante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public List<Aluno> getLstAlunos() {
        return lstAlunos;
    }

    public void setLstAlunos(List<Aluno> lstAlunos) {
        this.lstAlunos = lstAlunos;
    }
    
        public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("**** Preenchendo Disciplina *****");
        System.out.print("Informe o nome:");
        this.nome = leitor.next();
        System.out.print("Informe o semestre:");
        this.semestre = leitor.nextInt();
        System.out.print("Informe o horario:");
        this.horario = leitor.next();      
        ministrante.preencher();      
        String opcao ="n";
        do{
            Aluno aluno =  new Aluno();
            aluno.preencher();
            getLstAlunos().add(aluno);
            System.out.println("Deseja inserir novo aluno(s/n)?");
            opcao = leitor.next();
        }while(opcao == "s");                   
    }
    
    public void imprimir(){
        System.out.println("---- Dados da Disciplina ----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Semestre: "+ this.semestre);
        System.out.println("Horario: " + this.horario);        
        ministrante.imprimir();
        for(int i=0; i<=getLstAlunos().size()-1; i++){
            Aluno aluno = getLstAlunos().get(i);
            aluno.imprimir();
        }                
    }
    
    public void copiar(Disciplina outra){
        this.nome = outra.getNome();
        this.semestre = outra.getSemestre();
        this.horario = outra.getHorario();       
        this.ministrante.copiar(outra.getMinistrante());       
        for(int i=0; i<= outra.getLstAlunos().size()-1; i++){
            Aluno alunoOutra = outra.getLstAlunos().get(i);  
            Aluno aluno = new Aluno();
            aluno.copiar(alunoOutra);
            this.lstAlunos.add(aluno); 
        }        
    }
    
    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", semestre=" + semestre + ", horario=" + horario + '}';
    }
}
