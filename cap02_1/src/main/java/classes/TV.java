package classes;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class TV {
    private String marca;
    private double tamanho;
    private String resolucao;
    private double preco;
    
    public TV(){
        this.marca=" ";
        this.tamanho= 0.0;
        this.resolucao= " ";
        this.preco= 0.0;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public void setTamanho(double tamanho){
        this.tamanho=tamanho;
    }
    
    public void setResolucao(String resolucao){
        this.resolucao=resolucao;
    }
    
    public void setPreco(double preco){
        this.preco=preco;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public String getResolucao(){
        return resolucao;
    }
    
    public double getTamanho(){
        return tamanho;
    }
    
    public void preencher(){
        Scanner scr= new Scanner(System.in);
        System.out.println("Digite a marca da tv: ");
        this.marca=scr.nextLine();
        System.out.println("Digite o tamanho da tv: ");
        this.tamanho=scr.nextDouble();
        System.out.println("Digite a resolucao da tv: ");
        this.resolucao=scr.nextLine();
        System.out.println("Digite o preco da tv: ");
        this.preco=scr.nextDouble();
    }
    
    public void imprimir(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Tamanho: "+this.tamanho);
        System.out.println("Resolucao: "+this.resolucao);
        System.out.println("Preco: "+this.preco);
    }
    
    @Override
    public String toString(){
        return "{Marca: "+this.marca+" , Tamanho: "+this.tamanho+" , Resolucao: "+this.resolucao+" , Preco: "+this.preco+" }";
    }
    
    public void copiar(TV outro){
        this.marca=outro.getMarca();
        this.tamanho=outro.getTamanho();
        this.resolucao=outro.getResolucao();
        this.preco=outro.getPreco();
    }
}
