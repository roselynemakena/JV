/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery;

import java.awt.BorderLayout;
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

        JPanel panel_b = new JPanel();

        panel_a.add(new_bakery);

        /* Types of frames
                Border
                Flow
                Box
         */
        Button border_btn = new Button();
        Button box_btn = new Button();
        Button flow_btn = new Button();
        Button button_east = new Button("EASTERN");
        Button button_west = new Button("WESTERN");
        Button button_north = new Button("NORTHERN");
        Button btn_other = new Button("Other Happy BTN");
        panel_b.add(button_east);
        panel_b.add(btn_other);
        panel_b.add(button_west);
        panel_b.add(button_north);

        frame.getContentPane().add(panel_a);
        frame.getContentPane().add(BorderLayout.EAST, panel_b);
        frame.getContentPane().add(BorderLayout.WEST, button_west);
        frame.getContentPane().add(BorderLayout.NORTH, button_north);
        frame.setSize(1100, 800);
        frame.setVisible(true);

    }

}
