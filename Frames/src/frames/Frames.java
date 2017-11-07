/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author makena
 */
public class Frames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        launchProgram one = new launchProgram();
        one.makeFrame();
        
        
  
        
    }
}
    class launchProgram {
        JFrame frame = new JFrame();
        JButton btn = new JButton("Click me!");
        JPanel panel = new JPanel();
        
        public void makeFrame(){

        
        frame.setSize(400,400);
        frame.add(btn);
        
        frame.setVisible(true);
            
        }
              
       
        
    }
    


