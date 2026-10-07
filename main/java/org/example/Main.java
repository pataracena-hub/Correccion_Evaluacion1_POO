package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear el gestor del taller
        GestorTallerBicicletas gestor = new GestorTallerBicicletas();

        System.out.println("=== Instanciando Bicicletas ===");

        // 1. Bicicleta Eléctrica BIC-E01 (Batería certificada: No)
        BicicletaElectrica be1 = new BicicletaElectrica("BIC-E01", 2023, 22.5, 60, false);
        // Marcar con garantía extendida una vez creada
        be1.activarGarantiaExtendida();

        // 2. Bicicleta Eléctrica BIC-E02 (Batería certificada: Si)
        BicicletaElectrica be2 = new BicicletaElectrica("BIC-E02", 2022, 24.0, 45, true);

        // 3. Bicicleta de Montaña BIC-M01 (Suspensiones: 2)
        BicicletaMontania bm1 = new BicicletaMontania("BIC-M01", 2021, 13.5, 2);

        // 4. Bicicleta de Montaña BIC-M02 (Suspensiones: 1)
        BicicletaMontania bm2 = new BicicletaMontania("BIC-M02", 2020, 12.0, 1);

        System.out.println("\n=== Registrando Bicicletas en el Gestor ===");
        gestor.registrarBicicleta(be1);
        gestor.registrarBicicleta(be2);
        gestor.registrarBicicleta(bm1);
        gestor.registrarBicicleta(bm2);

        // Mostrar todas las bicicletas
        gestor.listarBicicletas();

        System.out.println("\n=== Demostración de Búsqueda por Código ===");
        String codigoBuscado = "BIC-E01";
        Bicicleta encontrada = gestor.buscarPorCodigo(codigoBuscado);
        if (encontrada != null) {
            System.out.println("Resultado de búsqueda para '" + codigoBuscado + "': " + encontrada);
            if (encontrada instanceof ConGarantiaExtendida) {
                ConGarantiaExtendida ge = (ConGarantiaExtendida) encontrada;
                System.out.println("¿Tiene Garantía Extendida Activa?: " + (ge.isGarantiaExtendidaActiva() ? "Sí" : "No"));
            }
        } else {
            System.out.println("No se encontró ninguna bicicleta con el código: " + codigoBuscado);
        }

        // Ejemplo de validación (Prueba de excepción)
        System.out.println("\n=== Prueba de Validación (Excepción esperada) ===");
        try {
            // Intento crear una bicicleta con año inválido (fuera de 2000-2026)
            BicicletaMontania error = new BicicletaMontania("BIC-ERROR", 1999, 10.0, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada correctamente: " + e.getMessage());
        }
    }
}
