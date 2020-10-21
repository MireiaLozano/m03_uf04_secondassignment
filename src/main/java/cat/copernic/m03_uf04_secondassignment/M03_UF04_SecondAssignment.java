/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;

/**
 *
 * @author pep
 */
public class M03_UF04_SecondAssignment {
    
    public static void main(String[] args) {
        Sobremesa sobremesa1 = new Ordenador("Lenovo", "Ordenador sobremesa con pantalla negra y torre de color negro", 1200 );
        sobremesa1.conecta();
        System.out.println(sobremesa1);
        sobremesa1.desconecta();
       
        Sobremesa sobremesa2 = new TerminalVenta("NetPay Smart", "Dispositivo que en un establecimiento comercial, permite el cobro con targetas de crédito o débito", 39);
        sobremesa2.conecta();
        System.out.println(sobremesa2);
        sobremesa2.desconecta();
        
        Mobiles mobil1 = new Tablet("Samsung Galaxy Tab A", "Tablet de la Gama Samsung A, disponible en blanco y gris, con 8 pulgadas de pantalla", 116.49);
        mobil1.conecta();
        System.out.println(mobil1);
        mobil1.desconecta();
        mobil1.reset();
        
        Mobiles mobil2 = new Portatil("HP", "Portatil HP mini, negro y plateado con teclado con iluminacion", 450);
        mobil2.conecta();
         System.out.println(mobil2);
        mobil2.desconecta();
        mobil2.reset();
    }
}
