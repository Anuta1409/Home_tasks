package uits.jv;

/**
 * Created by Anna on 21.11.2015.
 */
public  class Circle extends Shape {

    private double  r;

    public double getR(){
        return r;
    }

    public void setR(double r){
        this.r = r;
    }

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double perimetr() {//вопрос по передаваемым параметрам
        double per = 2 * Math.PI * r;
        return per;
    }

    @Override
    public double square() {
        double sq = Math.PI * Math.pow(r,2);
        return sq;
    }
}
