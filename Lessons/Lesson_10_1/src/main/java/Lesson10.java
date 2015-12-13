import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by uitschool JV on 11/30/2015.
 */
public class Lesson10 {
    public static void main(String[] args) {
        List<Integer> x= new ArrayList();
        List<Integer> x2 = new LinkedList<Integer>();

        for(int i = 0; i < 10; i++){
            x.add (new Integer(i));
            x2.add(new Integer(i));
        }


        for(int i = 0; i < x.size(); i++){
            System.out.print(x.get(i) + " ");
        }

        System.out.println(" ");

        for(int i = 0; i < x2.size(); i++){
            System.out.print(x2.get(i)+" ");
        }

        Iterator it = x.listIterator();//???????? ????????? ?????? ?? ??????

        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
