package servicio;

import entidad.Fruta;
import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class FrutaServicio {

    Scanner leer;

    public FrutaServicio() {

        leer = new Scanner(System.in).useDelimiter("\n");

    }

//    public Fruta crearFruta() {

//        Fruta frutaEj = new Fruta();
//
//        System.out.println("Ingrese el nombre de la fruta: ");
//        frutaEj.setNombre(leer.next());
//
//        System.out.println("Ingrese el color de la fruta: ");
//        frutaEj.setColor(leer.next());
//
//        System.out.println("Ingrese la forma de la fruta: ");
//        frutaEj.setForma(leer.next());
//
//        System.out.println("Ingrese el sabor de la fruta: ");
//        frutaEj.setSabor(leer.next());
//
//        System.out.println("Ingrese el peso de la fruta en gramos: ");
//        frutaEj.setPeso(leer.nextDouble());
//        
//        calcularTamanio(frutaEj);
//
//        return frutaEj;
//    }

    public Fruta crearFrutaParametros(){
        
        Fruta frutaEj = new Fruta("Manzana", "Verde", "Esferico", "Dulce/Acido", "Medio", 250d);
        
        return frutaEj;
        
    }
    public void calcularTamanio(Fruta frutaEj) {

        if (frutaEj.getPeso() > 350) {

            frutaEj.setTamanio("Grande");

        } else if (frutaEj.getPeso() <= 350 && frutaEj.getPeso() >= 26) {

            frutaEj.setTamanio("Mediano");

        } else {

            frutaEj.setTamanio("Chico");

        }

    }

    public void mostrarFruta(Fruta frutaEj) {

        System.out.println(frutaEj.toString());

    }

    public void adivinar(Fruta frutaEj) {

        String frutaAdivinada;

        System.out.println("Ingrese la fruta que considera la correcta.");
        frutaAdivinada = leer.next();

        if (frutaAdivinada.equalsIgnoreCase(frutaEj.getNombre())) {

            System.out.println("Usted Acertó! Felicidades! Se ha ganado un viaje a Qatar.");

        } else {

            System.out.println("Usted se perdió la oportunidad de ver a Messi jugar un mundial por última vez.");
            System.out.println("Te quedaste comiendo " + frutaEj.getNombre());

        }

    }

    public void menu() {

        int opcion;
        Fruta frutaEj;
//        System.out.println("--------------------------------------------");
//        System.out.println("J1: Ingrese la fruta a adivinar: ");
//        frutaEj = crearFruta();
        frutaEj = crearFrutaParametros();
//        System.out.println("--------------------------------------------");

        System.out.println("J2: Adivine la fruta que ingreso J1.");
        mostrarFruta(frutaEj);
        adivinar(frutaEj);
        System.out.println("--------------------------------------------");

    }

}
