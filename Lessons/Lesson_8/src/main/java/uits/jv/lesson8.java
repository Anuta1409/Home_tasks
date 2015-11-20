package uits.jv;

/**
 * Created by uitschool JV on 11/20/2015.
 */
import uits.jv1.Request;
import uits.uits.shapes.Shape;
import uits.uits.shapes.Trangle;

public class lesson8 {
    public static void main(String[] args) {

        Request r = new Request();

        Request.Query q = r.getQuery();


        Shape s = new Trangle();
        s.draw();
    }
}
