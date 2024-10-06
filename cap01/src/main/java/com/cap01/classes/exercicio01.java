package com.mycompany.classes;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class exercicio01 {
    private int lerNumero(){
        System.out.print("Digite um numero: ");
        Scanner scr = new Scanner(System.in);
        int x= scr.nextInt();
        return x;
    }
    
    private int NumeroMaior(int x1,int x2){
        return (x1>x2)? x1 : x2;
    }
    
    public String comparaNumero(){
        int x1= lerNumero();
        int x2= lerNumero();
        
        if(x1==x2){
            return "Os numeros são iguais.";
        }
        return "O numero "+NumeroMaior(x1,x2)+" eh maior.";
    }
}
