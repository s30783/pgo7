import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //zadanie1
//        double radius = 3d;
//        Figure circle = new Circle(radius);
//        double baseSide = 10d;
//        double side = 5d;
//        double height = 8d;
//        Figure parallelogram = new Parallelogram(baseSide, side, height);
//        double sideA = 15d;
//        double sideB = 10;
//        Figure rectangle = new Rectangle(sideA, sideB);
//        List<Figure> figures = new ArrayList<>(3);
//        figures.add(circle);
//        figures.add(parallelogram);
//        figures.add(rectangle);
//        for (Figure figure : figures) {
//            System.out.println(figure.getType());
//            System.out.println("Area: " + figure.getArea() + " units.");
//            System.out.println("Perimeter: " + figure.getPerimeter() + " units.\n");
//        }


        //zadanie2
//        Cat mruczek = new Cat("Mruczek");
//        mruczek.start();
//        System.out.println(mruczek.getType());
//        mruczek.stop();


        //zadanie

        Manager manager = new Manager("Jan", "Kowalski", 1990, 2010, "PJATK", 2000d, 100d);
        System.out.println(manager);
    }
}