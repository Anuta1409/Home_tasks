package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by Anna on 06.12.2015.
 */
public class ReflectClass {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
     Class c = Class.forName("reflection.Test");//надо просто пакет+имя файла!!!
       String className =  c.getName();
        System.out.println("className - " + className);

        Constructor[] constr = c.getConstructors();
        for (int i = 0; i < constr.length; i++) {
            System.out.println("Constructor - " + constr[i]);
        }

       if(Modifier.isPublic(c.getModifiers())){
            System.out.println("Class's modificator - public");
        }
       if (Modifier.isPrivate(c.getModifiers())){
           System.out.println("Class's modificator - private");
        }
       if(Modifier.isFinal(c.getModifiers())){
           System.out.println("Class's modificator - final");
       }
        if(Modifier.isProtected(c.getModifiers())){
            System.out.println("Class's modificator - protected");
        }

        Class[] inter = c.getInterfaces();
        for(int i = 0;i < inter.length; i++){
            System.out.println(inter[i]);
        }

        Method[] meth = c.getMethods();//если метод приватный или протектед то мы их не увидим!!!
        for(int i = 0;i < meth.length; i++){
            System.out.println(meth[i]);
        }
        System.out.println(meth[0].getTypeParameters());

        Field[] field = c.getFields();
        for(int i = 0;i < field.length; i++){
            System.out.println(field[i]);

        }
        System.out.println(field[0].getType());
        System.out.println(field[0].getModifiers());//единица потому что модификаторы у нас интеджеры и каждый имеет свое значение


    }
}

