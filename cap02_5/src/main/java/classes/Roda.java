package classes;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Roda {
    private double raio;
    private String material;
    private double peso;
    private double maxPeso;
    
    public Roda(){
        this.raio=0.0;
        this.material= "";
        this.peso=0.0;
        this.maxPeso=0.0;
    }
    
    public void setRaio(double raio){
        this.raio=raio;
    }
    
    public void setMaterial(String material){
        this.material=material;
    }
    
    public void setPeso(double peso){
        this.peso=peso;
    }
    
    public void setMaxPeso(double maxPeso){
        this.maxPeso=maxPeso;
    }
    
    public double getRaio(){
        return this.raio;
    }
    
    public String getMaterial(){
        return material;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public double getMaxPeso(){
        return maxPeso;
    }   
    
    public void preencher(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Digite o raio :");
        this.raio=scr.nextDouble();
        System.out.println("Digite o peso: ");
        this.peso=scr.nextDouble();
        System.out.println("Digite o material: ");
        this.material=scr.nextLine();
        System.out.println("Digite o peso máximo: ");
        this.maxPeso=scr.nextDouble();
    }
    
    public void imprimir(){
        System.out.println("Raio: "+this.raio);
        System.out.println("Peso: "+this.peso);
        System.out.println("Material: "+this.material);
        System.out.println("Peso máximo: "+this.maxPeso);
    }
    
    @Override
    public String toString(){
        return "{Raio: "+this.raio+" Peso: "+this.peso+" Material: "+this.material+" Peso maximo: "+this.maxPeso+" }";
    }
    
    public void copiar(Roda outra){
        this.material=outra.getMaterial();
        this.maxPeso=outra.getMaxPeso();
        this.peso=outra.getPeso();
        this.raio=outra.getRaio();
    }
}
