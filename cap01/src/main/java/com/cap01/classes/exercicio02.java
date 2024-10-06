package com.mycompany.classes;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class exercicio02 {
    private int lerNumero(){
        System.out.print("Digite um numero: ");
        Scanner scr = new Scanner(System.in);
        int x= scr.nextInt();
        return x;
    }
    
    private boolean impar(int x){
        return x%2!=0;
    }
    
    private int soma(int x){
        int soma=0;
        for(int i=1; i<x; i=i+2){
            soma=i+soma;
        }
        return soma;
    }
    
    public String realizaSoma(){
        int x= lerNumero();
        return "A soma de todos os numeros impares de 0 ate "+x+" eh "+soma(x);
    }
    
}

