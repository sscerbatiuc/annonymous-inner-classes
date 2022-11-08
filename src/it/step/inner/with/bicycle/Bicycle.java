package it.step.inner.with.bicycle;

public class Bicycle {

    private String model;
    private int weight;

    public Bicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Start!");
    }

    public class HandleBar {

        public void right() {
            System.out.println("La dreapta!");
        }

        public void left() {

            System.out.println("La stanga!");
        }
    }

    public class Seat {

        public void up() {

            System.out.println("Ridica scaunul in sus!");
        }

        public void down() {

            System.out.println("Coboara scaunul!");
        }
    }
}