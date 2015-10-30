/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.UnsupportedLookAndFeelException;
import view.frmLoading;
import view.frmLogIn;
import view.frmPantallaBienvenida;
import view.frmpanelMovies;

/**
 *
 * @author _User08_
 */
public class Principal {
    
    public static void main(String[] args) {
        
        try{
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
            new frmLoading(new javax.swing.JFrame(),true).setVisible(true);
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex){
            System.out.println("No se pudo establecer el aspecto deseado " + ex.getMessage());
        }
        
    }
}
