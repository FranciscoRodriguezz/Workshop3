package PARQUEADERO;

public class Parqueadero {
    private Carro[][] espacios;
    private double tarifaPorHora;

    public Parqueadero(int filas, int columnas, double tarifaPorHora) {
        espacios = new Carro[filas][columnas];
        this.tarifaPorHora = tarifaPorHora;
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        if (fila < 0 || fila >= espacios.length || columna < 0 || columna >= espacios[0].length || espacios[fila][columna] != null) {
            return false; // Espacio ocupado o fuera de límites
        }
        espacios[fila][columna] = carro;
        return true;
    }

    public double cobrarPorTiempo(Carro carro, int horas) {
        return horas * tarifaPorHora;
    }

    public void mostrarEstadoParqueadero() {
        for (int fila = 0; fila < espacios.length; fila++) {
            for (int columna = 0; columna < espacios[0].length; columna++) {
                if (espacios[fila][columna] != null) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
