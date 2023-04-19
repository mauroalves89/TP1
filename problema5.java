import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class problema5 {
    static String nameofBestCustomer(ArrayList<Double> sales, ArrayList<String> customers){
        // determinar indice do maior valor
        int max_indice = 0;

        for (int c = 0; c < sales.size(); c++) {
            if (sales.get(c) > sales.get(max_indice))
                max_indice = c;
        }

        return customers.get(max_indice);
    }

    public static void main(String[] args) throws IOException {
        //valores
        ArrayList<Double> valores = new ArrayList<Double>();
        ArrayList<String> clients = new ArrayList<String>();
        String line;

        BufferedReader buffread = new BufferedReader(new FileReader("compras.txt"));
        
        while (true) {
            line = buffread.readLine();
            if (line == null)
                break;
            valores.add(Double.parseDouble(line));
        }
        buffread.close();

        //nomes
        buffread = new BufferedReader(new FileReader("clientes.txt"));
        
        while (true) {
            line = buffread.readLine();
            if (line == null)
                break;
            clients.add(line);
        }
        
        buffread.close();


        System.out.println("O cliente " + nameofBestCustomer(valores,clients) +  " é o melhor cliente do dia");

    }
}
