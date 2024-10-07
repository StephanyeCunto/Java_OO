package classes;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Animal {
    private String especie;
    private String raca;
    private double preco;
    private int idade;
    
    public Animal(){
        this.especie=" ";
        this.raca= " ";
        this.preco= 0.0;
        this.idade=0;
    }
    
    public void setEspecie(String especie){
        this.especie=especie;
    }
    
    public void setRaca(String raca){
        this.raca=raca;
    }
    
    public void setPreco(double preco){
        this.preco=preco;
    }
    
    public void setIdade(int idade){
        this.idade=idade;
    }
    
    public String getEspecie(){
        return especie;
    }
    
    public String getRaca(){
        return raca;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void preencher(){
        Scanner scr = new Scanner(System.in);
        System.out.print("Digite a especie do animal: ");
        this.especie = scr.nextLine();
        System.out.print("Digite o raca do animal: ");
        this.raca = scr.nextLine();
        System.out.print("Digite o preco do animal: ");
        this.preco = scr.nextDouble();
        System.out.print("Digite a idade do animal: ");
        this.idade = scr.nextInt();
    }
    
    public void imprimir(){
        System.out.println("Especie: "+ this.especie);
        System.out.println("Raca: "+ this.raca);
        System.out.println("Preco: "+ this.preco);
        System.out.println("Idade: "+ this.idade);
    }
    
    public void copiar(Animal outro){
        this.especie= outro.getEspecie();
        this.raca= outro.getRaca();
        this.preco= outro.getPreco();
        this.idade= outro.getIdade();
    }
    
    @Override
    public String toString(){
        return "Animal{ Especie: " + this.especie + " , Raca: "+this.raca+" , Preco: "+this.preco+ " , Idade: "+this.idade+ "}";
    }
}
