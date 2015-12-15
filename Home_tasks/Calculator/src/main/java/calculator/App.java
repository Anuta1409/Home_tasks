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

        if(sc.hasNextInt()){
            a = sc.nextInt();
        }else{
            System.out.println("Sorry you add not valid data. Try again!");
        }

        System.out.println("Add please first number:");
        if(sc.hasNextDouble()){
            b = sc.nextDouble();
        }else{
            System.out.println("Sorry you add not valid data. Try again!");
        }


        System.out.println("Add please second number:");
        if(sc.hasNextDouble()){
            c = sc.nextDouble();
        }else{
            System.out.println("Sorry you add not valid data. Try again!");
        }

        System.out.println();
        MathActions res = new MathActions();
        res.MathOp(a,b,c);
    }

}
