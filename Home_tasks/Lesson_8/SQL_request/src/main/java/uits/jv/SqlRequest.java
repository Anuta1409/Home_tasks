package uits.jv;

import javax.swing.table.TableCellEditor;

/**
 * Created by Anna on 25.11.2015.
 */
public class SqlRequest implements Cloneable {

    // String selectQuery = "SELECT Column_name" +
   // "FROM table_name" + "WHERE value = ";
    private StringBuffer request = new StringBuffer();

    public SqlRequest(){}

    public SqlRequest(StringBuffer request){
        this.request = request;
    }


    public SqlRequest selectFrom(String tableName){
          request.append("SELECT* FROM");
          request.append(" ");
          request.append(tableName);
          request.append(" ");
          return this;
      }

    public SqlRequest where(String fieldsName1){
        request.append("WHERE").append("  ").append(fieldsName1).append("  ");
        return this;
    }



    public SqlRequest and(String fieldsName2) {
        request.append("AND").append("  ").append(fieldsName2).append("  ");
        return this;
    }

    public SqlRequest or(String fieldsName2){
        request.append("OR").append("  ").append(fieldsName2).append("  ");
        return this;
    }

    public SqlRequest equal(String value){
        request.append("=").append("  ").append(value).append("  ");
        return this;
    }//Можно перегрузку метода сделать???

    public SqlRequest equal(double value){
        request.append("=").append("  ").append(value);
        return this;
    }


//    String insertQuery = "INSERT into Table_name" + "(column_name1,column_name2)" +
//            "VALUES" + "(value1, value2, value3)";

    public SqlRequest insert(String tableName){
        request.append("INSERT INTO").append("  ").append(tableName).append(" ");
        return this;
    }

    public SqlRequest colName(String colName){
        request.append(colName).append("  ");
        return this;
    }

    public SqlRequest value(){
        request.append("VALUE").append(" ");
        return this;
    }


    public SqlRequest valueStr(String value){
        request.append(" ").append(value);
        return this;
    }

    public SqlRequest valueDoub(double value){
        request.append(" ").append(value);
        return this;
    }

    public SqlRequest update(String tableName){
        request.append("UPDATE").append(" ").append(tableName).append(" ");
        return this;
    }

    public SqlRequest updateSet(){
        request.append("SET").append("  ");
        return this;
    }

    public SqlRequest colVal(String colName){
        request.append(colName).append(" ");
        return this;
    }


    String updateQuery = "UPDATE table_name" +
            "SET" + "column1= value1" +
            "WHERE" + "Some_column = some_value";

@Override
public Object clone(){
 SqlRequest t = new SqlRequest(this.request);
    return t;
}



    public String getQueryString(){
        return request.toString();
    }

}
