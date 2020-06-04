import java.io.*;
import java.util.*;
import java.io.IOException;


public class Main1{

    public static void main(String[] arg) throws Exception{
        BufferedReader br1=new BufferedReader(new FileReader("Sisend.txt"));
        String rida=br1.readLine();
        String[] m=rida.split(" ");
        int arv1 = 0;
        int arv2 = 0;
        String k = "-------------";
        int summa = 0;
        /*double sum = 0;
        Scanner reader = new Scanner(System.in);
    	System.out.println("Mitu arvu soovite kokku liita?");
        int n = reader.nextint();
        for(int i = 1; i <= n; i++){
            System.out.print(i + ". arv: ");
            double input = reader.nextDouble();
            if (i == 1 || i == n){
                input = input / 2;
            }
            sum += input;
        }
        sum = Math.round(sum);*/

        while(rida!=null){
            int arv1 = Integer.parseInt(br1.readLine());
            int arv2 = Integer.parseInt(br1.readLine());
            summa = arv1+arv2;
        }
        

        br1.close();
        PrintWriter pw1=new PrintWriter("Väljund.txt");
        pw1.println(arv1);
        pw1.println(arv2);
        pw1.println(summa);
        /*pw1.println(k);
        pw1.println(sum);*/
        pw1.close();
        
       
    }
}