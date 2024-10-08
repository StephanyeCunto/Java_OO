package com.mycompany.cap02_1_listas;

import classes.Livro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Cap02_1_Listas {
    
    public static int imprimirMenu(){
        Scanner scr= new Scanner(System.in);
        
        System.out.println("--------------------------");
        System.out.println("1 - Iserir livro");
        System.out.println("2 - Remover livro");
        System.out.println("3 - Pesquisar livro (titulo)");
        System.out.println("4 - Pesqquisar livro (autor)");
        System.out.println("--------------------------");
        System.out.println("Escolha uma opcao:");
        return scr.nextInt();
    }
    
    private static void inserirDados(List<Livro> listaLivros) {
        Livro l1 = new Livro();
        l1.preencher();
        listaLivros.add(l1);
    }
    
    private static List<Integer> pesquisarLivro(String pesquisa, List<Livro> listaLivros){
        List<Integer> listaLivroEncontrado= new ArrayList<Integer>();
        Livro li= new Livro();
        Scanner scr = new Scanner(System.in);
        System.out.println("Digite o "+pesquisa+" que deseja pesquisar: ");
        String pesquisado = scr.nextLine();
        if("titulo".equals(pesquisa)){
            for(int i=0; i< listaLivros.size()-1; i++){
                if(pesquisado.equals(li.getTitulo())){
                    System.out.println("Livro encontrado");
                    li.imprimir();
                    listaLivroEncontrado.add(i);
                }
            }
        }else{
            for(int i=0; i< listaLivros.size()-1; i++){
                if(pesquisado.equals(li.getAutor())){
                    System.out.println("Livro encontrado");
                    li.imprimir();
                    listaLivroEncontrado.add(i);
                }
            }
        }
        return listaLivroEncontrado;
    }
    
    private static void deletar(List<Livro> listaLivros){
        List<Integer> listaLivrosDeletado=pesquisarLivro("titulo",listaLivros);
        for (int i = 0; i < listaLivros.size() - 1; i++) {
            for (int j = 0; j < listaLivrosDeletado.size() - 1; j++) {
                if(i==listaLivrosDeletado.get(j)){
                     Livro li = listaLivros.get(i);
                    listaLivros.remove(li);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Livro> listaLivros = new ArrayList<Livro>();
        Scanner scr = new Scanner(System.in);
        int opcao = 0;
        
        do{
            opcao= imprimirMenu();
            switch(opcao){
                case(1)->inserirDados(listaLivros);
                case(2)->deletar(listaLivros);
                case(3)->pesquisarLivro("titulo",listaLivros);
                case(4)->pesquisarLivro("autor",listaLivros);
            }
        }while (opcao != 0);
    }
}