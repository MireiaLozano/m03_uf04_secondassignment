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
public class CuidadoPersonal extends Item{
        private String nombreItem;
        private String tipoItem;

    public CuidadoPersonal(String nombreItem, String tipoItem, int idItem, String nombre, String descripcion, double precio) {
        super(idItem, nombre, descripcion, precio);
        this.nombreItem = nombreItem;
        this.tipoItem = tipoItem;
    }

  
}
