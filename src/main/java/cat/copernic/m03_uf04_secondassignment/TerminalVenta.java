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
public class TerminalVenta extends Sobremesa {

    public TerminalVenta(String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
    }

    @Override
    public void desconecta() {
        System.out.println("Desconectando Terminal de Venta");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void conecta() {
        System.out.println("Terminal de Venta conectado");//To change body of generated methods, choose Tools | Templates.
    }
}
