import java.util.Scanner;

public class ControlCalidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese muestra 1 de calibre: ");
        int muestra1 = scanner.nextInt();
        System.out.print("Ingrese muestra 2 de calibre: ");
        int muestra2 = scanner.nextInt();
        System.out.print("Ingrese muestra 3 de calibre: ");
        int muestra3 = scanner.nextInt();

        int promedio = (muestra1 + muestra2 + muestra3) / 3;
        System.out.println("Promedio de calibre del lote: " + promedio);
    }
}
