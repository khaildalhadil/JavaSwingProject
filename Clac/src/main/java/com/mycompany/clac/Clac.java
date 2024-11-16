

package com.mycompany.clac;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends Frame implements ActionListener {
    Button btn;
    Label l;
    TextField num1;
    TextField num2;
    
    MyFrame() {
        
        btn = new Button("Click");
        l = new Label("Enter Two numbers to sum them");
        num1 = new TextField(10);
        num2 = new TextField(10);
        
        btn.addActionListener(this);
        
        setLayout(new FlowLayout());
        
        add(l);
        add(num1);
        add(num2);
        add(btn);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        int total = n1 + n2;
        
        l.setText(""+total);
        
    }
}

public class Clac {

    public static void main(String[] args) {
        
        MyFrame f = new MyFrame();
        f.setSize(700, 500);
        f.setVisible(true);
        
    }
}
