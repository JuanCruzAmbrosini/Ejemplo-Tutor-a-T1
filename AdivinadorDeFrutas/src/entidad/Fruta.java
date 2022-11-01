
package entidad;

/**
 *
 * @author Juan Cruz
 */
public class Fruta {
    
    private String nombre;
    private String color;
    private String forma;
    private String sabor;
    private String tamanio;
    private Double peso;

    public Fruta() {
    }

    public Fruta(String nombre, String color, String forma, String sabor, String tamanio, Double peso) {
        this.nombre = nombre;
        this.color = color;
        this.forma = forma;
        this.sabor = sabor;
        this.tamanio = tamanio;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return "Fruta:\nColor = " + color + "\nForma = " + forma + "\nSabor = " + sabor + "\nTamaño = " + tamanio+ "\nPeso = " + peso + " gr";
    }
    
        
}
