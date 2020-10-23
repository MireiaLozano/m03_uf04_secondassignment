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
public class M03_UF04_SecondAssignment {
    
    public static void main(String[] args) {
        
        CarritoDeLaCompra carrito1 = new CarritoDeLaCompra();
        carrito1.añade(new Detalle(01, 15, new Alimentos(01, "Tomate", "Tomate Solís", 1.45)));
        System.out.println(carrito1);
        
        CarritoDeLaCompra carrito2 = new CarritoDeLaCompra();
        carrito2.añade(new Detalle(02, 02, new CuidadoPersonal("Perfumeria", 02, "Colonia mujer", "Colonia de mujer marca Playboy", 6.57)));
        System.out.println(carrito2);
        
    }
}
    
