/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_es;

import interfacegrafica.Login;
import javax.swing.JFrame;

/**
 *
 * @author Lorena
 */
public class Trabalho_ES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Login lg = new Login();
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lg.setSize(400, 300);
        lg.setResizable(false);
        lg.setVisible(true);
    }
    
}
