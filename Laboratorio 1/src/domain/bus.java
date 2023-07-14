
package domain;

import javax.swing.JOptionPane;

/**
 *
 * @author grupo 5
 * 
 */
public class bus extends terrestre {
    private String modelo;
    private int placa; 
    private int costo;
    private int capacidad;

  
    //constructor generico

    public bus() {
    }
    
       
    //constructor sobrecargado
    public bus(int costo, int capacidad, String modelo, int placa) {
        super(modelo, placa);
        this.costo = costo;
        this.capacidad = capacidad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
       
    @Override
      public void mostrar (){
          JOptionPane.showMessageDialog(null, toString());
      }

    @Override
    public String toString() {
        String data=super.toString();
        return "bus{" + "costo=" + costo + ", capacidad=" + capacidad + data+'}';
    }
    
            
            
}
