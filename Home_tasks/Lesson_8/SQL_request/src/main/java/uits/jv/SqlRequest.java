package uits.jv;

import java.net.SocketPermission;

/**
 *SQL requests methods realization:
 *
 */

public class SqlRequest implements Cloneable {

    //Block with main SQL operators

    static final String EQUALS = " = ";
    static final String NOT_EQUALS = " ! = ";
    static final String GREATHER_THAN = " > ";
    static final String GREATHER_OR_EQUAL = " >= ";
    static final String LESS_THAN = " < ";
    static final String LESS_OR_EGUAL = " =< ";
    static final String BETWEEN = " BETWEEN ";


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

    public SqlRequest where(String colomnName, String op, String value){
        request.append("WHERE").append(" ")
                .append(colomnName).append(" ")
                .append(op).append(" ")
                .append("'").append(value).append("'");
        return this;
    }

    public SqlRequest where(String colomnName, String op, int value){//methods overload
        request.append("WHERE").append(" ")
                .append(colomnName).append(" ")
                .append(op).append(" ")
                .append(value).append(" ");
        return this;
    }

    public SqlRequest and(String colomnName,String op,String value) {
        request.append("AND").append(" ")
                .append(colomnName).append(" ")
                .append(op).append(" ")
                .append("'").append(value).append("'");
        return this;
    }

    public SqlRequest and(String colomnName,String op,int value) {
        request.append("AND").append(" ")
                .append(colomnName).append(" ")
                .append(op).append(" ")
                .append(value).append(" ");
        return this;
    }

    public SqlRequest or(String colomnName,String op,String value) {
        request.append("OR").append(" ")
                .append(colomnName).append(" ")
                .append(op).append(" ")
                .append("'").append(value).append("'");
        return this;
    }

    public SqlRequest or(String colomnName,String op,int value) {
        request.append("OR").append(" ")
                .append(colomnName).append(" ")
                .append(op).append(" ")
                .append(value).append(" ");
        return this;
    }

    public SqlRequest insert(String tableName, String[] values){
        request.append("INSERT INTO").append(" ")
                .append(tableName).append(" ").append("VALUES")
                .append(" ").append("( ");
        for (int i = 0; i < values.length; i++){
            request.append(values[i]);
            if (i == values.length-1){
                request.append(" )");
            }else{
                request.append(",").append(" ");
            }
        }
        return this;
    }

    public SqlRequest insert(String tableName, String[] colomnName, String[] values) {
        if (colomnName.length == values.length) {
            request.append("INSERT INTO").append(" ").append(tableName).append(" ")
                    .append("(").append(" ");
            for (int i = 0; i < colomnName.length; i++) {
                request.append(colomnName[i]);
                if (i == colomnName.length - 1) {
                    request.append(" ").append(")").append(" ");
                } else {
                    request.append(", ");
                }
            }
            request.append("VALUES").append(" ").append("( ");
            for (int i = 0; i < values.length; i++) {
                request.append(values[i]);
                if (i == values.length - 1) {
                    request.append(" ").append(" )");
                } else {
                    request.append(", ");
                }
            }
        } else {
            System.out.println("ERROR. Number of columns isn't equal number of values");
        }
        return this;
    }

    public SqlRequest update(String tableName, String[] colomnName,String op, String[] value){
        request.append("UPDATE").append(" ")
                .append(tableName).append(" ")
                .append("SET").append(" ");
        for (int i = 0; i < colomnName.length; i++){
            request.append(colomnName[i]).append(" ")
                    .append(op).append(" ").append(value[i]);
            if (i == colomnName.length-1) {
                request.append(" ");
            }else{
                request.append(",").append(" ");
            }
        }
        return this;
    }

    //Клонирование обьекта класса
    @Override
    public Object clone() {
        SqlRequest t = new SqlRequest(this.request);
        return t;
    }

   public String getQueryString(){
        return request.toString();
    }

}
