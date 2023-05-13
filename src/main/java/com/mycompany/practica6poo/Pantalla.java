/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica6poo;

/**
 *
 * @author nunez
 */
public class Pantalla extends ComponenteElectronico{
    final int RESOLUCION_X;
    final int RESOLUCION_Y;    

    public Pantalla(int RESOLUCION_X, int RESOLUCION_Y, String FABRICANTE, String NUMERO_DE_SERIE, String MARCA, String NOMBRE) {
        super(FABRICANTE, NUMERO_DE_SERIE, MARCA, NOMBRE);
        this.RESOLUCION_X = RESOLUCION_X;
        this.RESOLUCION_Y = RESOLUCION_Y;
    }

    
    



    public int getRESOLUCION_X() {
        return RESOLUCION_X;
    }

    public int getRESOLUCION_Y() {
        return RESOLUCION_Y;
    }

    @Override
    public String toString() {
        return   "Resolucion en X " + RESOLUCION_X + ", Resolucion en Y :" + RESOLUCION_Y ;
    }

    
    
    
}