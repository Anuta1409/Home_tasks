package uits.jv;

/**
 * Created by Anna on 11.11.2015.
 */
public class ArrayBorder {

            public static void main(String[] args) {

            int[] masA = new int[5];
            int[] masB = new int[8];

                for (int i = 0; i < masA.length; i++) {
                    masA[i] = (int)Math.round(Math.random()*100);
                }

                 for (int i = 0; i < masA.length; i++) {
                 masB[i] = masA[i];
                 }

                 for (int i = masA.length;i < masB.length; i++) {
                 masB[i] = -1;
                 }

                 for (int i = 0; i < masB.length; i++) System.out.print(masB[i] + "  ");
    }

}
