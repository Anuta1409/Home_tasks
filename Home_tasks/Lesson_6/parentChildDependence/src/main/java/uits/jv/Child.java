package uits.jv;

/**
 * Created by Anna on 19.11.2015.
 */
public class Child extends Parent{

    Child(String c, String d) {
        super(c, d);
        System.out.println(d+" "+c);
    }

    public static String childA(String a){
        return a;
    }

    public void childB(){
        System.out.println("NON-Static block in child");
    }
}
