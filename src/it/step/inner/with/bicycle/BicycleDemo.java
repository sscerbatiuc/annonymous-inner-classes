package it.step.inner.with.bicycle;

public class BicycleDemo {

    public static void main(String[] args) {
        Bicycle author = new Bicycle("Author", 200);
        Bicycle.HandleBar handleBar = author.new HandleBar();
        Bicycle.Seat seat = author.new Seat();

        seat.up(); // Reglam scaunele
        author.start();
        handleBar.left();
        handleBar.right();

        author = null;
        System.out.println(seat);

    }
}
