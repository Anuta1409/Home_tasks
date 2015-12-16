package calculator;

import java.util.Scanner;

/**
 * reloadCalculator - reload calculator if one of the value wasn't correctly added
 */
public class ReloadCalculator {
    public static int r;

    public static void reloadCalculator(){
        Scanner sca = new Scanner(System.in);
        try {
            System.out.println("Do you want to continue?");
            System.out.println(" 1: Yes");
            System.out.println(" 2: No");
            r = sca.nextInt();

            if (r == 1) {
                Scan.scan();
            } else {
                System.out.println("The end!");
                sca.close();
            }
        } catch (Exception e) {
            System.out.println("Sorry, you add not valid data!");
            reloadCalculator();
        }
    }
}
