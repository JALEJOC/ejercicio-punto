/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Punto;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author Santiago
 */
public class Controlador {
    private Punto arreglo[];
    
    public void dimension(String dim){
        arreglo=new Punto[Integer.parseInt(dim)];
    }
    
      public void validar(java.awt.event.KeyEvent evt) {                                
        Character c = evt.getKeyChar();
        if(c<'0'||c>'9') 
            evt.consume();
            
        // TODO add your handling code here:
    }
    
      public void ingresar(String x, String y){
          if(x.equals("")){
              System.out.println("error se inicializara conn 0");
              x="0";
          }
          if(y.equals("")){
              System.out.println("error se inicializara conn 0");
              y="0";
          }
          int i=0;
          while(arreglo[i]!=null)
              i++;
          arreglo[i]=new Punto(Integer.parseInt(x),Integer.parseInt(y));
      }
    
    public int getLLeno(){
        int b=0;
        for(Punto p1:arreglo)
            if(p1!=null)
                b++;
        return b;
    }
    
    public String imprimir(){
        String acuPuntos=" ";
        for(Punto p:arreglo){
            acuPuntos+="\n"+p.toString();
        }
        return acuPuntos;
    } 
    
    public Punto imprimirp(){
        for(Punto p:arreglo)
            return p;
        return null;
    }
      
//    public void dimensionar(String dim){
//        // int dim = Integer.parseInt(JOptionPane.showInputDialog("ingrese dimension"));
//        arreglo=new Punto[Integer.parseInt(dim)];
//    }
//    
 
    public int getDimension(){
        return arreglo.length;
    }    
    
}


















