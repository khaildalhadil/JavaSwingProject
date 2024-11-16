/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wsingspinner;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.event.*;
import javax.swing.event.*;

class MyFrame extends JFrame implements ChangeListener, ActionListener{
    
    JSpinner sp1, sp2;
    JLabel l;
    JComboBox list;
    
    MyFrame() {
        super("Spinner");
        
        String coffeeType[] = {"espresso☕", "latte🍵", "cappuciion☕"};
        
        l = new JLabel();
//      start, min, max, step
        sp1 = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
        sp2 = new JSpinner(new SpinnerListModel(coffeeType));
        
        sp1.addChangeListener(this);
        sp2.addChangeListener(this);
        
        list = new JComboBox(coffeeType);
        list.addActionListener(this);
        
        setLayout(new FlowLayout());
        
        add(sp1);
        add(sp2);
        add(list);
        add(l);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == sp1) {
            l.setText(sp1.getValue()+"");
        }
        if (e.getSource() == sp2) {
            l.setText(sp2.getValue()+"");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l.setText(""+ list.getSelectedItem());
    }


    
}

public class WsingSpinner {

    public static void main(String[] args) {
        
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
