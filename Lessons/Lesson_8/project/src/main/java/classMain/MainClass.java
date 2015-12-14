package classMain;

/**
 * Created by Anna on 12.12.2015.
 */
public class MainClass {
    public static void main(String[] args) {
        int a = 5;
    Inner sum = new Inner();
       Integer b = new Integer(10);
        System.out.print(sum.sum(a, b));
       //на нулл обьекты методы вызывать нельзя!!!!!!!!!!!!!!!

    }
}

