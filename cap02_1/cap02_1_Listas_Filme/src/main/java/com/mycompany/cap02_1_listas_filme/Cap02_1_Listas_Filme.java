package com.mycompany.cap02_1_listas_filme;

/**
 *
 * @author steph
 */
public class Cap02_1_Listas_Filme {
    
    public int menu(){
        Scanner scr = new Scanner(System.in);
        int opcao = 0;
        System.out.println("---------------------------");
        System.out.println("1 - Inserir filme");
        System.out.println("2 - Remover filme");
        System.out.println("3 - Pesquisar filme(titulo)");
        return opcao;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
