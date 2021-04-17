package ru.skillfactory;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        InputManager inputManager = new InputManager(calculator);

        while (calculator.status) {
            inputManager.getNextString();

        }

    }
}
