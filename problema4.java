import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class problema4 {
    public static void main(String[] args) throws IOException {
        //ler numeros do ficheiro
        BufferedReader buffReader = new BufferedReader(new FileReader("numeros.txt"));
        int[][] matriz = new int[4][4];
        int[] sumColuna = new int[4];
        int x=0, y=0, sum=0, sum0=0;
        String line;
        boolean quadrado_magico = true;

        while (true) {
            line = buffReader.readLine();
            if (line == null && x == 4) 
                break;

            //verificar entradas
            try {
                matriz[x][y] = Integer.parseInt(line);
                y += 1;
                if (y==4){
                    y = 0;
                    x += 1;
                }
            }catch(Exception e) {
                continue;
            }
        }
        buffReader.close();

        //colocar numeros na matriz
        for (x=0; x < 4; x++)
        {
            for (y=0; y < 4; y++)
            {
                System.out.print(" "+ matriz[x][y] + " ");
                
                //soma das linhas
                sum0 += matriz[x][y];

                //soma das colunas
                sumColuna[x] += matriz[x][y];
            }
            System.out.print("\n");
            
            if (x == 0)
                    sum = sum0;

            if (sum != sum0)
                quadrado_magico = false;
            sum0 = 0;
        }

        //verificar matriz
        
        //soma das colunas
        if (sumColuna[0] != sumColuna[1] && sumColuna[1] != sumColuna[2])
            quadrado_magico = false;

        //soma das diagonais
        int soma_diagonal0 = matriz[0][0] + matriz[1][1] + matriz[2][2] + matriz[3][3];
        int soma_diagonal1 = matriz[0][3] + matriz[1][2] + matriz[2][1] + matriz[3][0];
        if (soma_diagonal0 != soma_diagonal1)
            quadrado_magico = false;

        
        if (quadrado_magico)
            System.out.println("a matriz é um Quadrado Magico");
        else System.out.println("A matriz não é um quadrado Magico");
    }
}
