package com.mycompany.cap02_5_exercicio03;

import classes.Aluno;
import classes.Disciplina;
import classes.Professor;

/**
 *
 * @author steph
 */
public class Cap02_5_exercicio03 {

    public static void main(String[] args) {
        Professor p1=new Professor();
        p1.preencher();
        p1.imprimir();
        Aluno a1= new Aluno();
        a1.preencher();
        a1.imprimir();
        Disciplina d1= new Disciplina();
        d1.preencher();
        d1.imprimir();
    }
}
