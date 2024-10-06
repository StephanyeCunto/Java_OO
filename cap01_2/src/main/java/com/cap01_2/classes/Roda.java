package com.cap01_2.classes;

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
}
