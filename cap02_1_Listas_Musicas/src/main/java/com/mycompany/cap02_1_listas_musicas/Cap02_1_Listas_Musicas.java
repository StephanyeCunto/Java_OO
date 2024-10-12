package com.mycompany.cap02_1_listas_musicas;

import classes.Musica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Cap02_1_Listas_Musicas {
    
    public static int menu(){
        Scanner scr= new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("1 - Inserir musica");
        System.out.println("2 - Remover musica");
        System.out.println("3 - Pesquisar musica (Titulo)");
        System.out.println("4 - Pesquisar musica (Artista)");
        System.out.println("5 - Imprimir lista de musicas");
        System.out.println("--------------------------");
        System.out.println("Escolha uma opcao:");
        return scr.nextInt();
    }
    
    public static void inserirMusica(List<Musica> listaMusica){
        Musica m1= new Musica();
        m1.preencher();
        listaMusica.add(m1);
    }
    
    public static void excluirMusica(List<Musica> listaMusica){
        List<Integer> listaMusicaEncontrada=pesquisarMusica("titulo",listaMusica,"excluir");
            for(int i=listaMusicaEncontrada.size()-1;i>=0; i--){
                int indice=listaMusicaEncontrada.get(i);
                listaMusica.remove(indice);
            }
        
    }
    
    public static List<Integer> pesquisarMusica(String pesquisar,List<Musica> listaMusica, String funcao){
        List<Integer> listaMusicaEncontrada= new ArrayList();
        Scanner scr = new Scanner(System.in);
        System.out.print("Digite o "+pesquisar+" que deseja "+funcao+":");
        String pesquisado = scr.nextLine();
        if(pesquisar.equals("titulo")){
            for(int i=0; i<listaMusica.size(); i++){
                if(pesquisado.equals(listaMusica.get(i).getTitulo())){
                    System.out.println("Musica encontrada");
                    listaMusica.get(i).imprimir();
                    listaMusicaEncontrada.add(i);
                }
            }
        }else{
            for(int i=0;i<listaMusica.size(); i++){
                if(pesquisado.equals(listaMusica.get(i).getArtista())){
                    System.out.println("Musica encontrada");
                    listaMusica.get(i).imprimir();
                    listaMusicaEncontrada.add(i);
                }
            }
        }
        
        return listaMusicaEncontrada;
    }
    
    public static void imprimirMusicas(List<Musica> listaMusica){
        for(int i=0; i<listaMusica.size(); i++){
           listaMusica.get(i).imprimir();
           System.out.println("Indice: "+i);
        }
    }

    public static void main(String[] args) {
        List<Musica> listaMusica = new ArrayList();
        int opcao=0;
        do{
            opcao=menu();
            switch(opcao){
                case(1)-> inserirMusica(listaMusica);
                case(2)-> excluirMusica(listaMusica);
                case(3)-> pesquisarMusica("titulo",listaMusica,"pesquisar");
                case(4)-> pesquisarMusica("artista",listaMusica,"pesquisar");
                case(5)-> imprimirMusicas(listaMusica);
            }
        }while(opcao!=0);
    }
}
