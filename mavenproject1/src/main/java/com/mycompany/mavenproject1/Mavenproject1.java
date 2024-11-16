
package com.mycompany.mavenproject1;

import java.awt.*;
import java.awt.event.*;

public class Mavenproject1 extends Frame implements ActionListener {
    
    int counter = 0;
    Label label;
    Button btn;
    
    public Mavenproject1 {
        super("Button Demo");
//        Frame f = new Frame("Khalid");
        setLayout(new FlowLayout());
        
        label = new Label(" "+ counter);
        btn = new Button("Click");
        btn.addActionListener(this);
        btn.setBackground(Color.DARK_GRAY);
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Arial", Font.BOLD, 14));
        btn.setSize(100, 80);
        btn.setBounds(150, 50, 100, 70);
        
        add(label);
        add(btn);
        setSize(800, 600);
        setVisible(true);
    }

//  action event here will action but for how this event ??? btn 
    public void actionPerformed(ActionEvent e) {
        counter++;
        label.setText(""+counter);
    }
}