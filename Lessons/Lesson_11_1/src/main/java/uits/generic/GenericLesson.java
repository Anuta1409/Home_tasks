package uits.generic;

/**
 * Created by uitschool JV on 12/4/2015.
 */
public class GenericLesson {

    static class Pair<T1, T2> {//????? ?? ??????? ?? ??????? ?????????? ??????
        T1 key;
        T2 value;

        Pair(T1 key, T2 value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair<Integer, String>(1, "we");
        System.out.println(p.key+"  "+p.value);
    }
}
