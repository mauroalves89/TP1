import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um texto para encriptar: ");
        String textoOriginal = scanner.nextLine();
        String textoEncriptado = encriptar(textoOriginal);
        System.out.println("Texto encriptado: " + textoEncriptado);
    }

    public static String encriptar(String textoOriginal) {
        StringBuilder textoEncriptado = new StringBuilder();
        for (char c : textoOriginal.toCharArray()) {
            if (Character.isLetter(c)) { // só encripta letras
                char novaLetra = rodarLetra(c);
                textoEncriptado.append(novaLetra);
            } else {
                textoEncriptado.append(c); // mantém outros caracteres sem alterar
            }
        }
        return textoEncriptado.toString();
    }

    public static char rodarLetra(char letra) {
        char base = Character.isLowerCase(letra) ? 'a' : 'A'; // determina (minúscula ou maiúscula)
        int deslocamento = 13;
        int indiceLetra = letra - base; // converte a letra para um índice (0 a 25)
        int novoIndiceLetra = (indiceLetra + deslocamento) % 26;
        char novaLetra = (char) (base + novoIndiceLetra); // converte o índice de volta para uma letra
        return novaLetra;
    }

}