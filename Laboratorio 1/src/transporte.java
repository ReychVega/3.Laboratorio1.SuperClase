
import domain.bus;
import domain.carro;
import javax.swing.JOptionPane;

/**

 * @author grupo 5
 */
public class transporte {

    /**
     * @param args the command line arguments
     
   */
    public static void main(String[] args) {

       //datos del carro 
        int puertas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de puertas del carro"));
        int asientos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de asientos del carro"));
        int placa=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la placa del carro"));
        String modelo=JOptionPane.showInputDialog("Ingrese el modelo del carro");
       
       carro car  =new carro(asientos, puertas, modelo, placa);
       car.mostrar();
       
        //datos del bus
       modelo=JOptionPane.showInputDialog("Ingrese el modelo del bus");
       placa=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la placa del bus"));
       int costo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del bus"));
       int capacidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del bus"));

       bus bus=new bus(costo, capacidad, modelo, placa);
       bus.mostrar();
 
     
       
    }
 
}
