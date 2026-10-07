package org.example;

import java.util.ArrayList;
import java.util.List;

public class GestorTallerBicicletas {
    private List<Bicicleta> coleccionBicicletas;

    public GestorTallerBicicletas() {
        this.coleccionBicicletas = new ArrayList<>();
    }

    // Registrar una bicicleta e informar por consola
    public void registrarBicicleta(Bicicleta bicicleta) {
        if (bicicleta != null) {
            coleccionBicicletas.add(bicicleta);
            System.out.println("Sistema: Bicicleta con código " + bicicleta.getCodigo() + " fue incorporada correctamente.");
        }
    }

    // Buscar y retornar las bicicletas cuyo código coincida con el criterio recibido
    public Bicicleta buscarPorCodigo(String codigo) {
        for (Bicicleta b : coleccionBicicletas) {
            if (b.getCodigo().equalsIgnoreCase(codigo)) {
                return b;
            }
        }
        return null;
    }

    // Listar Bicicletas
    public void listarBicicletas() {
        System.out.println("\n--- Lista de Bicicletas Registradas ---");
        for (Bicicleta b : coleccionBicicletas) {
            System.out.println(b.toString() + " | Costo Mantención: $" + b.calcularCostoMantencion());
        }
    }
}

