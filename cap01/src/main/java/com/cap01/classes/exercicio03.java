package com.mycompany.classes;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class exercicio03 {
   private String nome(){
       System.out.print("Digite um nome: ");
       Scanner scr = new Scanner(System.in);
       String nome = scr.nextLine();
       return nome;
   } 
   
   private boolean isEqualNome(String nome1, String nome2){
       return nome1.equalsIgnoreCase(nome2);
   }
   private boolean mesmoTamnho(String nome1, String nome2){
       return nome1.length()==nome2.length();
   }
   
   private String maiorNome(String nome1, String nome2){
       return nome1.length()>nome2.length()? nome1:nome2;
   }
   
   public String verificaNome(){
       String nome1 = nome();
       String nome2 = nome();
       if(isEqualNome(nome1,nome2)){
           return "Os nomes sao iguais.";
       }else if(mesmoTamnho(nome1,nome2)){
           return "Os nomes possuem o mesmo tamanho.";
       }
       return "O nome "+maiorNome(nome1,nome2)+" eh maior.";
   }
}
