package uits.jv;

/**
 * Created by Anna on 11.11.2015.
 */
public class RaggedArray {
    public static void main(String[] args) {

        int[][] mas = new int[10][];

        for(int i=0; i < mas.length; i++){
            mas[i] = new int[i+1];
        }

        for(int i = 0; i < mas.length; i++){
            System.out.println( );
            for(int j = 0; j < mas[i].length; j++){
                System.out.print(i+" , "+j);
            }
        }
    }
}
