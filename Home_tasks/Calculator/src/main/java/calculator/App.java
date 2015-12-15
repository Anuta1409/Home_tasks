package calculator;

import java.util.Scanner;

/**
 * Created by Anna on 15.12.2015.
 */
public class App {
    public static int a;
    public static double b;
    public static double c;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose the number of operation");
        System.out.println("1 : +");
        System.out.println("2 : -");
        System.out.println("3 : *");
        System.out.println("4 : /");


            try {
                a = sc.nextInt();
                System.out.println("Add please first number:");
                b = sc.nextDouble();
                System.out.println("Add please second number:");
                c = sc.nextDouble();
                System.out.println();
                MathActions res = new MathActions();
                res.MathOp(a,b,c);
            }catch(Exception e){
                System.out.println("Sorry you add not valid data. Try again!");
            }
//        try {
//            if((a == 0) && (a > 4));
//        } catch (Exception e){
//            System.out.println("wwwwwwwwwwww");
//        }
    }

}
