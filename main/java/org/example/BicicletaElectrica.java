package org.example;

public class BicicletaElectrica extends Bicicleta {
    private double autonomiaEnKm;
    private boolean bateriaCertificada;
    private boolean garantiaExtendida = true;

    public BicicletaElectrica(String codigoBicicleta, int anoFabricacion, double peso, double autonomiaEnKm, boolean bateriaCertificada, boolean garantiaExtendida){
        super(codigoBicicleta, anoFabricacion, peso);

        this.autonomiaEnKm = autonomiaEnKm;
        this.bateriaCertificada = bateriaCertificada;
        this.garantiaExtendida = garantiaExtendida;
    }

    public double getAutonomiaEnKm() {
        return autonomiaEnKm;
    }

    public void setAutonomiaEnKm(double autonomiaEnKm) {
        this.autonomiaEnKm = autonomiaEnKm;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    public boolean isGarantiaExtendida() {
        return garantiaExtendida;
    }

    public void setGarantiaExtendida(boolean garantiaExtendida) {
        this.garantiaExtendida = garantiaExtendida;
    }

    @Override
    public double costoBase(){
        double costoBase = 45000.0;
        if(!bateriaCertificada){
            costoBase = (costoBase*1.25);
        }
        return costoBase;
    }


}
