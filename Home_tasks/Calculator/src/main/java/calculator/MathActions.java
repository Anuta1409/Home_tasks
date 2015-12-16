package calculator;

/**
 * MathOp method implements all math operations which calculator implements
 */
public class MathActions {

    double result;

    public void MathOp(int oper, double val1, double val2) {
        switch (oper) {
            case 1:
                result = val1 + val2;
                System.out.println("Result = " + result);
                break;
            case 2:
                result = val1 - val2;
                System.out.println("Result = " + result);
                break;
            case 3:
                result = val1 * val2;
                System.out.println("Result = " + result);
                break;
            case 4:
                if (val2 != 0) {
                    result = val1 / val2;
                    System.out.println("Result = " + result);
                    } else {
                    System.out.println("Division by 0 is forbidden!!!");
                }
                break;
            default:
                System.out.println("There is no operation correspond to your request!");
        }
    }

}