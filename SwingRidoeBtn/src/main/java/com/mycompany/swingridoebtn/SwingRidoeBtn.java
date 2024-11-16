
package com.mycompany.swingridoebtn;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    
    JRadioButton r1, r2;
    JCheckBox c1, c2;
    JTextField tf;
    JLabel l;
    int b=0, i=0;
    
    MyFrame() {
        super("Ridoe btn");
        setLayout(new FlowLayout());

        l = new JLabel();
        
        ButtonGroup bg = new ButtonGroup();
        
        r1 = new JRadioButton("upper");
        r2 = new JRadioButton("lower");
//      to select only one item  
        bg.add(r1);
        bg.add(r2);
        
        c1 = new JCheckBox("Bold");
        c2 = new JCheckBox("Italic");
        
        tf = new JTextField("khalid", 10);
        
        r1.addActionListener(this);
        r2.addActionListener(this);
        c1.addActionListener(this);
        c2.addActionListener(this);
                
        add(r1);
        add(r2);
        add(c1);
        add(c2);
        add(tf);
        add(l);
        
    }

    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()) {
            case "lower": 
                tf.setText(tf.getText().toLowerCase());
                break;
            case "upper":
                tf.setText(tf.getText().toUpperCase());
                break;
        }
        
        
        switch(b) {
            case 1:
                tf.setFont(tf.getFont().deriveFont(Font.ITALIC, 14f));
                b = 0;
                l.setText(""+b);
            case 0:
                tf.setFont(tf.getFont().deriveFont(Font.BOLD, 14f));
                b = 1;
                l.setText(""+b);
        }
        
        if (b == 1) {
            
        } else {
            
        }
//        switch(e.getActionCommand()) {
//            case "Bold":
//                tf.setFont(tf.getFont().deriveFont(Font.BOLD, 14f));
//                b = 1;
//                break;
//            case "Italic":
//                tf.setFont(tf.getFont().deriveFont(Font.ITALIC, 14f));
//                i = 1;
//                break;
//        }
        
    }
}

public class SwingRidoeBtn {

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
