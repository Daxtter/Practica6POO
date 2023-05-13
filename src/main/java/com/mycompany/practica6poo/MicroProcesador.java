/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica6poo;

/**
 *
 * @author nunez
 */
public class MicroProcesador extends ComponenteElectronico{
    final int CACHE_RAM;
    final long VELOCIDAD_HZ;

    public MicroProcesador(int CACHE_RAM, long VELOCIDAD_HZ, String FABRICANTE, String NUMERO_DE_SERIE, String MARCA, String NOMBRE) {
        super(FABRICANTE, NUMERO_DE_SERIE, MARCA, NOMBRE);
        this.CACHE_RAM = CACHE_RAM;
        this.VELOCIDAD_HZ = VELOCIDAD_HZ;
    }


  

    public int getCACHE_RAM() {
        return CACHE_RAM;
    }

    public long getVELOCIDAD_HZ() {
        return VELOCIDAD_HZ;
    }

    @Override
    public String toString() {
        return "MicroProcesador{" + "Cache de RAM=" + CACHE_RAM + ", Velocidad de HZ =" + VELOCIDAD_HZ + '}';
    }

    

  
    
    
}
