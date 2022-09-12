package serviceAuto;

import entidades.Auto;
import java.util.Scanner;

public class ServicioAuto {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Auto crearAuto() {

        Auto auto = new Auto();

        boolean permitido = false;

        do {
            System.out.println("Ingrese Marca del Auto");
            auto.setMarca(leer.next());
            if (auto.getMarca().equalsIgnoreCase("ford")
                    || auto.getMarca().equalsIgnoreCase("fiat")
                    || auto.getMarca().equalsIgnoreCase("toyota")
                    || auto.getMarca().equalsIgnoreCase("nissan")) {
                permitido = true;
            }
        } while (!permitido);

        do {
            System.out.println("Ingrese Patente del Auto(XX123XX)");
            auto.setPatente(leer.next());
        } while (auto.getPatente().length() != 7);
        
        System.out.println("Ingrese Kilometraje del Auto");
        auto.setKm(leer.nextInt());
        
        return auto;
    }

    public void imprimirAuto(Auto auto) {
        System.out.println(auto.toString());
    }

    public void cotizarServicio(Auto auto) {
        switch (auto.getMarca().toLowerCase()) {
            case "ford":
                if (auto.getKm() < 10000) {
                    System.out.println("EL costo del primer Service es GRATIS");
                    break;
                } else if (auto.getKm() < 20000) {
                    System.out.println("El costo del segundo Service es $10000");
                    break;
                } else if (auto.getKm() < 30000) {
                    System.out.println("El costo del tercer Service es $15000");
                    break;
                } else {
                    System.out.println("Para kilometraje mayor a 30000 km se necesita revision personalizada");
                    break;
                }
            case "fiat":
                if (auto.getKm() < 10000) {
                    System.out.println("EL costo del primer Service es GRATIS");
                    break;
                } else if (auto.getKm() < 20000) {
                    System.out.println("El costo del segundo Service es $50000");
                    break;
                } else if (auto.getKm() < 30000) {
                    System.out.println("El costo del tercer Service es $70000");
                    break;
                } else {
                    System.out.println("Para kilometraje mayor a 30000 km se necesita revision personalizada");
                    break;
                }
            case "toyota":
                if (auto.getKm() < 10000) {
                    System.out.println("EL costo del primer Service es GRATIS");
                    break;
                } else if (auto.getKm() < 20000) {
                    System.out.println("El costo del segundo Service es GRATIS");
                    break;
                } else if (auto.getKm() < 30000) {
                    System.out.println("El costo del tercer Service es $5000");
                    break;
                } else {
                    System.out.println("Para kilometraje mayor a 30000 km se necesita revision personalizada");
                    break;
                }
            case "nissan":
                if (auto.getKm() < 10000) {
                    System.out.println("EL costo del primer Service es GRATIS");
                    break;
                } else if (auto.getKm() < 20000) {
                    System.out.println("El costo del segundo Service es $18000");
                    break;
                } else if (auto.getKm() < 30000) {
                    System.out.println("El costo del tercer Service es $25000");
                    break;
                } else {
                    System.out.println("Para kilometraje mayor a 30000 km se necesita revision personalizada");
                    break;
                }
        }//fin switch

    }//fin cotizaServicio
}// fin clase Servicio
