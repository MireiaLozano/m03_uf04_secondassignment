/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cat.copernic.m03_uf04_secondassignment.exercicilliure;


import java.util.Scanner;

/**
 *
 * @author User
 */
public class Papeleria extends Item{
       private String tipoItem;

    public Papeleria(String tipoItem, int idItem, String nombre, String descripcion, double precio) {
        super(idItem, nombre, descripcion, precio);
        this.tipoItem = tipoItem;
    }
       
}
