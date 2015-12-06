/**
 * Created by Anna on 05.12.2015.
 */
public class TypeClass {
    public static void main(String[] args) {

        Integer [] arr = {345,87,89,97,64,2,8,5,0};

        Collection collect = new Collection(arr);

        Iterator iterForward = collect.createForward();
        Iterator iterBackward = collect.createBackward();

        while (iterForward.hasNest()){
            System.out.print(iterForward.next() + " ");
        }

        System.out.println(" ");
        while (iterBackward.hasNest()) {
            System.out.print(iterBackward.next());
        }

        Iterator it = collect.createIterator();
        while (it.hasNest()){
            System.out.println(it.next());
        }
    }
}
