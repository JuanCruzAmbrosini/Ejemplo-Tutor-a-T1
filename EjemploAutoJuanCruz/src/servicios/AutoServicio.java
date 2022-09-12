/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Auto;
import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class AutoServicio {

    Scanner leer;

    public AutoServicio() {

        leer = new Scanner(System.in).useDelimiter("\n");

    }

    
    
    
    //Cramos el método "crearAuto" que nos retornará un objeto de la clase "Auto".
    public Auto crearAuto() {

        
        
        Auto autoEj = new Auto();     //Instanciamos un objeto de la clase "Auto" dentro del método. Será nuestro retorno

        
        
        //Le pedimos al usuario que ingrese los datos del vehículo y se los asignamos al los atributos del objeto "autoEj".
        System.out.println("Ingrese la patente del vehículo.");
        autoEj.setPatente(leer.next());     //Utilizamos el "setter" para asignarle un nuevo valor al atributo "patente"

        
        
        //Creamos un controlador para que el usuario no ingrese una marca incorrecta
        System.out.println("Ingrese la marca del vehículo.");
        do {

            autoEj.setMarca(leer.next().toLowerCase());

            if (!autoEj.getMarca().equalsIgnoreCase("Fiat") && !autoEj.getMarca().equalsIgnoreCase("Audi") && !autoEj.getMarca().equalsIgnoreCase("Ferrari")) {

                System.out.println("Lamentablemente, aún no trabajamos con esa marca. Intentelo nuevamente.");

            }

        } while (!autoEj.getMarca().equalsIgnoreCase("Fiat") && !autoEj.getMarca().equalsIgnoreCase("Audi") && !autoEj.getMarca().equalsIgnoreCase("Ferrari"));

        
        
        System.out.println("Ingrese el kilometraje del vehículo.");
        autoEj.setKilometraje(leer.nextInt());

        //El método "crearAuto" retorna el objeto da la clase "Auto"  autoEj. 
        return autoEj;

    }
    
    
    
    
    //Creamos un método que recibe un objeto perteneciente a la clase "Auto" para calcular el precio total del service.
    public void calcularPrecio(Auto autoEj) {
        
        
        
        double precioMarca = 0;     //Establecemos una variable que contendrá el precio base para cada una de las marcas.  
        
        
        
        //Establecemos el precio para cada una de las marcas teniendo en cuenta el kilometraje.
        switch (autoEj.getMarca()) {

            case "fiat" :
                
                precioMarca = 15000;
                
                asignarPrecio(autoEj, precioMarca);
                
                break;
                
            case "audi" :
                
                precioMarca = 30000;
                
                 asignarPrecio(autoEj, precioMarca);
                 
                 break;
                
            case "ferrari" :
                
                precioMarca = 60000;
                
                asignarPrecio(autoEj, precioMarca);
                
        }
    }
    
    
    
    
    //Creamos un método auxiliar que nos ayuda a no repetir código. Recibe por parámetro a un objeto de la clase "Auto" y a una variable tipo double.
    public void asignarPrecio(Auto autoEj, double precioMarca) {
        
        double precioTotal = 0;
        
        if ( autoEj.getKilometraje() < 10000 ){
                    
                    precioTotal = 0;
                    
                } else if ( autoEj.getKilometraje() >= 10000 && autoEj.getKilometraje() < 20000){
                    
                    precioTotal = precioMarca;
                    
                }else if ( autoEj.getKilometraje() >= 20000 && autoEj.getKilometraje() < 30000){
                    
                    precioTotal = precioMarca + ( precioMarca * 0.15 );     //Dependiendo del kilometraje, añadiremos un costo adicional porcentual basado en el precio base
                    
                }else if ( autoEj.getKilometraje() >= 30000 && autoEj.getKilometraje() < 40000){
                    
                    precioTotal = precioMarca + ( precioMarca * 0.25 );     //Dependiendo del kilometraje, añadiremos un costo adicional porcentual basado en el precio base
                    
                } else {
                    
                    precioTotal = precioMarca + ( precioMarca * 0.40 );
           }
        
        
        
        //Mostramos el precio final del service.
        if ( precioTotal == 0 ){
                    
                    System.out.println("Antes de los 10000 km el primer service es... gratis!");
                    
                } else {
                    
                    System.out.println("El costo del service es de: $" + precioTotal);
        }
    }
    
    
    
    
    //Creamos un método que recibe por parámetro al objeto para mostrarlo por consola.
    public void mostrarAuto ( Auto autoEj ){
        
        System.out.println( autoEj );
        
    }
    
    
    
    
    //Creamos un método para mostrar las marcas.
    public void mostrarMarcas ( ) {
        
        System.out.println("Nuestras marcas: \n-Fiat\n-Audi\n-Ferrari");
        
    }
}
