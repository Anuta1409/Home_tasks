package uits.jv;

/**
 *SQL requests:
 * 1) SELECT * FROM ;
 * 2) SELECT Column_name FROM table_name WHERE value = data;
 * 3) SELECT Column_name FROM table_name WHERE value1 = data1 AND value2 = data2;
 * 4) SELECT Column_name FROM table_name WHERE value1 = data1 OR value2 = data2;
 * 5) INSERT into Table_name(column_name1,column_name2) VALUES (value1, value2, value3);
 * 6) UPDATE = UPDATE table_name SET column1 = value1 WHERE Some_column = some_value;
 */

public class App{
    public static void main(String[] args) {

        SqlRequest select =new SqlRequest();
        select.selectFrom("TableName").where("colomnName",SqlRequest.EQUALS,5).and("colomnName2",SqlRequest.GREATHER_THAN,10);

        //insert data
        String[] testCases = {"Test1", "Test2", "Test3"};
        String[] bugReport = {"bugReport1", "bugReport2","bugReport3"};

        SqlRequest insert = new SqlRequest();
        insert.insert("TestTable", testCases);

        SqlRequest insert2 = new SqlRequest();
        insert2.insert("TableTest", testCases, bugReport);

        SqlRequest update = new SqlRequest();
        update.update("tableName",testCases,SqlRequest.EQUALS,bugReport).where("colomnValue", SqlRequest.GREATHER_THAN, 1991);


        SqlRequest clone = new SqlRequest();
        clone.selectFrom("Table Name 2");


        System.out.println(select.getQueryString());
        System.out.println(insert2.getQueryString());
        System.out.println(insert.getQueryString());
        System.out.println(update.getQueryString());
        System.out.println(clone.getQueryString());


    }
}




