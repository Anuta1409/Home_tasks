package uits.jv;

/**
 * Created by Anna on 21.11.2015.
 */
public class ClassMain {
    public static void main(String[] args){

        Shape chCir = new Circle(12);
        Shape chTriang =new Triangle(1, 2, 3);

        double perCir = chCir.perimetr();
        double perTr = chTriang.perimetr();

        double sqCir = chCir.square();
        double sqTr = chTriang.square();

        System.out.println("perCir = " + perCir +"   " + "sqCir = " + sqCir );
        System.out.println("perTr = " + perTr  +"   " + "sqTr  = " + sqTr  );



    }
}
