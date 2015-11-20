package uits.jv;

/**
 * Created by uitschool JV on 11/20/2015.
 */
public class Request {
    private Query q;
    private int paramCnt = 0;
            class Query{
                public Query (String[]s){
                    paramCnt = s.length;
                }
            }
    public Query getQuery() {
        return q;
    }
}

