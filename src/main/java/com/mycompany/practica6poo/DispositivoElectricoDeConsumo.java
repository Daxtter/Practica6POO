/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica6poo;

/**
 *
 * @author nunez
 */
public abstract class DispositivoElectricoDeConsumo extends DispositivoElectronico{
    protected boolean encendido;

    public DispositivoElectricoDeConsumo(String FABRICANTE, String NUMERO_DE_SERIE, String MARCA, String NOMBRE) {
        super(FABRICANTE, NUMERO_DE_SERIE, MARCA, NOMBRE);
       encendido = false;
    } 

    
    

    
    public void encender()
    {
        encendido = true;
    }
    public void apagar()
    {
        encendido = false;
    }

    @Override
    public String toString() {
        return "DispositivoElectricoDeConsumo{" + "¿Esta encendido?" + encendido + '}';
    }
    
}
