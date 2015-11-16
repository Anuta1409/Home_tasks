/**
 * Created by Anna on 03.11.2015.
 */
public class Task2 {
    public    int a ;
    public    int b ;

    public void repl(int a, int b){
        System.out.println("a = "+a+"     b = "+b);

        a = a+ b;//17
        b = a - b;
        a = a - b;
        System.out.println("a = "+a+"     b = "+b);
    }
}
