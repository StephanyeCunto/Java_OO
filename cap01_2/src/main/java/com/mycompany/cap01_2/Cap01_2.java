/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cap01_2;

import com.cap01_2.classes.Proprietario;
import com.cap01_2.classes.Roda;
import com.cap01_2.classes.carro;

/**
 *
 * @author steph
 */
public class Cap01_2 {

    public static void main(String[] args) {
        Roda r = new Roda();
	r.setRaio(14);
	r.setMaterial("Aço");
	r.setPeso(20);
	r.setMaxPeso(1000);
        
        Proprietario proprietario1 = new Proprietario();
        Proprietario proprietario2 = new Proprietario();

        proprietario1.setNome("João Silva");
        proprietario1.setCpf("123.456.789-00");

        proprietario2.setNome("Maria Oliveira");
        proprietario2.setCpf("987.654.321-00");

        carro carro1 = new carro();
        carro carro2 = new carro();

        carro1.setMarca("Toyota");
        carro1.setModelo("Corolla");
        carro1.setAno(2020);
        carro1.setProprietario(proprietario1); 

        carro2.setMarca("Honda");
        carro2.setModelo("Civic");
        carro2.setAno(2019);
        carro2.setProprietario(proprietario2); 
    }
}
