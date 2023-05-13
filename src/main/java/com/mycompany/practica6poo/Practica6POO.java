/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica6poo;

import java.util.ArrayList;

/**
 *
 * @author nunez
 */
public class Practica6POO {

    public static void main(String[] args) {
        //Creacion de lista de Smartphone
        ArrayList<Smartphone> listaDeSmartphone = new ArrayList<>();
        
        listaDeSmartphone.add(new Smartphone(new Sensor("Samsung", "ABD3074", "Samsung", "Sensor"), 
                new Pantalla(1080,2340,"Samsung","13853SG","Samsung","Super Amoled")
                ,"Samsung","AG34567","Samsung","Galaxy A30S"));
        
        listaDeSmartphone.add(new Smartphone(new Sensor("Samsung", "AUOP674", "Samsung", "Sensor"), 
                new Pantalla(1240,1820,"Samsung","1313SU","Samsung","Panel Dynamic AMOLED 2X")
                ,"Samsung","GU38767","Samsung","Galaxy S23 Ultra"));
        //Creacion de lista de Tvs
        ArrayList<Television> listaDeTVs = new ArrayList<>();
        
        listaDeTVs.add(new Television(new Pantalla(3840,2160,"LG","1313SU","TCL","QLED"),
                "TCL", "T12419V", "TCL", "QLED ROKU TV"));
        
        listaDeTVs.add(new Television(new Pantalla(3840,2160,"LG","1313SU","TCL","QLED"),
                "TCL", "T12419V", "TCL", "MiniLed Google Tv"));
        //Impresion de lista de Tvs
        for (Television TV : listaDeTVs) {
            System.err.println(TV);
        }
        //Impresions de lista de smartphone
        for (Smartphone telefonos : listaDeSmartphone)
        {
            System.err.println(telefonos);
        }
        
        
    }
}
