/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment.exercicilliure;

import java.util.ArrayList;

/**
 *
 * @author pep
 */
public class CarritoDeLaCompra implements Finalizable {
    
    private ArrayList<Detalle> carrito = new ArrayList<>();
    
    
    public void añade(Detalle detalle) {
        carrito.add(detalle);
    }
    
    public void elimina(Detalle detalle) {
        carrito.remove(detalle);
    }

    @Override
    public double checkout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
