/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica6poo;

import java.util.ArrayList;

/**
 *
 * @author nunez
 */
public abstract class DispositivoElectronico {
    final String FABRICANTE;
    final String NUMERO_DE_SERIE;
    final String MARCA;
    final String NOMBRE;
    protected float costo;
    protected ArrayList<ComponenteElectronico> componentes;

    public DispositivoElectronico(String FABRICANTE, String NUMERO_DE_SERIE, String MARCA, String NOMBRE) {
        this.FABRICANTE = FABRICANTE;
        this.NUMERO_DE_SERIE = NUMERO_DE_SERIE;
        this.MARCA = MARCA;
        this.NOMBRE = NOMBRE;
    }

    public String getFABRICANTE() {
        return FABRICANTE;
    }

    public String getNUMERO_DE_SERIE() {
        return NUMERO_DE_SERIE;
    }

    public String getMARCA() {
        return MARCA;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
   public void agregarComponentes(ComponenteElectronico componente)
   {
       componentes.add(componente);
   }

    @Override
    public String toString() {
        return "DispositivoElectronico{" + "Fabricante :" + FABRICANTE + ", Número de serie:" + NUMERO_DE_SERIE + ", Marca :" + MARCA + ", Nombre :" + NOMBRE + ", Costo:" + costo + ", Componentes :" + componentes + '}';
    }
   
   
}
