//Alamklasside puu koos realiseerivate klasside ning näitprogrammiga

public class App {
    public static void main(String[] args) throws Exception {
        Shape shape_1 = new Triangle(6, 2, 9);
        Shape shape_2 = new Square(4);
        System.out.println("Kolmnurga ümbermõõt: " + shape_1.getPerimeter() + "cm");
        System.out.println("Ruudu ümbermõõt: " + shape_2.getPerimeter() + "cm");
    }
}