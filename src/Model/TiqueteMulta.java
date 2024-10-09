package model;

/**
 * TiqueteMulta simulates a parking ticket issued for a parked car that exceeded the paid time limit.
 * This class calculates the fine based on the over-parking time and stores information about the car and the issuing officer.
 */
public class TiqueteMulta {
    private CarroParqueado carro;
    private OficialDePolicia oficial;
    private double multa;

    /**
     * Constructor to initialize a parking ticket with the parked car, issuing officer, 
     * and the minutes the car has been parked illegally.
     *
     * @param carro          The parked car that exceeded the paid parking time.
     * @param oficial        The police officer issuing the ticket.
     * @param minutosIlegales The minutes the car has been illegally parked.
     */
    public TiqueteMulta(CarroParqueado carro, OficialDePolicia oficial, int minutosIlegales) {
        this.carro = carro;
        this.oficial = oficial;
        this.multa = calcularMulta(minutosIlegales);
    }

    /**
     * Calculates the fine based on the minutes the car has been parked illegally.
     *
     * @param minutosIlegales The minutes the car has been parked illegally.
     * @return The calculated fine amount.
     */
    private double calcularMulta(int minutosIlegales) {
        if (minutosIlegales <= 60) {
            return 25000;
        }
        int horasAdicionales = (minutosIlegales - 60) / 60 + 1;
        return 25000 + (horasAdicionales * 10000);
    }

    /**
     * Provides a string representation of the parking ticket, including car and officer details, and the fine amount.
     */
    @Override
    public String toString() {
        return "TiqueteMulta:\n" + carro + "\nOficial: " + oficial + "\nMulta: " + multa;
    }
}
