import java.util.Random;

public class Resistencia {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double nominalValue = 330;
            double tolerance = 0.1;
            double variation = (random.nextDouble() * 2 - 1) * nominalValue * tolerance;
            double realValue = nominalValue + variation;
            System.out.println("Valor real da resistência " + (i+1) + ": " + realValue + " ohms");
        }
    }
}