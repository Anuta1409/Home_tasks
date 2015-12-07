package uits.jv;

/**
 * Created by uitschool JV on 12/4/2015.
 */
public class EnumLesson {
    enum Seasons{winter, spring,summer,aotumn};
    enum Planet{
        venus(2,3),//параметры можно указать через запятую но обязательно обьявить в конструкторе!!!
        eartn(3,8),
        saturn(6,8),
        mars(4,6);//отделение типа данных через точку с запятой
        final int order;
        final int mas;//все поля по умолчанию финальные

        Planet(int order,int mas){//по умолчанию конструктор приватный
            this.order = order;
            this.mas = mas;
        }
    }

    public static void main(String[] args) {
        Seasons seasons = Seasons.aotumn;
        switch (seasons) {
            case winter:
                System.out.println("WINTER");
                break;
            case spring:
                System.out.println("SPRING");
                break;
            case summer:
                System.out.println("SUMMER");
                break;
            default:
                System.out.println("AOTUMN");
        }
        System.out.println(Seasons.winter);
        System.out.println(Seasons.class.getClass());
        System.out.println(Seasons.valueOf("spring"));//Получение э-та массива
        Seasons[] s = Seasons.values();
        for (int i = 0; i < s.length; i++)
            System.out.print(s[i] + "  ");

        System.out.println();
        System.out.println(Seasons.summer.ordinal());//получаем порядковый номер года


        /*Древовидное расширение массива */
        System.out.println(Planet.eartn.order);

    }
}
