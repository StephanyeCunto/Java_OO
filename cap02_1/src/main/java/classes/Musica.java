package classes;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Musica {
    private String titulo;
    private String artista;
    private double preco;
    private int duracao;
    
    public Musica(){
        this.titulo=" ";
        this.artista= " ";
        this.preco= 0.0;
        this.duracao=0;
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    
    public void setArtista(String artista){
        this.artista=artista;
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
    
    public String getArtista(){
        return artista;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public int getDuracao(){
        return duracao;
    }
    
    public void preencher(){
        Scanner scr = new Scanner(System.in);
        System.out.print("Digite a titulo do musica: ");
        this.titulo = scr.nextLine();
        System.out.print("Digite o artista do musica: ");
        this.artista = scr.nextLine();
        System.out.print("Digite o preco do musica: ");
        this.preco = scr.nextDouble();
        System.out.print("Digite a duracao do musica: ");
        this.duracao = scr.nextInt();
    }
    
    public void imprimir(){
        System.out.println("Titulo: "+ this.titulo);
        System.out.println("Artista: "+ this.artista);
        System.out.println("Preco: "+ this.preco);
        System.out.println("Duracao: "+ this.duracao);
    }
    
    public void copiar(Musica outro){
        this.titulo= outro.getTitulo();
        this.artista= outro.getArtista();
        this.preco= outro.getPreco();
        this.duracao= outro.getDuracao();
    }
    
    @Override
    public String toString(){
        return "Musica{ Titulo: " + this.titulo + " , Artista: "+this.artista+" , Preco: "+this.preco+ " , Duracao: "+this.duracao+ "}";
    }
    
    public void tocarMusica() {
        System.out.println("A musica "+ this.titulo + " está tocando!");
    }
      
    public void desligarMusica() {
        System.out.println("A musica "+ this.titulo + " parou de tocar tocando!");
    }
}
