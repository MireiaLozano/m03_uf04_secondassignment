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
        Dispositivo sobremesa1 = new Ordenador("Lenovo", "Ordenador sobremesa con pantalla negra y torre de color negro", 1.200 );
        sobremesa1.conecta();
        sobremesa1.desconecta();
       
        Dispositivo sobremesa2 = new TerminalVenta("NetPay Smart", "Dispositivo que en un establecimiento comercial, permite el cobro con targetas de crédito o débito", 39);
        sobremesa2.conecta();
        sobremesa2.desconecta();
        
        Dispositivo mobil1 = new Tablet("Samsung Galaxy Tab A", "Tablet de la Gama Samsung A, disponible en blanco y gris, con 8 pulgadas de pantalla", 116.49);
        mobil1.conecta();
        mobil1.desconecta();
        mobil1.reset();
    }
    
}
