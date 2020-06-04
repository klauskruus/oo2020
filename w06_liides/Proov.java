public class Proov {
    public static void main(String[] arg){
        Vehicle Auto = new Car();
        //-------- Auto käivitus --------//
        Auto.run();
        //-------- Käigu vahetus --------//
        Auto.changeGear(1);
        Auto.whatGear();
        //-------- Käigu vahetus --------//
        Auto.changeGear(2);
        Auto.whatGear();
        //-------- Käigu vahetus --------//
        Auto.changeGear(3);
        Auto.whatGear();
    }
}