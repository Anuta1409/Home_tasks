import java.io.ByteArrayInputStream;
import java.util.Base64;

/**
 * Created by Anna on 03.11.2015.
 */
public class Task1 {
    public static void main (String[] args){
        System.out.println("------ Task - 1 -------");
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
        replace.repl(15,9);

        System.out.println("------ Task - 3 -------");
        Task3 devision = new Task3();
        devision.dev(85,9);//ћетод с использованием %

        devision.dev2(85, 9);

        System.out.println("------ Task - 4 -------");
        byte b = 127;
        byte ba = (byte) 129;//явное приведение типов

        System.out.println("Explicit type"+(byte)(b+2)+ "   "+ ba);
        System.out.println(b+2 + " - Implicit type");//Ќе€вное приведение типов


        long t = Long.MAX_VALUE;
        t = t + 2;
        System.out.println(t);

        long t1 = Long.MIN_VALUE;
        t1 = t1 - 2;
        System.out.println(t1);

        char ch = Character.MAX_VALUE;
        System.out.println(ch+78);
        System.out.println((char)(ch+78));




    }
}
