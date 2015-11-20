package uits.jv;

/**
 * Created by Anna on 19.11.2015.
 */
public class Parent {


    public static void parentA(){
        System.out.println("Static block in parent");
    }

    public void parentB(){
        System.out.println("NON-Static block in parent");
    }

    private String c = "Static constructor";
    private String d = "in parent";

    Parent(String c, String d){
        System.out.println(c + " "+ d);
    }
}
