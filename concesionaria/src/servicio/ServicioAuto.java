package servicio;

import entidad.Auto;
import java.util.Scanner;

public class ServicioAuto {

    public Auto crearAuto() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Auto auto = new Auto();
        boolean permitido = false;

        do {
            System.out.println("Ingrese Marca del Auto");
            auto.setMarca(leer.next().toLowerCase());

            if (auto.getMarca().equals("ford") || auto.getMarca().equals("fiat")
                    || auto.getMarca().equals("toyota") || auto.getMarca().equals("nissan")) {
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
        System.out.println(auto);
    }

    public void cotizarServicio(Auto auto) {
        switch (auto.getMarca()) {
            case "ford":
                if (auto.getKm() < 10000) {
                    System.out.println("EL costo del primer Service es GRATIS");
                } else if (auto.getKm() < 20000) {
                    System.out.println("El costo del segundo Service es $10000");
                } else if (auto.getKm() < 30000) {
                    System.out.println("El costo del tercer Service es $15000");
                } else {
                    System.out.println("Para kilometraje mayor a 30000 km se necesita revision personalizada");
                }
                break;
            case "fiat":
                if (auto.getKm() < 10000) {
                    System.out.println("EL costo del primer Service es GRATIS");
                } else if (auto.getKm() < 20000) {
                    System.out.println("El costo del segundo Service es $50000");
                } else if (auto.getKm() < 30000) {
                    System.out.println("El costo del tercer Service es $70000");
                } else {
                    System.out.println("Para kilometraje mayor a 30000 km se necesita revision personalizada");
                }
                break;
            case "toyota":
                if (auto.getKm() < 10000) {
                    System.out.println("EL costo del primer Service es GRATIS");
                } else if (auto.getKm() < 20000) {
                    System.out.println("El costo del segundo Service es GRATIS");
                } else if (auto.getKm() < 30000) {
                    System.out.println("El costo del tercer Service es $5000");
                } else {
                    System.out.println("Para kilometraje mayor a 30000 km se necesita revision personalizada");
                }
                break;
            case "nissan":
                if (auto.getKm() < 10000) {
                    System.out.println("El costo del primer service es GRATIS");
                } else if (auto.getKm() < 20000) {
                    System.out.println("El costo del segundo service es $18000");
                } else if (auto.getKm() < 30000) {
                    System.out.println("El costo del tercer service es $25000");
                } else {
                    System.out.println("Para kilometraje mayor a 30000 km se necesita revision personalizada");
                }
                break;
        }
    }
}
