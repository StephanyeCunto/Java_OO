package classes;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class carro {
    private String marca;
    private String modelo;
    private int ano;
    private Proprietario proprietario;
    private Roda roda;
    
    public carro(){
        this.marca= "";
        this.modelo= "";
        this.ano=0000;
      
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
    
    public Roda getRoda(){
        return roda;
    }
    
    public void setRoda(Roda roda){
        this.roda = roda;
    }
    
    public void preencher(){
        Scanner scr= new Scanner(System.in);
        System.out.println("Digite a marca: ");
        this.marca=scr.nextLine();
        System.out.println("Digite o modelo: ");
        this.modelo=scr.nextLine();
        System.out.println("Digite o ano:");
        this.ano=scr.nextInt();
        proprietario.preencher();
        roda.preencher();
    }
    
    public void imprimir(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano: "+this.ano);
        proprietario.imprimir();
        roda.imprimir();
    }
    
    public String toString(){
        return "{ Marca: "+this.marca+" Modelo: "+ this.modelo+ " Ano: "+this.ano+proprietario.toString()+roda.toString()+"}";
    }
    
    public void copiar(Carro outro){
        this.marca=outro.getMarca();
        this.modelo=outro.getModelo();
        this.ano=outro.getAno();
        proprietario.copiar(proprietario);
        roda.copiar(roda);
    }
}
