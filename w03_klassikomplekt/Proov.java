//Mitu omavahel seotud klassi (nt. hoidla ja eksemplarid) ning näitrakendus nende kasutamiseks

public class Proov{
    public static void main(String[] args){

        Info sp1 = new Info("Sedaan", "Mercedes-Benz", "S-Klass", "Bensiin", 12.555, 4);
        Car sh1 = new Car(sp1);

        System.out.println("-----------------------------------------------");

        System.out.println("Võtab autode koguse: " + sp1.getAmount());
        System.out.println("Lisab juurde sisestatud arvu nt (2), seega = " + sh1.addAmount(2));
        System.out.println("Lõplik kogus: " + sh1.finalAmount);

        System.out.println("-----------------------------------------------");

        System.out.println("Auto andmed ja tüübid: " + sh1.specs());
        
        System.out.println("-----------------------------------------------");
    }
}