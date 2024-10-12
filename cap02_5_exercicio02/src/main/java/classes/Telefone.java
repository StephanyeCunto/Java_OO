package classes;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Telefone {
    private String DDD;
    private String numero;
    private String descricao;
    private String operadora;
    
    public Telefone(){
        this.DDD="";
        this.numero="";
        this.descricao="";
        this.operadora="";
    }
    
    public String getDDD() {
        return DDD;
    }

    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
    
    public void preencher(){
        Scanner scr=new Scanner(System.in);
        System.out.println("Digite o DDD: ");
        this.DDD=scr.nextLine();
        System.out.println("Digite o numero: ");
        this.numero=scr.nextLine();
        System.out.println("Digite a descricao: ");
        this.descricao=scr.nextLine();
        System.out.println("Digite a operadora: ");
        this.operadora=scr.nextLine();
    }
    
    public void imprimir(){
        System.out.println("DDD: "+this.DDD);
        System.out.println("Numero: "+this.numero);
        System.out.println("Descricao: "+this.descricao);
        System.out.println("Operadora: "+this.operadora);
    }
    
    @Override
    public String toString(){
        return "{ DDD: "+this.DDD+" Numero: "+this.numero+" Descricao: "+this.descricao+" Operadora: "+this.operadora+" }";
    }
    
    public void copiar(Telefone outro){
        this.DDD=outro.getDDD();
        this.descricao=outro.getDescricao();
        this.numero=outro.getNumero();
        this.operadora=outro.getOperadora();
    }
}
