package ru.skillfactory;

public class Cat implements Eat, Edible, Movable{
    @Override
    public void eat() {
        System.out.println("Eat someone");
    }

    @Override
    public void beEaten() {
        System.out.println("Be eaten by someone");
    }

    @Override
    public void move() {
        System.out.println("Moved somewhere");
    }
}
