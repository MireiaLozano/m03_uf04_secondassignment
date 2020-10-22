/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment.exercicilliure;

/**
 *
 * @author pep
 * 
 * Producte que volem comprar
 * 
 * precio, descripcion, nombre, id
 * 
 * Se recomienda extender esta clase 
 * 
 * 
 */
public abstract class Item extends CarritoDeLaCompra{
    //Propiedades
    private int idItem;
    private String nombre;
    private String descripcion;
    private double precio;
    
    //Constructor
    public Item(int idItem, String nombre, String descripcion, double precio) {
        this.idItem = idItem;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    //Getters/Setters

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //toString
    @Override
    public String toString() {
        return "Item{" + "idItem=" + idItem + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
}
