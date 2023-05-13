/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica6poo;

/**
 *
 * @author nunez
 */
public class Sensor extends ComponenteElectronico{
    final String TIPO;
    final String UNIDAD_DE_MEDIDA;
    final int VALOR;

    public Sensor( String FABRICANTE, String NUMERO_DE_SERIE, String MARCA, String NOMBRE) {
        super(FABRICANTE, NUMERO_DE_SERIE, MARCA, NOMBRE);
        this.TIPO = "Dactilar";
        this.UNIDAD_DE_MEDIDA = "10mm";
        this.VALOR = 200;
    }

    public String getTIPO() {
        return TIPO;
    }

    public String getUNIDAD_DE_MEDIDA() {
        return UNIDAD_DE_MEDIDA;
    }

    public int getVALOR() {
        return VALOR;
    }

    @Override
    public String toString() {
        return "Sensor{" + "Tipo :" + TIPO + ", Unidad de medida :" + UNIDAD_DE_MEDIDA + ", Valor :" + VALOR + '}';
    }

   

   
    
}
