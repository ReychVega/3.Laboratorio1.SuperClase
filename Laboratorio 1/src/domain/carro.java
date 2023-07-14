package domain;

import javax.swing.JOptionPane;

/**
 *
 * @author reych
 */
public class carro extends terrestre {
    private String modelo;
    private int placa; 
    private int asientos;
    private int puertas;

    public carro() {
    }

    public carro(int asientos, int puertas, String modelo, int placa) {
        super(modelo, placa);
        this.asientos = asientos;
        this.puertas = puertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
       
    @Override
    public String toString() {
        String data=super.toString();
        return "carro{" + "asientos=" + asientos + ", puertas=" + puertas + data+'}';
    }

    @Override
    public void mostrar() {
        JOptionPane.showMessageDialog(null, toString());
    }

}
