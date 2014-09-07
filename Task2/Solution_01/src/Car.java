public class Car extends Mechanism implements Movable {
    String model;
    public void stop() {
        System.out.println("Stop");
    }

    public void start() {
        System.out.println("Start");
    }

    public void decreaseSpeed() {
        System.out.println("Decrease speed");
    }

    public void increaseSpeed() {
        System.out.println("Increase speed");
    }
}
