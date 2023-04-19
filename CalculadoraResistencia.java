
import java.util.HashMap;

public class CalculadoraResistencia {
    public static void main(String[] args) {
        String[] faixas = {"red", "violet", "green", "gold"};
        double[] valores = calcularResistencia(faixas);
        double resistencia = valores[0];
        double tolerancia = valores[1];
        System.out.printf("Valor da resistência: %.3f kO ± %.1f%%\n", resistencia / 1000, tolerancia);
    }
    public static double[] calcularResistencia(String[] faixas) {
        HashMap<String, Integer> tabelaCores = new HashMap<>();
        tabelaCores.put("black", 0);
        tabelaCores.put("brown", 1);
        tabelaCores.put("red", 2);
        tabelaCores.put("orange", 3);
        tabelaCores.put("yellow", 4);
        tabelaCores.put("green", 5);
        tabelaCores.put("blue", 6);
        tabelaCores.put("violet", 7);
        tabelaCores.put("gray", 8);
        tabelaCores.put("white", 9);

        HashMap<String, Double> tolerancias = new HashMap<>();
        tolerancias.put("brown", 1.0);
        tolerancias.put("red", 2.0);
        tolerancias.put("green", 0.5);
        tolerancias.put("blue", 0.25);
        tolerancias.put("violet", 0.1);
        tolerancias.put("gray", 0.05);
        tolerancias.put("gold", 5.0);
        tolerancias.put("silver", 10.0);

        HashMap<String, Double> multiplicadores = new HashMap<>();
        multiplicadores.put("black", 1.0);
        multiplicadores.put("brown", 10.0);
        multiplicadores.put("red", 100.0);
        multiplicadores.put("orange", 1000.0);
        multiplicadores.put("yellow", 10000.0);
        multiplicadores.put("green", 100000.0);
        multiplicadores.put("blue", 1000000.0);
        multiplicadores.put("violet", 10000000.0);
        multiplicadores.put("gray", 100000000.0);
        multiplicadores.put("white", 1000000000.0);

        int Primeiro_digito = tabelaCores.get(faixas[0]);
        int Segundo_digito = tabelaCores.get(faixas[1]);
        double tolerancia = tolerancias.get(faixas[3]);
        double multiplicador = multiplicadores.get(faixas[2]);

        double valor = (Primeiro_digito * 10 + Segundo_digito) * multiplicador;
        return new double[] {valor, tolerancia};
    }
}
