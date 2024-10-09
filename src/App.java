import model.*;

import java.util.Scanner;

/**
 * Main class for the application.
 * Simulates a police officer issuing a parking ticket if a car has exceeded its paid parking time.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect police officer details
        System.out.print("Enter officer's name: ");
        String nombreOficial = scanner.nextLine();

        System.out.print("Enter officer's badge number: ");
        int numeroPlaca = scanner.nextInt();

        OficialDePolicia oficial = new OficialDePolicia(nombreOficial, numeroPlaca);

        // Collect parked car details
        System.out.print("Enter car brand: ");
        scanner.nextLine(); // Clear the buffer
        String marcaCarro = scanner.nextLine();

        System.out.print("Enter car model: ");
        String modeloCarro = scanner.nextLine();

        System.out.print("Enter car color: ");
        String colorCarro = scanner.nextLine();

        System.out.print("Enter car license plate: ");
        String placaCarro = scanner.nextLine();

        int minutosParqueado = OficialDePolicia.validarMinutos("Enter minutes the car has been parked: ", scanner);
        int minutosPagados = OficialDePolicia.validarMinutos("Enter minutes paid for parking: ", scanner);

        CarroParqueado carro = new CarroParqueado(marcaCarro, modeloCarro, colorCarro, placaCarro, minutosParqueado);
        Parquimetro parquimetro = new Parquimetro(minutosPagados);

        // Check if the parking time has expired and issue a ticket if necessary
        if (oficial.verificarTiempoExcedido(carro, parquimetro)) {
            TiqueteMulta multa = oficial.emitirMulta(carro, parquimetro);
            System.out.println(multa);
        } else {
            System.out.println("The car is within the allowed parking time.");
        }

        scanner.close();
    }
}
