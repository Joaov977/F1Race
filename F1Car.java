import java.util.Random;

class F1Car {
    private String team;
    private String driver;
    private int topSpeed;

    public F1Car(String team, String driver, int topSpeed) {
        this.team = team;
        this.driver = driver;
        this.topSpeed = topSpeed;
    }

    public String getTeam() {
        return team;
    }

    public String getDriver() {
        return driver;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int simulateSpeed() {
        Random rand = new Random();
        // A velocidade é aleatória entre 80% e 100% da velocidade máxima do carro
        return (int) (rand.nextDouble() * 0.2 * topSpeed + 0.8 * topSpeed);
    }
}
