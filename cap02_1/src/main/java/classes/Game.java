package classes;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Game {
    private String titulo;
    private String plataforma;
    private double preco;
    private String classificacao_etaria;
    
    public Game(){
        this.titulo=" ";
        this.plataforma= " ";
        this.preco= 0.0;
        this.classificacao_etaria=" ";
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    
    public void setPlataforma(String plataforma){
        this.plataforma=plataforma;
    }
    
    public void setPreco(double preco){
        this.preco=preco;
    }
    
    public void setClassificacao_etaria(String classificacao_etaria){
        this.classificacao_etaria=classificacao_etaria;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getPlataforma(){
        return plataforma;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public String getClassificacao_etaria(){
        return classificacao_etaria;
    }
    
    public void preencher(){
        Scanner scr = new Scanner(System.in);
        System.out.print("Digite o titulo do game: ");
        this.titulo = scr.nextLine();
        System.out.print("Digite o plataforma do game: ");
        this.plataforma = scr.nextLine();
        System.out.print("Digite o preco do game: ");
        this.preco = scr.nextDouble();
        System.out.print("Digite a classificacao etaria do game: ");
        this.classificacao_etaria = scr.nextLine();
    }
    
    public void imprimir(){
        System.out.println("Titulo: "+ this.titulo);
        System.out.println("Plataforma: "+ this.plataforma);
        System.out.println("Preco: "+ this.preco);
        System.out.println("Classificacao etaria: "+ this.classificacao_etaria);
    }
    
    public void copiar(Game outro){
        this.titulo= outro.getTitulo();
        this.plataforma= outro.getPlataforma();
        this.preco= outro.getPreco();
        this.classificacao_etaria= outro.getClassificacao_etaria();
    }
    
    @Override
    public String toString(){
        return "Game{ Titulo: " + this.titulo + " , Plataforma: "+this.plataforma+" , Preco: "+this.preco+ " , Classificacao etaria: "+this.classificacao_etaria+ "}";
    }
}
