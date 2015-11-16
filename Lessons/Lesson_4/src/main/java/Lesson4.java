
public class Lesson4 {

    public static void main(String[] args){

        int a = 5;//int x = 0; int = x, y, z; - this format is not recommended
        int b = 9;
        int x=0x41;
        double t = 9;
        int r = 2;


        System.out.println(a);
        System.out.println(b);
        System.out.println((char)x);//явное преобразование(приведение) типов
        System.out.println(t/r);

        //Программа округления числа
        double c = 938;
        int d = 246;
        int z = 2;
        int k =(int)((c / d)*Math.pow(10,z+1));
        int zn = (int)(k-(((int)(k/10))*10));
        System.out.println(zn);

        if (zn>=5){
            System.out.println((double)(((int)(k/10))+1) / (double)Math.pow(10.0,z));
        }else{
            System.out.println((double)(((int)(k/10))) / (double)Math.pow(10.0,z));
        }

        int h = 3;
        int v = 5;

        System.out.println("v="+v+"   h="+h);

        h=v-h;
        v=v-h;
        h=h+v;

        System.out.println("vr="+v+"   hr="+h);






    }
}
