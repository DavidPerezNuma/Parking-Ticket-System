package model;

/**
 * Parquimetro simulates a parking meter.
 * This class stores the number of minutes paid for parking.
 */
public class Parquimetro {
    private int minutosPagados;

    /**
     * Constructor to initialize the parking meter with the paid parking time.
     *
     * @param minutosPagados The number of minutes paid for parking.
     */
    public Parquimetro(int minutosPagados) {
        this.minutosPagados = minutosPagados;
    }

    // Getter for paid parking minutes
    public int getMinutosPagados() {
        return minutosPagados;
    }
}
