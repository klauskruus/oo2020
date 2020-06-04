/*Omaloodud funktsioon

Igaüks koostab temaatilise spetsiifilise funktsiooni ning demonstreerib selle tööd näitandmete abil.

Arvutus võib olla lihtne, aga lugejatel/kuulajatel võiks käsitletava teema kohta midagi õppida olla. */

import java.util.*;

public class Calculator{


    public static double Arvutamine(int num1, int num2, char operaator){
        double vastus = 0.0;
        switch (operaator){ 
            case '+': vastus = num1 + num2;
                break;
            case '-': vastus = num1 - num2;
                break;
            case '*': vastus = num1 * num2;
                break;
            case '/': vastus = num1 / num2;
                break;}
        return vastus;
    }

    public static void main(String[] arg){

        int num1 = 0;
        int num2 = 0;
        char operaator;

        Scanner scanObject = new Scanner(System.in);

        System.out.println("Sisesta esimene number: ");
        num1 = scanObject.nextInt();

        System.out.println("Sisesta teine number:");
        num2 = scanObject.nextInt();

        System.out.println("Milline tehtemärk/operaator? : "); 
        operaator = scanObject.next().charAt(0);
        
        
        System.out.println("Sisestatud tehe ja vastus:");
        System.out.println(num1+" "+operaator+" "+num2+" = "+Arvutamine(num1,num2,operaator));

    }
    
}