package checkbox;

import java.awt.*;
import java.awt.event.*;

class CheckBok extends Frame implements ItemListener {
    
    Label l;
    Label answer;
    Checkbox c1, c2, c3;
//  without this one it will be select multipl   
    CheckboxGroup cbg = new CheckboxGroup();
    
   public CheckBok() {
       super("CheckBok");
       
       l = new Label("Select places");
       
       //  without cbg, false it will be select multipl 
       c1 = new Checkbox("Java", cbg, false);
       c2 = new Checkbox("C#", cbg, false);
       c3 = new Checkbox("Python", cbg, false);
       
       c1.addItemListener(this);
       c2.addItemListener(this);
       c3.addItemListener(this);
       
       answer = new Label("");
       setLayout(new FlowLayout());
       
       add(l);
       add(c1);
       add(c2);
       add(c3);
       add(answer);
       
   } 

    public void itemStateChanged(ItemEvent e) {
        String str = "";
        if (c1.getState())
            str = str + " " + c1.getLabel();
        if (c2.getState())
            str = str + " " + c2.getLabel();
        if (c3.getState())
            str = str + " " + c3.getLabel();
        if (!c1.getState() && !c2.getState() && !c3.getState())
            str = " No thing have selected  ";
        l.setText(str);
        
    }


   
}


public class CheckBox {
    
    public static void main(String[] args) {
       CheckBok c = new CheckBok();
       c.setSize(800, 600);
       c.setVisible(true);
    }
    
}
