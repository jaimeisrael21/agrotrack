import java.util.Scanner;

public class ControlCalidad {
    private static final int CALIBRE_MINIMO = 1;
    private static final int CALIBRE_MAXIMO = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int muestra1 = leerCalibre(scanner, 1);
        int muestra2 = leerCalibre(scanner, 2);
        int muestra3 = leerCalibre(scanner, 3);

        int promedio = (muestra1 + muestra2 + muestra3) / 3;
        System.out.println("Promedio de calibre del lote: " + promedio);
    }

    private static int leerCalibre(Scanner scanner, int numeroMuestra) {
        int calibre;
        do {
            System.out.print("Ingrese muestra " + numeroMuestra + " de calibre (1-100): ");
            calibre = scanner.nextInt();
        } while (calibre < CALIBRE_MINIMO || calibre > CALIBRE_MAXIMO);

        return calibre;
    }
}
