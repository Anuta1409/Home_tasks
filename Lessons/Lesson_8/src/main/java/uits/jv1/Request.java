package uits.jv1;

/**
 * Created by uitschool JV on 11/20/2015.
 */
public class Request {
    private Query q;
    int paramCnt = 0;

    public static class Query{
        public  Query (String[]s){
        }
    }
    public Query getQuery() {
        return q;
    }
}
