package uits.jv;

import static uits.jv.ArrayBorderMethod.arrayBorder;

/**
 * Created by user on 16.11.2015.
 */
public class ArrayBorder {
    public static void main(String[] args) {

        int[] arrn = {3, 5, 6, 7, 8, 9, 1, 0, 12, 15, 79, 6786};

        arrn = arrayBorder(arrn, 20,-9);

    }
}
