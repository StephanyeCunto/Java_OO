
package classes;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class TelefoneCelular {
    private String marca;
    private String modelo;
    private double preco;
    private int memoria;
    
    public TelefoneCelular(){
        this.marca=" ";
        this.modelo= " ";
        this.preco= 0.0;
        this.memoria=0;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    public void setPreco(double preco){
        this.preco=preco;
    }
    
    public void setMemoria(int memoria){
        this.memoria=memoria;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public int getMemoria(){
        return memoria;
    }
    
    public void preencher(){
        Scanner scr = new Scanner(System.in);
        System.out.print("Digite a marca do telefone: ");
        this.marca = scr.nextLine();
        System.out.print("Digite o modelo do telefone: ");
        this.modelo = scr.nextLine();
        System.out.print("Digite o preco do telefone: ");
        this.preco = scr.nextDouble();
        System.out.print("Digite a memoria do telefone: ");
        this.memoria = scr.nextInt();
    }
    
    public void imprimir(){
        System.out.println("Marca: "+ this.marca);
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Preco: "+ this.preco);
        System.out.println("Memoria: "+ this.memoria);
    }
    
    public void copiar(TelefoneCelular outro){
        this.marca= outro.getMarca();
        this.modelo= outro.getModelo();
        this.preco= outro.getPreco();
        this.memoria= outro.getMemoria();
    }
    
    @Override
    public String toString(){
        return "Telefone{ Marca: " + this.marca + " , Modelo: "+this.modelo+" , Preco: "+this.preco+ " , Memoria: "+this.memoria+ "}";
    }
}
