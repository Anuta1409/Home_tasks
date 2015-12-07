package Except;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by uitschool JV on 12/7/2015.
 */
public class ExeptionClass {
    public static void main(String[] args) {
       //int a;
//        try{
//            a = 10/0;
//        }
//        catch(ArithmeticException ex){
//            a = 0;
//            ex.printStackTrace();//метод который выводит необработанное исключение
//        }
//        System.out.println(a);
        BufferedReader br = null;//br = null default
        boolean isExeptionThtought = false;//флаг - записались данные или нет
        String s;
        try {
            br = new BufferedReader(new FileReader("D:\\Sampleлдтлдтд.txt"));
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }
        }catch (IOException ex) {
            isExeptionThtought = true;
            System.out.println("File is absent");
        }
        finally {//блок выполняется в любом случае, выполнился ли буффер ридер или нет!!!!
            try {
                if (br != null) {
                    br.close();//закрыть буферридер
                }
            }catch(IOException ex){
                System.out.println(ex);
            }
         if (isExeptionThtought){
             System.out.println(isExeptionThtought);
         }
            System.out.println("finallyCalled");
        }
    }
}
