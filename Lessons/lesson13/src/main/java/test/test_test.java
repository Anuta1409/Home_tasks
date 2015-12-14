package test;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by uitschool JV on 12/11/2015.
 */
public class test_test {
    public static void main(String[] args) {//потоки ввода-вывода
        int a;
        int b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a:");

        try {
            a = scan.nextInt();
            System.out.println("Enter b:");
            b = scan.nextInt();
            int c = a / b;
            System.out.println("c = " + c);
        }catch (ArithmeticException e) {
            System.out.println("Devided by null isn't allowed");

        }catch(InputMismatchException t) {
            System.out.println("Letters aren't allowed");
        }
    }
}
