package uits.jv;

/**
 * Created by Anna on 11.11.2015.
 */
public class BubbleSort {

        public static void main(String[] args){

            int [] mas = new int[10];
            for (int i = 0; i < mas.length; i++){
                mas[i] = (int) Math.round(Math.random()*100);
                System.out.print(mas[i]+" ");
            }

            System.out.println();

            for (int i = 0; i < mas.length; i++){
                for (int j = 0; j < mas.length-i-1; j++){
                    if (mas[j] > mas[j+1]){
                        int tmp = mas[j];
                        mas[j] = mas[j+1];
                        mas[j+1] = tmp;
                    }
                }
            }
            for (int i = 0; i < mas.length; i++) System.out.print(mas[i]+" ");
        }
    }

