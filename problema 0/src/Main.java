import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as coordenadas x e y iniciais do robô: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Digite a direção inicial do robô (N, E, S, W): ");
        Direcao direcao = Direcao.valueOf(scanner.next().toUpperCase());

        Robot robot = new Robot(x, y, direcao);

        System.out.println("Coordenadas atuais do robô: (" + robot.getX() + ", " + robot.getY() + ")");
        System.out.println("Direção atual do robô: " + robot.getDirecao());

        System.out.println("Girando o robô para a esquerda...");
        robot.turnLeft();
        System.out.println("Direção atual do robô: " + robot.getDirecao());

        System.out.println("Movendo o robô...");
        robot.move();
        System.out.println("Coordenadas atuais do robô: (" + robot.getX() + ", " + robot.getY() + ")");
    }

}