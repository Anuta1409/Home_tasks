package uits;

import com.sun.java.util.jar.pack.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anna on 05.12.2015.
 */
public class TypeClass {
    public static void main(String[] args) {

        Integer [] arr = {345,87,89,97,64,2,8,5,0};

        Collection collect = new Collection(arr);

        Iterator iterForward = collect.createForward();
        Iterator iterBackward = collect.createBackward();

        while (iterForward.hasNest()){
            System.out.print(iterForward.next() + " ");
        }

        System.out.println(" ");

        while (iterBackward.hasNest()) {
            System.out.print(iterBackward.next()+" ");
        }

        Iterator it = collect.createIterator();
        while (it.hasNest()){
            System.out.println(it.next() + " ");
        }

        //Рефлексия

        System.out.println(" ");
        //Class nameCl = Class.forName("uits.Collection");//Почему так не работает
        Class nameC1 = TypeClass.class;
        System.out.println(nameC1.getMethods());//Как вывести в нормальном виде????
        System.out.println(nameC1.getName());
        System.out.println(nameC1.getPackage());

        Class nameC2 = Collection.class;
        Method[] meth = nameC2.getMethods();
        for(int i= 0;i < meth.length; i++){
            System.out.println(meth[i]);
        }

        System.out.println("__________________________________________");

        Class nameC3 = Collection.class;
        Class[] inter = nameC3.getInterfaces();
        for(int i= 0;i < inter.length; i++){
            System.out.println(inter[i]);
        }
    }
}
