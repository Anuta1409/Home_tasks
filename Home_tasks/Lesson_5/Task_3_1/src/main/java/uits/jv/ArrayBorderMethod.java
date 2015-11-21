package uits.jv;

/**
 * Created by Anna on 21.11.2015.
 */
public class ArrayBorderMethod {

    public static int[] arrayBorder(int[] arr, int number, int value){

    int[] newArr = new int[arr.length+number];

    for (int i = 0; i < newArr.length; i++) {

        if (i < arr.length) {
            newArr[i] = arr[i];
        } else {
            newArr[i] = value;
        }
        System.out.print(newArr[i] + " ");

    }
        System.out.println(newArr.length);
        return newArr;
    }
}
