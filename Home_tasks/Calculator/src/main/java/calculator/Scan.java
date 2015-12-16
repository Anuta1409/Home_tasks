package calculator;

import java.util.Scanner;

/**
 * method scan - read data from console and make with them operation which user mention
 */
public class Scan {
    public static int operation;
    public static double value1;
    public static double value2;


    public static void scan() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please choose the number of operation");
        System.out.println("1 : +");
        System.out.println("2 : -");
        System.out.println("3 : *");
        System.out.println("4 : /");

        try {
            operation = sc.nextInt();
            if ((operation != 0) && (operation < 5)) {
                System.out.println("Add please first number:");
                value1 = sc.nextDouble();
                System.out.println("Add please second number:");
                value2 = sc.nextDouble();
                System.out.println();
                MathActions res = new MathActions();
                res.MathOp(operation, value1, value2);
            } else {
                System.out.println(" Choose correct number!");
            }
        } catch (Exception e) {
            System.out.println("Sorry, you add not valid data. Try again!");
        }
        ReloadCalculator.reloadCalculator();
    }

}




