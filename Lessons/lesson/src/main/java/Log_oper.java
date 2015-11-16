/**
 * Created by uitschool JV on 11/9/2015.
 */
public class Log_oper {
    public static void main(String[] args){
       /* int a = 5;
        int b = 5;

        if( a > b){
            int c = (a * b)+(a / (a + b));
            System.out.println("c1="+c);
        }else if(a < b) {
            int c = ((a * b) / 2) - (b + (a * b++));
            System.out.println("c2="+c);
        }else
            System.out.println("c3="+(a + b));*/

        int [] mas = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + "  ");
        }

        System.out.println();

        for(int i = 9; i >=0; i--){
            System.out.print(mas[i] + "  ");
        }

        System.out.println();

        int i = mas.length - 1;
        while( i >=0){
            System.out.print(mas[i--] + "  ");
       }
        System.out.println();

        int j = 0;
        while( j <= mas.length-1){
            System.out.print(mas[j++] + "  ");
        }
    }
}
