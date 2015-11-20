package uits.jv;

/**
 * Created by Anna on 11.11.2015.
 */
public class RaggedArray {
    public static void main(String[] args) {

        int[][] mas = new int[10][];

        for (int i = 0; i < mas.length; i++) {
           mas[i] = new int[i];//прямой угол слева
         //   mas[i] = new int[mas.length - i];//вверх ногами
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (j == 0) {
                    for (int t = 0; t < mas.length- mas[i].length; t++ ) {
                        System.out.print("--");
                    }
                }
                System.out.print(mas[i][j]+"t" );
            }
            System.out.println();
        }
    }
}

