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
        
           Detalle item1 =new Detalle(01, 15, new Alimentos(01, "Tomate", "Tomate Solís", 1.45));
           carritoCompra.añade(item1);
           Detalle item2 = new Detalle(02, 02, new CuidadoPersonal("Perfumeria", 02, "Colonia mujer", "Colonia de mujer marca Playboy", 6.57));
           carritoCompra.añade(item2);
           totalCompra=carritoCompra.checkout();
           
           System.out.println("Desea eliminar algún elemento de su carrito? ");
           carritoCompra.elimina(item1);
           System.out.println("De acuerdo, " +item1+ "eliminado");
           totalCompra=carritoCompra.checkout();
           
           System.out.println("De acuerdo, su precio total de la compra es: " + totalCompra);
        
    }
}
    
