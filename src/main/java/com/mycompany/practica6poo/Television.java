/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica6poo;

/**
 *
 * @author nunez
 */
public class Television extends DispositivoElectronico{
    final Pantalla PANTALLA;

    public Television(Pantalla PANTALLA, String FABRICANTE, String NUMERO_DE_SERIE, String MARCA, String NOMBRE) {
        super(FABRICANTE, NUMERO_DE_SERIE, MARCA, NOMBRE);
        this.PANTALLA = PANTALLA;
    }

    

    public Pantalla getPANTALLA() {
        return PANTALLA;
    }

    @Override
    public String toString() {
        return "Television{" + "Pantalla :" + PANTALLA + " Datos del Dispositivo {"+"Fabricante : "+FABRICANTE+", Marca :"+MARCA+", Nombre: "+NOMBRE+", Numero De Serie :"+NUMERO_DE_SERIE+"}"+'}';
    }

   
    
    
    
}
