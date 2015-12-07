package uits.jv;

/**
 * Created by Anna on 29.11.2015.
 */
public class BubbleSort {

    private int[] arr;//������� ���� �������

    public BubbleSort(int[] arr) {//�������� ��� �������� �� ���������� ������������
        this.arr = arr;
    }

    public static void swap(int[] arr,int index) {
            if (arr[index] > arr[index+1]) {
            int tmp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = tmp;
        }
    }

    public int[] bubbleSort() {
        int[] resMas = arr;
        for (int i = 0; i < resMas.length; i++){
             for (int j = 0; j < resMas.length-i-1; j++){
                 swap(resMas,j);
             }
        }
        return resMas;
    }
}
