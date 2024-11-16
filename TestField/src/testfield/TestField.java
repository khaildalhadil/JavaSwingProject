package testfield;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements TextListener {
    
    TextField text;
    Label l;
    Label tital;
    
    public MyFrame() {
        super("Test Field");
        
        text = new TextField(25);
        text.addTextListener(this);
        l = new Label();
        tital = new Label("Titel");
        
        setLayout(new FlowLayout());
        
        add(tital);
        add(text);
        add(l);
        
        
    }

    public void textValueChanged(TextEvent e) {
        l.setText(" "+text.getText());
    }
}

public class TestField {

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(800, 600);
        f.setVisible(true);
    }
    
}
