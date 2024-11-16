package com.mycompany.listbox;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener {
    
    List list;
    Choice c;
    Label text;
    Button btn;
    
    MyFrame() {
        super("Hi");
//      4 it means 4 row and true it mean you can chose mulit items
//      if you put flase it means you can only chose one itme
        list = new List(4, true);
        c = new Choice();
        list.add("java");
        list.add("C#");
        list.add("Python");
        
        c.add("Male");
        c.add("feMale");
        
        btn = new Button("Show");
        text = new Label();
        
        btn.addActionListener(this);
        
        setLayout(new FlowLayout());
        add(list);
        add(c);
        add(btn);
        add(text);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = "" + c.getSelectedItem();
        text.setText(str);
    }
}

public class ListBox {

    public static void main(String[] args) {
       MyFrame f = new MyFrame();
       f.setSize(800, 600);
       f.setVisible(true);        
    }
}
