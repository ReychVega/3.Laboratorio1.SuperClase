
package domain;

/**
 *
 * @author grupo 5
 */
abstract class terrestre {
 //attributes
    private String modelo;
    private int placa; 
 
    public terrestre() {
    
    }

    public terrestre(String modelo, int placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }
          
    public void mostrar (){
    }

    @Override
    public String toString() {
        return  ", modelo=" + modelo + ", placa=" + placa;
    }
    
    
}
