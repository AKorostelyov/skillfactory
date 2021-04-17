package ru.skillfactory;

import java.util.Scanner;


/**
 * Класс для обработки данных, введенных из консоли
 *
 * @author Коростелев Александр
 */
public class InputManager {

    private static final String TWO_OPERANDS_COMMAND = "[(]?[-]?[0-9]{0,15}([.][0-9]{0,15})?[)]?[ ][-+/*][ ][(]?[-]?[0-9]{0,15}([.][0-9]{0,15})?[)]?";
    private static final String ONE_OPERAND_COMMAND = "[-+/*][ ][(]?[-]?[0-9]{0,15}([.][0-9]{0,15})?[)]?";
    private static final String SPECIAL_OPERATION_COMMAND = "(abs|sqr|sqrt)[(][-]?[0-9]{0,15}[)]";
    private Scanner sc;
    private Calculator calculator;

    public InputManager(Calculator calculator) {
        this.sc = new Scanner(System.in);
        this.calculator = calculator;
    }

    /**
     * Исполнение операции с двумя операндами
     *
     * @param command введенная команда
     */
    void execTwoOperandCommand(String command) {
        String[] operands = command.split("[) ]?[-*+/][ (]?");
        String operation = command.replaceAll("[(]?[-]?[0-9]*[)]?", "");

        calculator.executeOperation(
                Double.parseDouble(operands[0]),
                Double.parseDouble(operands[1]),
                operation.replaceAll(" ", "")
        );
    }

    /**
     * Исполнение операции с одним операндом
     * (вторым операндом выступает результат предыдущей команды)
     *
     * @param command введенная команда
     */
    void execOneOperandCommand(String command) {
        String operand = command.substring(1)
                .replace("(", "")
                .replace(")", "");
        String operation = command.substring(0, 1);

        calculator.executeOperation(
                Double.parseDouble(operand)
                , operation.replaceAll(" ", ""));
    }

    /**
     * Исполнение специальной операции
     *
     * @param command введенная команда
     */
    void execSpecialCommand(String command) {
        String operation = command.substring(
                0,
                command.indexOf('('));
        Double operand = Double.parseDouble(
                command.substring(
                        command.indexOf('(') + 1,
                        command.indexOf(')')
                )
        );

        switch (operation) {
            case "sqr":
                calculator.square(operand);
                break;
            case "sqrt":
                calculator.square_root(operand);
                break;
            case "abs":
                calculator.absoluteValue(operand);
                break;
            default:
                System.out.println("Operation " + operation + " is not supported!");
                break;
        }
    }

    /**
     * Получение следующей команды
     */
    public void getNextString() {
        System.out.println("Enter command");
        String command = sc.nextLine();
        switch (command) {
            case "exit":
                calculator.quit();
                System.out.println("Calculator is disabled");
                break;
            case "ce":
                calculator.reset();
                break;
            default:
                parseCommand(command);
        }
    }

    /**
     * Валидация и распознование введенной строки
     *
     * @param command введенная строка
     */
    void parseCommand(String command) {
        if (command.matches(TWO_OPERANDS_COMMAND)) {
            execTwoOperandCommand(command);
        } else if (command.matches(ONE_OPERAND_COMMAND)) {
            execOneOperandCommand(command);
        } else if (command.matches(SPECIAL_OPERATION_COMMAND)) {
            execSpecialCommand(command);
        } else {
            System.out.println("Input not valid. Please check it and enter input again");
        }
    }

}
