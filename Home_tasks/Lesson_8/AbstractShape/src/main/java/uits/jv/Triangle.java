package uits.jv;

/**
 * Created by Anna on 21.11.2015.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;


    public Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimetr() {
        double per = a + b + c;
        return per;
    }

    @Override
    public double square() {
        double sq = Math.sqrt(perimetr() * (perimetr() - a) * (perimetr() - b) * (perimetr()-c));
        return sq;
    }
}
