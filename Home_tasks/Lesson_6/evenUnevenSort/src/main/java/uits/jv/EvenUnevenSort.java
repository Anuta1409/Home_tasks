package uits.jv;

/**
 * Created by Anna on 18.11.2015.
 */
public class EvenUnevenSort {
    public static  void  main(String[] args){

        int[] arr = {56,23,76,87,2,45,12,6,-9,67,1,2,678,9};

        for (int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
            for(int k = 0; k<2; k++){
                for(int j = 0;j < arr.length-2; j = j+2) {
                    if(j < arr.length-2) {
                        if (arr[j] > arr[j + 1]) {
                            int tmp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = tmp;
                        }
                    }
                }
            }
        System.out.println();

        for (int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(Method.getA(3));
    }
}
