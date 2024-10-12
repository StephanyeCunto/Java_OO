package classes;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Livro {
    private String titulo;
    private String autor;
    private double preco;
    private int num_pag;
    
    public Livro(){
        this.titulo=" ";
        this.autor= " ";
        this.preco= 0.0;
        this.num_pag=0;
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    
    public void setAutor(String autor){
        this.autor=autor;
    }
    
    public void setPreco(double preco){
        this.preco=preco;
    }
    
    public void setNum_pag(int num_pag){
        this.num_pag=num_pag;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public int getNum_pag(){
        return num_pag;
    }
    
    public void preencher(){
        Scanner scr = new Scanner(System.in);
        System.out.print("Digite a titulo do livro: ");
        this.titulo = scr.nextLine();
        System.out.print("Digite o autor do livro: ");
        this.autor = scr.nextLine();
        System.out.print("Digite o preco do livro: ");
        this.preco = scr.nextDouble();
        System.out.print("Digite a numero de paginas do livro: ");
        this.num_pag = scr.nextInt();
    }
    
    public void imprimir(){
        System.out.println("Titulo: "+ this.titulo);
        System.out.println("Autor: "+ this.autor);
        System.out.println("Preco: "+ this.preco);
        System.out.println("Numero de páginas: "+ this.num_pag);
    }
    
    public void copiar(Livro outro){
        this.titulo= outro.getTitulo();
        this.autor= outro.getAutor();
        this.preco= outro.getPreco();
        this.num_pag= outro.getNum_pag();
    }
    
    @Override
    public String toString(){
        return "Livro{ Titulo: " + this.titulo + " , Autor: "+this.autor+" , Preco: "+this.preco+ " , Numero de paginas: "+this.num_pag+ "}";
    }
}
