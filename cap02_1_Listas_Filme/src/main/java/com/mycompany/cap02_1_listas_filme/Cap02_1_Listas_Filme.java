package com.mycompany.cap02_1_listas_filme;

import classes.Filme;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Cap02_1_Listas_Filme {
    
    public static int menu(){
        Scanner scr = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("1 - Inserir filme");
        System.out.println("2 - Remover filme");
        System.out.println("3 - Pesquisar filme(titulo)");
        System.out.println("4 - Pesquisar filme(diretor)");
        System.out.println("---------------------------");
        System.out.println("Escolha uma opcao:");
        return scr.nextInt();
    }
    
    public static void inserirFilme(List<Filme> listaFilme){
        Filme f1 = new Filme();
        f1.preencher();
        listaFilme.add(f1);
    }
    
    public static void excluir(List<Filme> listaFilme){
        List<Integer> listaFilmeEncontrado = pesquisar("titulo","excluir",listaFilme);
        for(int i=0; i<listaFilmeEncontrado.size()-1; i++){
            int indice = listaFilmeEncontrado.get(i);
            listaFilme.remove(indice);
        }
    }
    
    public static List pesquisar(String pesquisa, String funcao,List<Filme> listaFilme){
        List<Integer> listaFilmeEncontrado = new ArrayList();
        Scanner scr = new Scanner(System.in);
        System.out.print("Digite o "+pesquisa+" que deseja "+funcao);
        String pesquisado = scr.nextLine();
        if(pesquisa.equals("titulo")){
            for(int i = 0;i<listaFilme.size()-1; i++){
                if(listaFilme.get(i).getTitulo().equals(pesquisado)){
                    System.out.println("Livro encontrado:");
                    listaFilme.get(i).imprimir();
                    listaFilmeEncontrado.add(i);
                }
            }
        }else{
            for(int i=0; i<listaFilme.size()-1; i++){
                if(listaFilme.get(i).getDiretor().equals(pesquisado)){
                    System.out.println("Livro encontrado:");
                    listaFilme.get(i).imprimir();
                    listaFilmeEncontrado.add(i);
                }
            }
        }
        return listaFilmeEncontrado;
    }

    public static void main(String[] args) {
        List<Filme> listaFilme = new ArrayList();
        int opcao=0;
        do{
            opcao=menu();
            switch(opcao){
                case(1)->inserirFilme(listaFilme);
                case(2)->excluir(listaFilme);
                case(3)->pesquisar("titulo","pesquisar",listaFilme);
                case(4)->pesquisar("autor","pesquisar",listaFilme);
            }
        }while(opcao!=0);
    }
}
