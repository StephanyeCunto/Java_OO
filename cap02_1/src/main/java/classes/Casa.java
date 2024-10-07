package classes;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Casa {
    private String endereco;
    private double area;
    private int num_quartos;
    private double preco;
    
    public Casa(){
        this.endereco=" ";
        this.area= 0.0;
        this.num_quartos= 0;
        this.preco= 0.0;
    }
    
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    
    public void setArea(double area){
        this.area=area;
    }
    
    public void setNumQuarto(int num_quartos){
        this.num_quartos=num_quartos;
    }
    
    public void setPreco(double preco){
        this.preco=preco;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public double getArea(){
        return area;
    }
    
    public int getNumQuartos(){
        return num_quartos;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void preencher(){
        Scanner scr= new Scanner(System.in);
        System.out.println("Digite o endereco: ");
        this.endereco=scr.nextLine();
        System.out.println("Digite a area: ");
        this.area=scr.nextDouble();
        System.out.println("Digite o numero de quartos: ");
        this.num_quartos=scr.nextInt();
        System.out.println("Digite o preco: ");
        this.preco=scr.nextDouble();
    }
    
    public void imprimir(){
        System.out.println("Endereco: "+this.endereco);
        System.out.println("Area: "+this.area);
        System.out.println("Numero de quartos: "+this.num_quartos);
        System.out.println("Preco: "+this.preco);
    }
    
    @Override
    public String toString(){
        return "{ Endereco: "+this.endereco+" , Area: "+this.area+" Numero de quartos: "+this.num_quartos+" Preco: "+this.preco+" }";
    }
    
    public void copiar(Casa copia){
        this.endereco=copia.endereco;
        this.area=copia.area;
        this.num_quartos=copia.num_quartos;
        this.preco=copia.preco;
    }
}
