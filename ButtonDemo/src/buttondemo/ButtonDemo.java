package buttondemo;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener {
    
    int count = 0;
    Label l;
    Button btn;
    
    public MyFrame() {
        super("Titel");
        l = new Label(" " + count);
        btn = new Button("Add One");
        
        btn.addActionListener(this);
        
        setLayout(new FlowLayout());
        
        add(l);
        add(btn);
        

    }

//  what will do after btn clicked   
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText(" "+ count);
    }
}

public class ButtonDemo  {

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(600, 700);
        f.setVisible(true);
    }
    
}
