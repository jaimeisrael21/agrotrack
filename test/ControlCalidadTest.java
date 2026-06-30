public class ControlCalidadTest {
    public static void main(String[] args) {
        verificaPromedioEntero();
        verificaPromedioDecimal();
        verificaLoteAprobado();
        verificaLoteObservado();
        verificaMuestraInvalida();

        System.out.println("Todas las pruebas pasaron.");
    }

    private static void verificaPromedioEntero() {
        assertEquals(25.0, ControlCalidad.calcularPromedio(24, 26, 25));
    }

    private static void verificaPromedioDecimal() {
        assertEquals(23.333333333333332, ControlCalidad.calcularPromedio(20, 25, 25));
    }

    private static void verificaLoteAprobado() {
        assertEquals("APROBADO_EXPORTACION", ControlCalidad.obtenerEstadoLote(25.0));
    }

    private static void verificaLoteObservado() {
        assertEquals("OBSERVADO_QA", ControlCalidad.obtenerEstadoLote(18.0));
    }

    private static void verificaMuestraInvalida() {
        try {
            ControlCalidad.calcularPromedio(24, 0, 25);
            throw new AssertionError("Se esperaba una excepcion por calibre invalido.");
        } catch (IllegalArgumentException expected) {
            assertEquals("El calibre debe estar entre 1 y 100.", expected.getMessage());
        }
    }

    private static void assertEquals(double esperado, double actual) {
        double diferencia = Math.abs(esperado - actual);
        if (diferencia > 0.0000001) {
            throw new AssertionError("Esperado: " + esperado + ", actual: " + actual);
        }
    }

    private static void assertEquals(String esperado, String actual) {
        if (!esperado.equals(actual)) {
            throw new AssertionError("Esperado: " + esperado + ", actual: " + actual);
        }
    }
}
