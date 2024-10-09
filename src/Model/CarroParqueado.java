package model;

/**
 * CarroParqueado simulates a parked car.
 * This class stores information about the car's brand, model, color, license plate, 
 * and the minutes it has been parked.
 */
public class CarroParqueado {
    private String marca;
    private String modelo;
    private String color;
    private String placa;
    private int minutosParqueado;

    /**
     * Constructor to initialize a parked car with the specified attributes.
     *
     * @param marca           The brand of the car.
     * @param modelo          The model of the car.
     * @param color           The color of the car.
     * @param placa           The license plate of the car.
     * @param minutosParqueado The number of minutes the car has been parked.
     */
    public CarroParqueado(String marca, String modelo, String color, String placa, int minutosParqueado) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.minutosParqueado = minutosParqueado;
    }

    // Getters for car attributes
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutosParqueado() {
        return minutosParqueado;
    }

    /**
     * Provides a string representation of the parked car with its attributes.
     */
    @Override
    public String toString() {
        return "CarroParqueado [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", placa=" + placa + "]";
    }
}
