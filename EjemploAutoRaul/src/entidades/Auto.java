package entidades;

public class Auto {
    
    public String marca;
    public String patente;
    public int km;

    public Auto() {
    }

    public Auto(String marca, String patente, int km) {
        this.marca = marca;
        this.patente = patente;
        this.km = km;
    }

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

    @Override
    public String toString() {
        return "Auto: " + "\nMarca=" + marca.toUpperCase() + "\nPatente=" + patente.toUpperCase() + "\nKm=" + km;
    }

    
    
    
}
