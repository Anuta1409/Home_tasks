package uits.jv;

/**
 * Created by Anna on 25.11.2015.
 */
public class SqlRequest {

    // String selectQuery = "SELECT Column_name" +
   // "FROM table_name" + "WHERE value = ";

      private StringBuffer request = new StringBuffer();
      public void selectFrom(String tableName, String columnName,String fieldValue,int value ){
          request.append("select");
          request.append(" ");
          request.append(columnName);
          request.append(" ");
          request.append("from ");
          request.append(tableName);
          request.append(" ");
          request.append("Where ");
          request.append("fieldValue");
          request.append("[^\\&]* ");
          request.append("value");

      }

    public String getQueryString(){
        return request.toString();
    }



    String insertQuery = "INSERT into Table_name" + "(column_name1,column_name2)" +
            "VALUES" + "(value1, value2, value3}";

    String updateQuery = "UPDATE table_name" +
            "SET" + "column1= value1" +
            "WHERE" + "Some_column = some_value";
}
