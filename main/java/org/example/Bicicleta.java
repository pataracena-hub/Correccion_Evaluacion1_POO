package org.example;

public abstract class Bicicleta {
    private String codigoBicicleta;
    private int anoFabricacion;
    private double peso;
    public double costoBase;
    //Constructor
    public Bicicleta(String codigoBicicleta, int anoFabricacion, double peso, int costoBase){
        this.codigoBicicleta = codigoBicicleta;
        this.anoFabricacion = anoFabricacion;
        this.peso = peso;
        this.costoBase = costoBase;
    }
    //Getters, Setters y validaciones
    public String getCodigoBicicleta() {
        return codigoBicicleta;
    }

    public void setCodigoBicicleta(String codigoBicicleta) {
        if(codigoBicicleta == null || codigoBicicleta.isEmpty()){
            throw new IllegalArgumentException("el codigo no puede ser nulo ni vacio");
        }
        this.codigoBicicleta = codigoBicicleta;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        if(anoFabricacion < 2000 || anoFabricacion > 2026){
            throw new IllegalArgumentException("ERROR!!, el rango debe estar entre el año 2000 y 2026");
        }
        this.anoFabricacion = anoFabricacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0){
            throw new IllegalArgumentException("ERROR!!, peso debe ser mayor que cero");
        }
        this.peso = peso;
    }

    //Metodos Abstractos y Concretos

    public abstract double costoBase();
    public String toString(){
        return("Codigo_Bicicleta: "+ this.codigoBicicleta +"Año de Fabricacion: "+ this.anoFabricacion);
    }

}
