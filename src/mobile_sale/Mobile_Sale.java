/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobile_sale;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Azeem
 */
public class Mobile_Sale {
    Mobile_Sale(){
    JFrame frame=new JFrame(); 
    frame.setSize(new Dimension(1000,700));
    frame.setDefaultCloseOperation(3);
    frame.setVisible(true);
    DragandDrop dd=new DragandDrop(); 
    frame.setLayout(null);
    frame.add(dd).setBounds(0, 0, 800, 600);
    frame.getRootPane().updateUI();
    
    }
int no=1000; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //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
        System.out.println("Hi this is my first programe. ");
        new Mobile_Sale(); 
    }
    
}
