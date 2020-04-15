
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.JButton;

public class Lista implements ActionListener{
private Peliculas peliculas;
private Modelos modelos;
   
   
       public Lista(Peliculas peliculas,Modelos modelos){
   
   this.peliculas=peliculas;
   this.modelos=modelos;
  this.peliculas.b1.addActionListener(this);
   
    
  
}
       
    @Override
    public void actionPerformed(ActionEvent ae) {
        String accion;
        accion=ae.getActionCommand();
        if (accion.equals("Piratas del caribe")) {
              ArrayList<String>peliculas1 = new ArrayList<String>();
    peliculas1.add("Piratas del caribe");
    peliculas1.add("2019");
    peliculas1.add("DIRECTOR");
    T1.setText( peliculas1);
 
        }
     
        if (accion.equals("1917")) {
              ArrayList<String>peliculas1 = new ArrayList<String>();
    peliculas1.add("1917");
    peliculas1.add("2019");
    peliculas1.add("DIRECTOR");
    T1.setText( peliculas1);
    }
    if (accion.equals("Guaso")) {
              ArrayList<String>peliculas1 = new ArrayList<String>();
    peliculas1.add("1917");
    peliculas1.add("2019");
    peliculas1.add("DIRECTOR");
    T1.setText( peliculas1);
    }
    if (accion.equals("Avengers")) {
              ArrayList<String>peliculas1 = new ArrayList<String>();
    peliculas1.add("1917");
    peliculas1.add("2019");
    peliculas1.add("DIRECTOR");
    T1.setText( peliculas1);
    }
    if (accion.equals("Capitana Marvel")) {
              ArrayList<String>peliculas1 = new ArrayList<String>();
    peliculas1.add("1917");
    peliculas1.add("2019");
    peliculas1.add("DIRECTOR");
    T1.setText( peliculas1);
    }
    if (accion.equals("Star WARD")) {
              ArrayList<String>peliculas1 = new ArrayList<String>();
    peliculas1.add("1917");
    peliculas1.add("2019");
    peliculas1.add("DIRECTOR");
    T1.setText( peliculas1);
    }
    if (accion.equals("jhon Wick")) {
              ArrayList<String>peliculas1 = new ArrayList<String>();
    peliculas1.add("1917");
    peliculas1.add("2019");
    peliculas1.add("DIRECTOR");
    T1.setText( peliculas1);
    }
    if (accion.equals("Aladdin")) {
              ArrayList<String>peliculas1 = new ArrayList<String>();
    peliculas1.add("1917");
    peliculas1.add("2019");
    peliculas1.add("DIRECTOR");
    T1.setText( peliculas1);
    }
    if (accion.equals("X-Men")) {
              ArrayList<String>peliculas1 = new ArrayList<String>();
    peliculas1.add("1917");
    peliculas1.add("2019");
    peliculas1.add("DIRECTOR");
    T1.setText( peliculas1);
    }
    if (accion.equals("Rockecman")) {
              ArrayList<String>peliculas1 = new ArrayList<String>();
    peliculas1.add("1917");
    peliculas1.add("2019");
    peliculas1.add("DIRECTOR");
    T1.setText( peliculas1);
    }
    }}

