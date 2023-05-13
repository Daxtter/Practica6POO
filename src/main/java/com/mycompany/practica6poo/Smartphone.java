/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica6poo;

/**
 *
 * @author nunez
 */
public class Smartphone extends Computadora{
    final Sensor SENSOR_DE_HUELLA;
    final Pantalla PANTALLA;

    public Smartphone(Sensor SENSOR_DE_HUELLA, Pantalla PANTALLA, String FABRICANTE, String NUMERO_DE_SERIE, String MARCA, String NOMBRE) {
        super(FABRICANTE, NUMERO_DE_SERIE, MARCA, NOMBRE);
        this.SENSOR_DE_HUELLA = SENSOR_DE_HUELLA;
        this.PANTALLA = PANTALLA;
    }

    

    @Override
    public String toString() {
        return "Smartphone{" + "Sensor de huella:" + SENSOR_DE_HUELLA + ", Pantalla :" + PANTALLA +" Datos del Dispositivo {"+"Fabricante : "+FABRICANTE+", Marca :"+MARCA+", Nombre: "+NOMBRE+", Numero De Serie :"+NUMERO_DE_SERIE+"}"+'}';
    }

    

    public Sensor getSENSOR_DE_HUELLA() {
        return SENSOR_DE_HUELLA;
    }

    public Pantalla getPANTALLA() {
        return PANTALLA;
    }

   
    
}
