/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cat.copernic.m03_uf04_secondassignment;


import java.util.Scanner;

/**
 *
 * @author User
 */
public abstract class Dispositivo implements Conectable{
    
    //Propiedades
    private String nombre;
    private String descripcion;
    private double precio;
    
    //Construtor
     public Dispositivo(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    //Getters(Obtener)
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }
    
  //toString
    @Override
    public String toString() {
        return "Dispositivo{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }   
}
