package org.example;

public class BicicletaMontania extends Bicicleta {
    private int suspensiones;
    //Constructor
    public BicicletaMontania(String codigo, int anioFabricacion, double peso, int suspensiones) {
        super(codigo, anioFabricacion, peso);
        this.suspensiones = suspensiones;
    }
    //Getters y Setters
    public int getSuspensiones() {
        return suspensiones;
    }

    public void setSuspensiones(int suspensiones) {
        this.suspensiones = suspensiones;
    }
    //Metodos
    @Override
    public double calcularCostoMantencion() {
        double costoBase = 30000;
        if (suspensiones > 1) {
            costoBase += costoBase * 0.15; // Incremento del 15% si supera 1 suspensión
        }
        return costoBase;
    }
}

