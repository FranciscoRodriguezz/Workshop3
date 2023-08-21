package EMBARCACION;

import EMBARCACION.Capitan;

public class Main {
    public static void main(String[] args) {
        Capitan capitan1 = new Capitan("Juan", "Perez", "123ABC");
        Velero velero1 = new Velero(capitan1, 1000, 200, 2022, 10.5, 5);

        Capitan capitan2 = new Capitan("Maria", "Gomez", "456XYZ");
        Yate yate1 = new Yate(capitan2, 2000, 300, 2023, 15.0, 8);

        System.out.println("Monto alquiler del velero: $" + velero1.calcularMontoAlquiler());
        System.out.println("El velero es grande: " + velero1.esGrande());

        System.out.println("Monto alquiler del yate: $" + yate1.calcularMontoAlquiler());
        System.out.println("Se puede comprar el yate: " + yate1.sePuedeComprar());
    }
}

