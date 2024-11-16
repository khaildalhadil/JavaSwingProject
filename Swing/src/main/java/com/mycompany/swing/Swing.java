
package com.mycompany.swing;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.*;
import javax.swing.text.NumberFormatter;

class MyFrame extends JFrame {
    
    JButton btn;
    JButton cBtn;
    JLabel l;
    int counter = 0;
    JLabel show;
    
    MyFrame(){
        super("JFrame Swing");
        
        btn = new JButton("Add one");
        l = new JLabel(""+counter);
        cBtn = new JButton("Clear");
        
        NumberFormat nf = NumberFormat.getInstance();
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setMaximum(100);
        nft.setMinimum(-1);
        nft.setAllowsInvalid(false);
        JFormattedTextField n = new JFormattedTextField(nft);
        n.setColumns(15);

        
        
//      add key press event in all root page for btn button  
        getRootPane().setDefaultButton(btn);
        
//        btn.setIcon(new ImageIcon("C:\\Users\\khail\\Downloads\\25434-6-save-button-file-thumb.png"));

        btn.addActionListener((e) -> {
            counter++;
            l.setText(""+ counter);
        });
        
        cBtn.addActionListener((e) -> {
            n.setText("0");
        });
        
        setLayout(new FlowLayout());
        
        add(l);
        add(btn);
        add(n);
        add(cBtn);

        
        
    }
}

public class Swing {

    public static void main(String[] args) {
        
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
