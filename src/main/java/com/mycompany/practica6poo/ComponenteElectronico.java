/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica6poo;

/**
 *
 * @author nunez
 */
public abstract class ComponenteElectronico extends DispositivoElectronico{
    protected DispositivoElectronico esParteDe;
    
     
    public ComponenteElectronico( String FABRICANTE, String NUMERO_DE_SERIE, String MARCA, String NOMBRE) {
        super(FABRICANTE, NUMERO_DE_SERIE, MARCA, NOMBRE);
       
    }

    public void setEsParteDe(DispositivoElectronico esParteDe) {
        this.esParteDe = esParteDe;
    }

    public DispositivoElectronico getEsParteDe() {
        return esParteDe;
    }

    @Override
    public String toString() {
        return "ComponenteElectronico{" + "esParteDe=" + esParteDe + '}';
    }
    

    
    
}
