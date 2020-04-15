import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
//import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JButton;
//import javax.swing.JDialog;//para no maximizar la ventada
import javax.swing.JFrame;//para maximizar la ventana
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
 
import javax.swing.JLabel;
import javax.swing.JPanel;
public  class Peliculas  extends   JFrame implements ActionListener { /*KeyListener para el teclado, MouseListener para el mouse*/
 //es que ud al decirle que extiende de un jframe el ya entiende que tiene un panel
    
    public JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
public JTextField t1;

//qie ñe hace falta?que esta haciendo?uff mk jajaja tengo q el usuario escoja una peliculas y muestra la inform
//con bd o archivos ???enno ahi mismo ahh en listas sisas
public Peliculas() {// Agregamos estas instancias al ArrayList con el método add 

        setBounds(500, 200,500, 500);//x, y, ancho, alto
        setLayout(new FlowLayout());
    
        //Instancias
  ArrayList<String>peliculas1 = new ArrayList<String>();
    peliculas1.add("Piratas del caribe");
    peliculas1.add("1917");
    peliculas1.add("Guason");
    peliculas1.add("Avengers");
    peliculas1.add("Capitana Marvel");
    peliculas1.add("Star Wars");
    peliculas1.add("Jonh wick 3");
    peliculas1.add("Aladdin");
    peliculas1.add("X-Men");
    peliculas1.add("Rocketman");
    l1=new JLabel("peliculas 1");

          b1 = new JButton(peliculas1.get(0));  
        

     b2 = new JButton(peliculas1.get(1));  
       b3 = new JButton(peliculas1.get(2));
         b4 = new JButton(peliculas1.get(3));
         b5 = new JButton(peliculas1.get(4));
         b6 = new JButton(peliculas1.get(5));
         b7 = new JButton(peliculas1.get(6));
         b8 = new JButton(peliculas1.get(7));
         b9= new JButton(peliculas1.get(8));
         b10 = new JButton(peliculas1.get(9));
          t1=new JTextField(40);
          add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
    add(l1);
  add(t1);
        
        setVisible(true);//para hacerlo visible
    }

    @Override
    public void actionPerformed(ActionEvent ae) {


 
    }
}
        
        
    
