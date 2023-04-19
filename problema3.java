import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class problema3 {
    static int num = 10;

    public static void main(String[] args) throws IOException {
        int[] nums = new int[num];
        List<Integer> par = new ArrayList<Integer>();
        List<Integer> elementos_par = new ArrayList<Integer>();
        String out = "";

        for (int c=0; c < nums.length; c++)
        {
            nums[c] = (int)(Math.random()*(999-0+1)+0);
            System.out.println(nums[c]);
        }

        BufferedWriter buff = new BufferedWriter(new FileWriter("problema3.txt"));
        
        for (int c=0; c < nums.length; c++)
        {
            // todos elementos que estão num indice par
            if (c % 2 == 0){
                par.add(nums[c]);
            }

            // todos os elementos par
            if (nums[c] % 2 == 0) 
                elementos_par.add(nums[c]);
        }
       
        // escrever todos elementos que estão num indice par
        out += par.toString();
    
        // escrever os elementos par
        out += "\n" + elementos_par.toString() + "\n[";

        // todos os elementos na ordem inversa
        for (int c=nums.length-1; c >= 0; c--)
        {
            out += nums[c];
            if (c > 0)
                out += ", ";
        }
            

        // apenas o primeiro e ultimo elemento
        out += "]\n[" + nums[0] + ", " + nums[nums.length-1] + "]";

        buff.write(out);
        buff.close();
    }
}