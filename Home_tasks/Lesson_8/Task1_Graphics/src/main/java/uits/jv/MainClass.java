package uits.jv;

/**
 * Created by Anna on 24.11.2015.
 */
public class MainClass {
    public static void main(String[] args){

        Circle c = new Circle(5, new Shape.Point(10,10));
        c.draw();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Rectangle r = new Rectangle(new Shape.Point(35,10), new Shape.Point(3,1));
        r.draw();
    }
}
