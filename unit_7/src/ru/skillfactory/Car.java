package ru.skillfactory;

public class Car {

    private String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }


    class Engine {
        boolean isWorking = false;
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        public String startStopEngine() {
            if (isWorking) {
                isWorking = false;
                return "Engine was stopped";
            } else {
                isWorking = true;
                return "Engine was started";
            }
        }
    }
}
