public class Main {
    public static void main(String[] args) {
        F1Car car = new F1Car("Mercedes", "Lewis Hamilton", 350);

        int speed = car.simulateSpeed();
        System.out.println("Simulated car speed: " + speed + " km/h");
    }
}