package calculator;

/**
 * Created by Anna on 15.12.2015.
 */
public class MathActions {
    int a;
    double b;
    double c;
    double result;

    public void MathOp(int a, double b, double c) {
        switch (a) {
            case 1:
                result = b + c;
                System.out.println("Result = " + result);
                break;
            case 2:
                result = b - c;
                System.out.println("Result = " + result);
                break;
            case 3:
                result = b * c;
                System.out.println("Result = " + result);
                break;
            case 4:
                if (c != 0) {
                    result = b / c;
                    System.out.println("Result = " + result);
                    } else {
                    System.out.println("Division by 0 is forbidden");
                }
                break;
            default:
                System.out.println("There is no operation correspond to your request");
        }
    }

}