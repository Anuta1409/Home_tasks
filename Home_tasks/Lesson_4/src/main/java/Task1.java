/**
 * Created by Anna on 03.11.2015.
 */
public class Task1 {
    public static void main (String[] args){

        byte x = -128;

        System.out.println(x + " = byte x");
        System.out.println((short) x + " = short x");
        System.out.println((int)x + " = int x");
        System.out.println((long)x + " = long x");
        System.out.println((double)x + " = double x");

        int z = (int)x;
        System.out.println((float)z + " = float x");

        int c = (int)x;
        System.out.println((double)c + " = double x");

        char y = 65;
        System.out.println(y + " = char y");
        System.out.println((int)y + " = int y");

        System.out.println("------ Task - 2 -------");

        Task2 replace = new Task2();
        replace.repl(5,9);



    }
}
