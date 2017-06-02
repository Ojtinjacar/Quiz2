/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nombre;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author Yeison
 */
public class Nombre extends JFrame {
    
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JTextField field = new JTextField(15);
    JTextField field2 = new JTextField(15);
    JButton boton = new JButton();
    String nombre, apellido;

    public Nombre() {
        
        setTitle("Devolver nombre");
        setVisible(true);
        setSize(185, 200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        label.setText("Ingresa tu primer nombre");
        label2.setText("Ingresa tu apellido");
        boton.setText("Confirmar");
        panel.add(label);
        panel.add(field);
        panel.add(label2);
        panel.add(field2);
        panel.add(boton);
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-getSize().width/2, dim.height/2-getSize().height/2);
        
        field.setHorizontalAlignment(JTextField.CENTER);
        field2.setHorizontalAlignment(JTextField.CENTER);
        
        field.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                
            }
        });
        field2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                
            }
        });
        panel.add(boton);
        boton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                nombre = field.getText();
                apellido = field2.getText();
                label3.setText( "Hola, " + nombre + " " + apellido);
            }
        });  
//        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
//        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(label3);
        add(panel);

    }
}
