package ru.skillfactory;

public class Tank {
    private static int count = 0;
    private final String model = "T34";
    private int positionX;
    private int positionY;
    private byte direction;
    private int fuel;
    private int num;

    public Tank() {
        this.positionX = 0;
        this.positionY = 0;
        this.fuel = 100;
        this.direction = 1;
        count++;
        this.num = count;
    }

    public Tank(int x, int y) {
        this.positionX = x;
        this.positionY = y;
        this.fuel = 100;
        this.direction = 1;
        count++;
        this.num = count;
    }

    public Tank(int x, int y, int fuel) {
        this.positionX = x;
        this.positionY = y;
        this.fuel = fuel;
        this.direction = 1;
        count++;
        this.num = count;
    }

    public void goForward(int step) {
        if (step < 0) {
            goBackward(-1 * step);
            return;
        } else {
            this.fuel -= step;
            if (this.fuel > 0) {
                move(step);
            } else {
                move(step + this.fuel);
                this.fuel = 0;
            }
        }
    }

    public void goBackward(int step) {
        if (step < 0) {
            goForward(-1 * step);
            return;
        } else {
            this.fuel -= step;
            if (this.fuel > 0) {
                move(-step);
            } else {
                move(-1 * (step + this.fuel));
                this.fuel = 0;
            }
        }

    }

    public void printPosition() {
        System.out.printf("The Tank %s-%d is at %d, %d now.\n", this.model, this.num, this.positionX, this.positionY);
    }

    private void move(int step) {
        switch (direction) {
            case 1:
                positionX += step;
                break;
            case 2:
                positionY += step;
                break;
            case 3:
                positionX -= step;
                break;
            case 4:
                positionY -= step;
                break;
        }
    }

    public void turnRight() {
        if (direction == 4)
            direction = 1;
        else
            direction++;
    }

    public void turnLeft() {
        if (direction == 1) {
            direction = 4;
        } else {
            direction--;
        }
    }


}


