package model;

import java.util.Scanner;

/**
 * OficialDePolicia simulates a police officer who inspects parked cars.
 * This class allows the officer to verify if a car has exceeded its paid parking time 
 * and issue a ticket if necessary.
 */
public class OficialDePolicia {
    private String nombre;
    private int numeroPlaca;

    /**
     * Constructor to initialize the police officer with a name and badge number.
     *
     * @param nombre      The name of the police officer.
     * @param numeroPlaca The badge number of the police officer.
     */
    public OficialDePolicia(String nombre, int numeroPlaca) {
        this.nombre = nombre;
        this.numeroPlaca = numeroPlaca;
    }

    /**
     * Checks if the car has exceeded the paid parking time.
     *
     * @param carro       The parked car.
     * @param parquimetro The parking meter with the paid time.
     * @return true if the car exceeded the paid parking time, false otherwise.
     */
    public boolean verificarTiempoExcedido(CarroParqueado carro, Parquimetro parquimetro) {
        return carro.getMinutosParqueado() > parquimetro.getMinutosPagados();
    }

    /**
     * Issues a parking ticket if the car has exceeded the paid parking time.
     *
     * @param carro       The parked car.
     * @param parquimetro The parking meter.
     * @return A TiqueteMulta object representing the issued ticket.
     */
    public TiqueteMulta emitirMulta(CarroParqueado carro, Parquimetro parquimetro) {
        int minutosIlegales = carro.getMinutosParqueado() - parquimetro.getMinutosPagados();
        return new TiqueteMulta(carro, this, minutosIlegales);
    }

    /**
     * Provides a string representation of the police officer, including name and badge number.
     */
    @Override
    public String toString() {
        return "Oficial [nombre=" + nombre + ", numeroPlaca=" + numeroPlaca + "]";
    }

    /**
     * Validates that the entered minutes are greater than or equal to zero.
     *
     * @param mensaje The prompt message to display to the user.
     * @param scanner The Scanner object to read user input.
     * @return A valid number of minutes entered by the user.
     */
    public static int validarMinutos(String mensaje, Scanner scanner) {
        int minutos;
        do {
            System.out.print(mensaje);
            minutos = scanner.nextInt();
            if (minutos < 0) {
                System.out.println("Error: Minutes must be greater than or equal to 0.");
            }
        } while (minutos < 0);
        return minutos;
    }
}
