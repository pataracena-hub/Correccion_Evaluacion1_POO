package org.example;

public class BicicletaMontania extends Bicicleta {
    private double cantidadSuspension;

    public BicicletaMontania(String codigoBicicleta, int anoFabricacion, double peso, double cantidadSuspension){
        super(codigoBicicleta, anoFabricacion, peso);
        this.cantidadSuspension = cantidadSuspension;
    }

    public double getCantidadSuspension() {
        return cantidadSuspension;
    }

    public void setCantidadSuspension(double cantidadSuspension) {
        this.cantidadSuspension = cantidadSuspension;
    }

    @Override
    public double costoBase(){
        double costoBase = 30000.0;
        if(cantidadSuspension > 1){
            costoBase = (costoBase*1.15);
        }
        return costoBase;
    }

}
