package uits.jv;

/**
 * Created by Anna on 11.11.2015.
 */
public class ArraySort {

    //Input data
        public static void main(String[] args){

            int[] mas = new int[6];
            if (mas.length <= 0){
                System.out.print("ERROR");
            }
            for (int i = 0; i < mas.length; i++){
                mas[i] = (int) Math.round(Math.random()*100);
                System.out.print(mas[i]+" ");
            }

    //Output data
            BubbleSort arrSort = new BubbleSort(mas);
            mas = arrSort.bubbleSort();
            System.out.println();
            for (int i = 0; i < mas.length; i++) {
                System.out.print(mas[i] + " ");
            }


        }
    }

