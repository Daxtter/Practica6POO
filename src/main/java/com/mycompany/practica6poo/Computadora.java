/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica6poo;

/**
 *
 * @author nunez
 */
public class Computadora extends DispositivoElectronico{
    protected MicroProcesador cpu;
    protected long ramMB;

    public Computadora(String FABRICANTE, String NUMERO_DE_SERIE, String MARCA, String NOMBRE) {
        super(FABRICANTE, NUMERO_DE_SERIE, MARCA, NOMBRE);
    }

    public MicroProcesador getCpu() {
        return cpu;
    }

    @Override
    public String toString() {
        return "Computadora{" + "cpu :" + cpu + ", ram en MB :" + ramMB + '}';
    }

    public long getRamMB() {
        return ramMB;
    }

    public void setCpu(MicroProcesador cpu) {
        this.cpu = cpu;
    }

    public void setRamMB(long ramMB) {
        this.ramMB = ramMB;
    }
    
}
