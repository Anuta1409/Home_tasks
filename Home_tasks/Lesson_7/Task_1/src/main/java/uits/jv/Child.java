package uits.jv;

/**
 * Created by Anna on 21.11.2015.
 */
public class Child extends Parent {

    static{
        System.out.println("Static block in Child");
    }

    {
        System.out.println("NON-Static block in Child");
    }

    Child() {
        System.out.println("Constructor in Child");
    }

}
