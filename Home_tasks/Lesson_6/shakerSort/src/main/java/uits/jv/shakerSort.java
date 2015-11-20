package uits.jv;

/**
 * Created by Anna on 17.11.2015.
 */
public class shakerSort {
    public static void main(String[] args) {

        int[] arr = {4, 34, 23, 54, 54, 78, 980, 45, 23, 124, 3554, 879,67,-324,549,67,3,9,0,-1,7,5};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }

           /* for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();*/

            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i - 1] > arr[i]) {
                     int tmp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = tmp;
                }
            }

           /* for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }*/
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
