import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Double[]> pontos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de pontos: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Digite as coordenadas x e y do ponto %d separadas por espaço: ", i);
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            Double[] ponto = {x, y};
            pontos.add(ponto);
        }

        for (int i = 1; i < pontos.size(); i++) {
            Double[] ponto1 = pontos.get(i-1);
            Double[] ponto2 = pontos.get(i);
            double distancia = distanciaDePontos(ponto1[0], ponto1[1], ponto2[0], ponto2[1]);
            System.out.printf("Distância entre o ponto %d e o ponto %d: %.2f\n", i, i+1, distancia);
        }
    }

    private static double distanciaDePontos(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }

}