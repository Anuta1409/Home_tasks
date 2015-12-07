/**
 * Created by Anna on 04.11.2015.
 */
public class Task3 {
    public int x;
    public int y;

    public void dev(int x, int y){
        int z = x % y;
        if (z == 0){
            System.out.println("z=" + z);
        }
        else{
            System.out.println("z_else=" + z);
        }

    }
    public void dev2(int x, int y){
        int z = x / y;
        int zr = x - (z * y);
        System.out.println("zr=" + zr);
    }

}

