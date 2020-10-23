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
    private int cantidad;
    private Item Item;
    
    //Constructor
    public Detalle(int idDetalle, int cantidad, Item Item) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.Item = Item;
    }
    
    //Getters
    public int getIdDetalle() {
        return idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Item getItem() {
        return Item;
    }
    
  
    //toString

    @Override
    public String toString() {
        return "Detalle{" + "idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", Item=" + Item + '}';
    }
   
}
