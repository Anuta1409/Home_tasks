package uits.symbolSort;

/**
 * Created by Anna on 09.12.2015.
 */
public class BinarySearch {
    public static int binarySearch(int val,int arr[]) {
        return binarySearch( val, arr, 0,arr.length - 1);
    }

    public static int binarySearch(int val, int arr[], int first, int last){
        if (first > last) return -1;


    int mid = first + (last - first) / 2;

        if (val > arr[mid]){
            return binarySearch(val, arr, mid+1, last);
        }else if (val < arr[mid]) {
            return binarySearch(val, arr, first, mid - 1);
        }else {
            return mid;
        }
    }
}
