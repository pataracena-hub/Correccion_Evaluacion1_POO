package org.example;

public class BicicletaElectrica extends Bicicleta implements ConGarantiaExtendida {
    private int autonomia;
    private boolean bateriaCertificada;
    private boolean garantiaExtendidaActiva;

    // Constructor
    public BicicletaElectrica(String codigo, int anioFabricacion, double peso, int autonomia, boolean bateriaCertificada) {
        super(codigo, anioFabricacion, peso);
        this.autonomia = autonomia;
        this.bateriaCertificada = bateriaCertificada;
        this.garantiaExtendidaActiva = false; // Nace sin garantía, cumple con "marcar una vez creada"
    }

    // Getters y Setters
    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    //Metodos
    @Override
    public boolean isGarantiaExtendidaActiva() {
        return this.garantiaExtendidaActiva;
    }

    @Override
    public void activarGarantiaExtendida() {
        this.garantiaExtendidaActiva = true;
    }

    @Override
    public double calcularCostoMantencion() {
        double costoBase = 45000;
        if (!bateriaCertificada) {
            costoBase += costoBase * 0.25;
        }
        return costoBase;
    }
}
