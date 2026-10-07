package org.example;

public abstract class Bicicleta {
    private String codigo;
    private int anioFabricacion;
    private double peso;

    //Constructor
    public Bicicleta(String codigo, int anioFabricacion, double peso) {
        this.codigo = codigo;
        this.anioFabricacion = anioFabricacion;
        this.peso = peso;
    }
    //Metodos Getter y Setters con Validaciones correspondientes

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código de la bicicleta no puede ser nulo ni vacío.");
        }
        this.codigo = codigo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        if (anioFabricacion < 2000 || anioFabricacion > 2026) {
            throw new IllegalArgumentException("ERROR!!! El año de fabricación debe encontrarse en el rango entre 2000 y 2026.");
        }
        this.anioFabricacion = anioFabricacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser un valor mayor que cero.");
        }
        this.peso = peso;
    }

    public abstract double calcularCostoMantencion();

    @Override
    public String toString() {
        return "Bicicleta [Código: " + codigo + ", Año: " + anioFabricacion + "]";
    }
}
