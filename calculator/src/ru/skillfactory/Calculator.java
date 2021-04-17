package ru.skillfactory;

/**
 * Класс для проведения вычислений
 *
 * @author Коростелев Александр
 */
public class Calculator {

    public boolean status;

    private double lastResult;

    public Calculator() {
        status = true;
        System.out.println("***Calculator is ready***");
    }

    /**
     * Вычисление результата операции с двумя операндами
     *
     * @param operand1  первый операнд
     * @param operand2  второй операнд
     * @param operation операция
     */
    public void executeOperation(double operand1, double operand2, String operation) {
        switch (operation) {
            case "+":
                this.lastResult = operand1 + operand2;
                break;
            case "-":
                this.lastResult = operand1 - operand2;
                break;
            case "*":
                this.lastResult = operand1 * operand2;
                break;
            case "/":
                if (operand2 == 0.0) {
                    System.out.println("Dividing to 0.0 is not legal operation. Please repeat input with correct operands");
                } else {
                    this.lastResult = operand1 / operand2;
                }
                break;
            default:
                System.out.println("Operation " + operation + " is not supported!");
                break;
        }

        System.out.println("Result: " + lastResult);
    }

    /**
     * Вычисление результата операции с одним операндом
     *
     * @param operand   операнд
     * @param operation операция
     */
    public void executeOperation(double operand, String operation) {
        if (lastResult != 0) {
            switch (operation) {
                case "+":
                    this.lastResult = lastResult + operand;
                    break;
                case "-":
                    this.lastResult = lastResult - operand;
                    break;
                case "*":
                    this.lastResult = lastResult * operand;
                    break;
                case "/":
                    if (operand == 0.0) {
                        System.out.println("Dividing to 0.0 is not legal operation. Please repeat input with correct operands");
                    } else {
                        this.lastResult = lastResult / operand;
                    }
                    break;
                default:
                    System.out.println("Operation " + operation + " is not supported!");
                    break;
            }
            System.out.println("Result: " + lastResult);
        } else {
            System.out.println("Last result is empty. Please input two operands");
        }
    }

    /**
     * Вычисление квадрата числа
     *
     * @param operand операнд
     */
    public void square(Double operand) {
        lastResult = Math.pow(operand, 2);
        System.out.println("Result: " + lastResult);
    }

    /**
     * Вычисление квадратного корня числа
     *
     * @param operand операнд
     */
    public void square_root(Double operand) {
        lastResult = Math.sqrt(operand);
        System.out.println("Result: " + lastResult);
    }

    /**
     * Получение модуля числа
     *
     * @param operand операнд
     */
    public void absoluteValue(Double operand) {
        lastResult = Math.abs(operand);
        System.out.println("Result: " + lastResult);
    }

    /**
     * Выключение калькулятора
     */
    public void quit() {
        status = false;
    }

    /**
     * Сброс полученных результатов
     */
    public void reset() {
        lastResult = 0;
        System.out.println("Previous results was vanished");
    }


}
