/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Pablo
 */
public class auto {
    
    private String patente;
    private String marca;
    private int km;

    public auto() {
    }

    public auto(String patente, String marca, int km) {
        this.patente = patente;
        this.marca = marca;
        this.km = km;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "auto{" + "patente=" + patente + ", marca=" + marca + ", km=" + km + '}';
    }
    
}
