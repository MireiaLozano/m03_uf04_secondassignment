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
        
        double totalCompra;
        
        CarritoDeLaCompra carritoCompra = new CarritoDeLaCompra();
        
           Detalle item1 = new Detalle(01, 15, new Alimentos(01, "Tomate", "Tomate Solís", 1.45));
           carritoCompra.añade(item1);
           Detalle item2 = new Detalle(02, 02, new CuidadoPersonal("Perfumeria", 02, "Colonia mujer", "Colonia de mujer marca Playboy", 6.57));
           carritoCompra.añade(item2);
           Detalle item3 = new Detalle(03, 03, new Bebidas("Alcohol", 04, "Puerto de indias rosa", "Botella de 50cl de puerto de indias rosa", 7.5));
           carritoCompra.añade(item3);
           Detalle item4 = new Detalle(04, 05, new Alimentos(05, "Pizza carbonara", "Pizza carbonaza marca Forno di pietra", 2.65));
           carritoCompra.añade(item4);
           Detalle item5 = new Detalle(05, 15, new Frescos(07, "San Jacobos", "San Jacobos de jamon y queso", 2.45));
           carritoCompra.añade(item5);
           Detalle item6 = new Detalle(06, 01, new Tecnologia("Mobiles", 06, "Cargador mobil", "Cargador negro para Mobil Samsung Galaxy A10", 10));
           carritoCompra.añade(item6);
          
           totalCompra=carritoCompra.checkout();
           System.out.println("");
           
           System.out.println("Desea eliminar algún elemento de su carrito? ");
           carritoCompra.elimina(item1);
           System.out.println("");
           System.out.println("De acuerdo, { " +item1+ " } eliminado");
           System.out.println("");
           totalCompra=carritoCompra.checkout();
          
           System.out.println("");
           System.out.println("De acuerdo, el precio total de su compra es de: " + totalCompra + "€");
          
        
    }
}
    
