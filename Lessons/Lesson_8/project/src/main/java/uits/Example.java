package uits;
/**
 * Created by Anna on 05.12.2015.
 */
public class Example {//outer class
    public static int a;
    public static  int b;
    public int  method(int a, int b){
        int c = a + b;
        return c;
    }
    //внутренний класс - inner class
    public class Test1{
        int d = a + b;
        int t = method(4, 5);
      //Example.this.method(5,3);

    }

    //вложенный класс - static nested classes
    public static class Test2{
        int c = a + b;
    }

    // local inner classes
    public Object newMethod(){
        class Local{
        }
        return new  Local();
    }


    // anonymous inner classes
    public Object method2() {
        return new Example() {
        };
    }


}
