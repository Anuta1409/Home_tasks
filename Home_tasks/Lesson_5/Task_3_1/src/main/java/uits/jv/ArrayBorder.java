package uits.jv;

import static uits.jv.ArrayBorderMethod.arrayBorder;

/**
 * Created by user on 16.11.2015.
 */
public class ArrayBorder {
    public static void main(String[] args) {

        int[] arrn = {3, 5, 6, 7, 8, 9, 1, 0, 12, 15, 79, 6786};

<<<<<<< HEAD
        arrn = arrayBorder(arrn, 20,-9);

=======
        int[] arr = {3,5,6,7,8,9,1,0,12,15,79,6786};

        int[] arrStr = new int[arr.length + 3];

        for (int i = 0; i < arrStr.length; i++){
            if(i <arr.length){
                arrStr[i] = arr[i];
            }else{
                arrStr[i] = -1;
            }
        }
        for (int i = 0; i < arr.length; i++)System.out.print(arr[i]+" ");
        System.out.println();
        for (int i = 0; i < arrStr.length; i++)System.out.print(arrStr[i]+" ");

>>>>>>> cf628399654a377721e778eb5f4588bba5eef58c
    }
}
