/**
 * Created by Anna on 05.12.2015.
 */
public class Example {//outer class
    public static int a;
    public static  int b;
    public static int method(int a, int b){
        int c = a + b;
        return c;
    }
    //внутренний класс - inner class
    public class Test1{
        int d = a + b;
        Example t = new Example();
      //  t.method;

    }

    //вложенный класс - static nested classes
    public static class Test2{
        int c = a + b;
    }
}
