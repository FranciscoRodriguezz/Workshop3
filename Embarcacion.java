package EMBARCACION;

import EMBARCACION.Capitan;

class Embarcacion {
    protected Capitan capitan;
    protected double precioBase;
    protected double valorAdicional;
    protected int anioFabricacion;
    protected double eslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public double calcularMontoAlquiler() {
        double montoAlquiler = precioBase;
        if (anioFabricacion > 2020) {
            montoAlquiler += valorAdicional;
        }
        return montoAlquiler;
    }

    // Getters y setters
    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }
}