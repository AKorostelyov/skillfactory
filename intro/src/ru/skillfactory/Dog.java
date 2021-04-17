package ru.skillfactory;

public class Dog {
    private final double originWeight;
    private double weight;

    public Dog() {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Dog(double weight) {
        this.weight = weight;
        this.originWeight = weight;

    }

    public void woof() {
        weight = weight - 1;
        System.out.println("woof");
        System.out.println("Dog suddenly lose one gram from it's weight");
    }

    public void feed(Double amount) {
        System.out.printf("Собака кушает %.2f %n", amount);
        weight = weight + amount;
    }

    public void drink(Double amount) {
        System.out.printf("Собака пьет %.2f %n", amount);
        weight = weight + amount;
    }

    public void pee() {
        weight = weight - 10;
        System.out.println("Clean it, man!");
    }

    public double getWeight() {
        return weight;
    }
}
