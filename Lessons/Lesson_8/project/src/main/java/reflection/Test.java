package reflection;

/**
 * Created by Anna on 06.12.2015.
 */
public final class Test implements I1,I2{
    public int a = 9;
    private double b = 8.1;
    public final String c = "test";
    boolean k = false;

    public void method(int a, double b ){
        int d = (int) (a+b);
    }
    private void metPrivate(){
        int d = (int) (a+b);
    }

}
