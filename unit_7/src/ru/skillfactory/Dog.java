package ru.skillfactory;

public class Dog implements Movable, Eat{
    @Override
    public void eat() {
        System.out.println("Eat someone");
    }

    @Override
    public void move() {
        System.out.println("Moved somewhere");
    }
}
