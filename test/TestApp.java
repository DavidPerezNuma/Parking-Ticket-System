package test;

import model.*;

/**
 * TestApp class runs a series of automated test cases for the parking ticket application.
 * 
 * This class includes three test cases:
 * 1. Car within allowed parking time - No ticket should be issued.
 * 2. Car exceeded parking time by less than an hour - A fine of 25,000 pesos is expected.
 * 3. Car exceeded parking time by more than an hour - A fine of 35,000 pesos is expected.
 * 
 * Each test case prints the result, allowing for verification of the application’s correct behavior.
 */
public class TestApp {

    /**
     * Main method to execute all test cases.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println("Test Case 1: Car within allowed parking time");
        testCase1();

        System.out.println("\nTest Case 2: Car exceeded parking time by less than an hour");
        testCase2();

        System.out.println("\nTest Case 3: Car exceeded parking time by more than an hour");
        testCase3();
    }

    /**
     * Test Case 1: Validates that no ticket is issued when the car is within the allowed parking time.
     * 
     * Expected output: The car is within the allowed parking time.
     */
    public static void testCase1() {
        OficialDePolicia oficial = new OficialDePolicia("Oficial Juan", 12345);
        CarroParqueado carro = new CarroParqueado("Toyota", "Corolla", "Rojo", "ABC123", 30);
        Parquimetro parquimetro = new Parquimetro(60);

        if (oficial.verificarTiempoExcedido(carro, parquimetro)) {
            TiqueteMulta multa = oficial.emitirMulta(carro, parquimetro);
            System.out.println(multa);
        } else {
            System.out.println("Expected: The car is within the allowed parking time.");
        }
    }

    /**
     * Test Case 2: Checks that a ticket with a fine of 25,000 pesos is issued
     * when the car exceeds the paid parking time by less than an hour.
     * 
     * Expected output: A fine of 25,000 pesos and ticket details.
     */
    public static void testCase2() {
        OficialDePolicia oficial = new OficialDePolicia("Oficial María", 67890);
        CarroParqueado carro = new CarroParqueado("Honda", "Civic", "Azul", "XYZ789", 75);
        Parquimetro parquimetro = new Parquimetro(60);

        if (oficial.verificarTiempoExcedido(carro, parquimetro)) {
            TiqueteMulta multa = oficial.emitirMulta(carro, parquimetro);
            System.out.println("Expected: Fine of 25,000 pesos");
            System.out.println(multa);
        } else {
            System.out.println("The car is within the allowed parking time.");
        }
    }

    /**
     * Test Case 3: Ensures that a ticket with a fine of 35,000 pesos is issued
     * when the car exceeds the paid parking time by more than an hour.
     * 
     * Expected output: A fine of 35,000 pesos and ticket details.
     */
    public static void testCase3() {
        OficialDePolicia oficial = new OficialDePolicia("Oficial Carlos", 11223);
        CarroParqueado carro = new CarroParqueado("Ford", "Fiesta", "Blanco", "LMN456", 130);
        Parquimetro parquimetro = new Parquimetro(60);

        if (oficial.verificarTiempoExcedido(carro, parquimetro)) {
            TiqueteMulta multa = oficial.emitirMulta(carro, parquimetro);
            System.out.println("Expected: Fine of 35,000 pesos (25,000 + 10,000)");
            System.out.println(multa);
        } else {
            System.out.println("The car is within the allowed parking time.");
        }
    }
}
