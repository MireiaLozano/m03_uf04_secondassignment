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
 * id, cantidad, Item 
 * 
 */
public class Detalle {
    
    //Propiedades
    private int idDetalle;
    private Item Item;
    private int cantidad;
    
    //Constructor
    public Detalle(int idDetalle, Item Item, int cantidad) {
        this.idDetalle = idDetalle;
        this.Item = Item;
        this.cantidad = cantidad;
    }
    
    
    //Getters
    public int getIdDetalle() {
        return idDetalle;
    }

    public String getItem() {
        return Item;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    //toString
    @Override
    public String toString() {
        return "Detalle{" + "idDetalle=" + idDetalle + ", Item=" + Item + ", cantidad=" + cantidad + '}';
    }
    
}
