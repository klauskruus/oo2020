import java.io.*;
import java.util.Scanner;

public class Main3{
    public static void main(String[] arg) throws Exception{

        double sum = 0;
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
        sum = Math.round(sum);
        System.out.prinln("Vastus on: " + sum);
    }
}