package ru.skillfactory;

public class TankLinear {
    private int position;

    public TankLinear() {
        this.position = 0;
    }

    public void goForward(int step) {
        this.position += step;
    }

    public void goBackward(int step) {
        this.position -= step;
    }

    public void printPosition() {
        System.out.printf("The Tank is at %s now.\n", this.position);
    }
}
