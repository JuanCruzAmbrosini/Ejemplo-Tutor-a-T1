/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Juan Cruz
 */
public class Auto {
    
    //Definimos los atributos que va a tener el objeto.
    private String patente;
    private String marca;
    private int kilometraje;
    
    //Creamos un constructor vacío.
    public Auto() {
    }

    //Creamos un constructor que recibe los atributos del objeto (auto) como parámetro.
    public Auto(String patente, String marca, int kilometraje) {
        this.patente = patente;
        this.marca = marca;
        this.kilometraje = kilometraje;
    }

    //Creamos los "getter y setter" que nos permitiran cambiar o acceder a los atributos del objeto.
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

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    //Creamos el método "toString" que nos servira para mostrar el objeto con mayor facilidad.
    @Override
    public String toString() {
        return "Auto: \n"  + "Patente = " + patente + "\nMarca = " + marca + "\nkilometraje = " + kilometraje;
    }
    
    
    
}
