public class ControlCalidad {
    private static final int CALIBRE_MINIMO = 1;
    private static final int CALIBRE_MAXIMO = 100;
    private static final double PROMEDIO_MINIMO_EXPORTACION = 20.0;
    private static final double PROMEDIO_MAXIMO_EXPORTACION = 32.0;

    public static void main(String[] args) {
        int muestra1 = obtenerMuestra(args, 0, 24);
        int muestra2 = obtenerMuestra(args, 1, 26);
        int muestra3 = obtenerMuestra(args, 2, 25);

        double promedio = calcularPromedio(muestra1, muestra2, muestra3);

        System.out.printf("Promedio de calibre del lote: %.2f%n", promedio);
        System.out.println("Estado QA: " + obtenerEstadoLote(promedio));
    }

    public static double calcularPromedio(int muestra1, int muestra2, int muestra3) {
        validarCalibre(muestra1);
        validarCalibre(muestra2);
        validarCalibre(muestra3);

        return (muestra1 + muestra2 + muestra3) / 3.0;
    }

    public static String obtenerEstadoLote(double promedio) {
        if (promedio >= PROMEDIO_MINIMO_EXPORTACION && promedio <= PROMEDIO_MAXIMO_EXPORTACION) {
            return "APROBADO_EXPORTACION";
        }

        return "OBSERVADO_QA";
    }

    private static int obtenerMuestra(String[] args, int indice, int valorPorDefecto) {
        if (args.length <= indice) {
            return valorPorDefecto;
        }

        return Integer.parseInt(args[indice]);
    }

    private static void validarCalibre(int calibre) {
        if (calibre < CALIBRE_MINIMO || calibre > CALIBRE_MAXIMO) {
            throw new IllegalArgumentException("El calibre debe estar entre 1 y 100.");
        }
    }
}
