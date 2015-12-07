package uits.jv;

import javax.print.attribute.standard.PDLOverrideSupported;
import java.awt.*;

/**
 * Created by Anna on 24.11.2015.
 */
public class MainClass {
    public static void main(String[] args){

//        Circle c = new Circle(5, new Shape.Point(10,10));
//        c.draw();

//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//        Rectangle r = new Rectangle(new Shape.Point(2,1), new Shape.Point(6,4));
//        r.draw();

        Triangle tr = new Triangle(new Shape.Point(4,2),new Shape.Point(10,5), new Shape.Point(1,5));
        tr.draw();
    }
}
