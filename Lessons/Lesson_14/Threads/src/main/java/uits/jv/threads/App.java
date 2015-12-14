package uits.jv.threads;
public class App {
    static int counter = 1000;//статические поля только для класса

    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        a.start();
        b.start();




    }
    
}
