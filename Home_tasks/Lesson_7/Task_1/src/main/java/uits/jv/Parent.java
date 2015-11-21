package uits.jv;

/**
 * Created by Anna on 21.11.2015.
 */
public class Parent {static{
    System.out.println("Static block in Parent");
}

    {
        System.out.println("NON-Static block in Parent");
    }

    Parent(){
        System.out.println("Constructor in parent");
    }
}
