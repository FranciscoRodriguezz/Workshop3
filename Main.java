package PARQUEADERO;





public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(5, 10, 2.5);

        Carro carro1 = new Carro("ABC123", "Toyota", "Corolla");
        Carro carro2 = new Carro("DEF456", "Honda", "Civic");
        Carro carro3 = new Carro("GHI789", "Ford", "Focus");
        Carro carro4 = new Carro("JKL012", "Chevrolet", "Malibu");
        Carro carro5 = new Carro("MNO345", "Nissan", "Altima");

        // Estacionar carros en diferentes posiciones
        parqueadero.parquearCarro(carro1, 0, 2);
        parqueadero.parquearCarro(carro2, 2, 5);
        parqueadero.parquearCarro(carro3, 1, 8);
        parqueadero.parquearCarro(carro4, 3, 1);

        // Intentar estacionar en un espacio ocupado
        if (!parqueadero.parquearCarro(carro5, 1, 8)) {
            System.out.println("No se pudo estacionar el carro5.");
        }

        // Calcular costos de estacionamiento
        double costoCarro1 = parqueadero.cobrarPorTiempo(carro1, 3);
        double costoCarro2 = parqueadero.cobrarPorTiempo(carro2, 5);
        double costoCarro4 = parqueadero.cobrarPorTiempo(carro4, 2);

        // Mostrar estado del parqueadero
        parqueadero.mostrarEstadoParqueadero();

        System.out.println("Costo para carro1: $" + costoCarro1);
        System.out.println("Costo para carro2: $" + costoCarro2);
        System.out.println("Costo para carro4: $" + costoCarro4);
    }
}


