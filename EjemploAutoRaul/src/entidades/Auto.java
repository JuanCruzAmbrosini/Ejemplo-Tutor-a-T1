package entidades;

public class Auto {
    private String marca;
    private String patente;
    private int km;

// inicio constructor vacio    
    public Auto() {
    }

// inicio constructor con datos    
    public Auto(String marca, String patente, int km) {
        this.marca = marca;
        this.patente = patente;
        this.km = km;
    }

// Inicio Getter y Setters    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

// metodo toString para mostrar en pantalla     
    @Override
    public String toString() {
        return "Auto: " + "\nMarca=" + marca.toUpperCase() + "\nPatente=" + patente.toUpperCase() + "\nKm=" + km ;
    }
    
}//fin clase
