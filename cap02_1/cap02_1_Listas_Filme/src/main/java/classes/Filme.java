package classes;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Filme {
    private String titulo;
    private String diretor;
    private double preco;
    private int duracao;
    
    public Filme(){
        this.titulo=" ";
        this.diretor= " ";
        this.preco= 0.0;
        this.duracao=0;
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    
    public void setDiretor(String diretor){
        this.diretor=diretor;
    }
    
    public void setPreco(double preco){
        this.preco=preco;
    }
    
    public void setDuracao(int duracao){
        this.duracao=duracao;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getDiretor(){
        return diretor;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public int getDuracao(){
        return duracao;
    }
    
    public void preencher(){
        Scanner scr = new Scanner(System.in);
        System.out.print("Digite a titulo do filme: ");
        this.titulo = scr.nextLine();
        System.out.print("Digite o diretor do filme: ");
        this.diretor = scr.nextLine();
        System.out.print("Digite o preco do filme: ");
        this.preco = scr.nextDouble();
        System.out.print("Digite a duracao do filme: ");
        this.duracao = scr.nextInt();
    }
    
    public void imprimir(){
        System.out.println("Titulo: "+ this.titulo);
        System.out.println("Diretor: "+ this.diretor);
        System.out.println("Preco: "+ this.preco);
        System.out.println("Duracao: "+ this.duracao);
    }
    
    public void copiar(Filme outro){
        this.titulo= outro.getTitulo();
        this.diretor= outro.getDiretor();
        this.preco= outro.getPreco();
        this.duracao= outro.getDuracao();
    }
    
    @Override
    public String toString(){
        return "Filme{ Titulo: " + this.titulo + " , Diretor: "+this.diretor+" , Preco: "+this.preco+ " , Duracao: "+this.duracao+ "}";
    }
}
