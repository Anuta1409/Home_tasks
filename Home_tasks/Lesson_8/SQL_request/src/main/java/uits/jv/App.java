package uits.jv;

/**
 * Created by Anna on 25.11.2015.
 */
public class App {
    public static void main(String[] args){

SqlRequest select = new SqlRequest();
        select.selectFrom("UsersTableName","AnimalsColumnName","Cat",3);

        System.out.println(select.getQueryString());

//        int i;
//        StringBuffer contents = new StringBuffer();
//        for(i = 0; i < 10; i++)
//        {
//            contents.append("hello world\n");
//        }
//
///* вывод содержимого на экран */
//        System.out.println(contents.toString());//Зачем??


    }


}
