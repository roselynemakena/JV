/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author makena
 */
public class Bakery {

    static Button new_bakery = new Button("Fetch Text");
    static Button button_east = new Button("EASTERN");
    static Button button_west = new Button("WESTERN");
    static Button button_north = new Button("NORTHERN");
    static Button btn_other = new Button("Other Happy BTN");
    static JTextArea text_a = new JTextArea("Maken Rose");
    static  JTextArea text_b = new JTextArea("Results appear here");

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
        panel_a.add(text_a);
        panel_a.add(text_b);

        panel_a.add(new_bakery);

        /* Types of frames
                Border
                Flow
                Box
         */
        Button border_btn = new Button();
        Button box_btn = new Button();
        Button flow_btn = new Button();

        panel_b.add(button_east);
        panel_b.add(btn_other);
        panel_b.add(button_west);
        panel_b.add(button_north);

        panel_b.setLayout(new BoxLayout(panel_b, BoxLayout.Y_AXIS));

        frame.getContentPane().add(panel_a);
        panel_a.setBackground(Color.pink);
        frame.getContentPane().add(BorderLayout.EAST, panel_b);
        frame.getContentPane().add(BorderLayout.WEST, button_west);
        frame.getContentPane().add(BorderLayout.NORTH, button_north);
        frame.setSize(1100, 800);
        frame.setVisible(true);

        System.out.println(text_a.getText());
        text_a.setText("New text that has just been set");
        new_bakery.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Fetching...");
                text_b.setText(text_a.getText());
            }
        });


    }

}
