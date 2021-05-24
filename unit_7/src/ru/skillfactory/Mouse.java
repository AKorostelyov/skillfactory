package ru.skillfactory;

public class Mouse implements Edible, Movable{
    @Override
    public void beEaten() {
        System.out.println("Be eaten by someone");
    }

    @Override
    public void move() {
        System.out.println("Moved somewhere");
    }
}
