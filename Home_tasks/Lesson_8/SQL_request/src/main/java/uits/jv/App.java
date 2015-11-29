package uits.jv;

/**
 * Created by Anna on 25.11.2015.
 */
public class App {
    public static void main(String[] args) {

        SqlRequest select = new SqlRequest();
        select.selectFrom("UsersTableName").where("Field1").and("Field2").equal("Test");
        SqlRequest clone = (SqlRequest) select.clone();

        SqlRequest insert = new SqlRequest();
        insert.insert("tableName").colName("ColName1").colName("colName2").value().valueStr("SetValue").valueDoub(4.0);//знаки такие как () и ,???

        SqlRequest update = new SqlRequest();
        update.update("TableUpdate").updateSet().colName("updateCol1").equal("test").where("updateFieldName").equal("stet");

        clone.and(" t ").and("g").and("jbkjb");
        System.out.println(select.getQueryString());
        System.out.println(insert.getQueryString());
        System.out.println(update.getQueryString());
        System.out.println(clone.getQueryString());

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




