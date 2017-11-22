/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery;

import java.awt.Button;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author makena
 */
public class Bakery {
    static Button new_bakery = new Button("New");
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launchBakery();

    }

    static void launchBakery() {
        JFrame frame = new JFrame();
        JPanel panel_a = new JPanel();
        
        panel_a.add(new_bakery);
        
        frame.getContentPane().add(panel_a);
        frame.setSize(300, 300);
        
        frame.setVisible(true);
        

    }

}
