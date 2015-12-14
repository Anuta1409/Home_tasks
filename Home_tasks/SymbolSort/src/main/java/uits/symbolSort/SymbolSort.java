package uits.symbolSort;

/**
 * Created by Anna on 09.12.2015.
 */
public class SymbolSort {
    public static void main(String[] args) {

//        List<String> list = new ArrayList<String>();
//
//        list.add("Vab");
//        list.add("Vds");
//        list.add("H");
//        list.add("J");
//
//        System.out.println(list);
//        Collections.sort(list);//сортировка обьектов коллекции
//        System.out.println(list);
//
//
//        StringBuffer text = new StringBuffer("Text for revers");
//        System.out.println(text);
//        System.out.println(text.reverse());//Слова задом на перед

        System.out.println("+++++++++Test++++++++++");
        int[] unevenArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 24, 13, 56, 78, 9,100};
        int s1 = unevenArr.length;
        BinarySearch binSer = new BinarySearch();
        int res = binSer.binarySearch(10, unevenArr);
        System.out.print("index = " + res+ "  " + "numberOfArrElem = "+ s1);

        System.out.println("  ");
        System.out.println("+++++++++Test++++++++++");

        int[] evenArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 24, 36, 56, 78};
        int s2 = evenArr.length;
        int res2 = binSer.binarySearch(10,evenArr);
        System.out.print("index = " + res2+ "  " + "numberOfArrElem = "+ s2);

        System.out.println("  ");
        System.out.println("+++++++++Test++++++++++");

        int[] NullArr = {};
        int s3 = NullArr.length;
        int res3 = binSer.binarySearch(10,NullArr);
        System.out.print("index = " + res3+ "  " + "numberOfArrElem = "+ s3);

        System.out.println("  ");
        System.out.println("+++++++++Test++++++++++");

        int[] allElementsEqual = {10, 10, 10, 10, 10, 10};
        int s4 = allElementsEqual.length;
        int res4 = binSer.binarySearch(10,allElementsEqual);
        System.out.print("index = " + res4+ "  " + "numberOfArrElem = "+ s4);

        System.out.println("  ");
        System.out.println("+++++++++Test++++++++++");

        int[] notElementsEqual = {10, 10, 10, 10, 10, 10};
        int s5 = notElementsEqual.length;
        int res5 = binSer.binarySearch(0,notElementsEqual);
        System.out.print("index = " + res5+ "  " + "numberOfArrElem = "+ s5);

        System.out.println("  ");
        System.out.println("+++++++++Test++++++++++");

        for(int i= 0; i < evenArr.length; i++) {
            System.out.print(evenArr[i]+ "   ");
        }

        System.out.println("  ");

        for (int i= 0; i < evenArr.length; i++){

            int res6 = binSer.binarySearch(evenArr[i], evenArr);
            System.out.println("index = " + res6+"    val = "+ evenArr[i]);
        }
    }
}
