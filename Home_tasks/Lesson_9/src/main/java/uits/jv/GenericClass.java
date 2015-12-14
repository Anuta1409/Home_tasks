package uits.jv;

import java.util.*;

/**
 * Generic  - коллекции предназначены для хранения множества обьектов
 * Коллекции класифицируются по доступу: бывает прямой(обращение к конкретному элементу) и последовательный доступ
 * Во главе всех интерфейсов стоит интерфейс Iterable -> от него наследуется интерфейс Collection
 * от него наследуются различного вида интерфейсы для написания различного вида коллекций
 */
public class GenericClass {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<Integer>();//Создаем список с указанием типа обьекта(его еще называютаргументы шаблона и параметры шаблона) в <>
        list.add(4);// .add - метод для добавления элементов в нашу коллекцию
        list.add(8);
        list.add(10);
        list.add(-11);

       int el = list.get(3);// получение значения элемента списка под индексом 3 -индексация с 0
        // System.out.println("el = " + el);

        for (int i = 0; i < list.size(); i++){//size() - хранится информация о размере коллекции
           // System.out.print(list.get(i)+ "  ");
        }

        // форэдже for(Object имя_обьекта: Massive or Collection)
        System.out.println("   ");
        for( Integer in:list){
          //  System.out.print(in + "   ");
        }

        // коллекция Set - не может хранить в себе одинаковые значения, хранит только уникальные значения

        Set<Double> set = new HashSet<Double>();// порядок элементов зависит оттого как мы их добавляли!!!
        boolean r1 = set.add(3.0);
        set.add(11.8);
        set.add(5.0);
        set.add(7.0);
        set.add(56.0);
        boolean r2 = set.add(3.0);// проверяет, если есть объект с таким хначением в нашей коллекцие то больше его не выводит!!!
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        System.out.println("   ");
        for (Double s:set){
            System.out.print(s + "   ");
        }

        System.out.println("   ");

        Set<Double> tree = new TreeSet<Double>();//Дерево - это множество элементов, каждыйэлемент которого является узлом от которого идут следующие элементы
       // получим результат в которм упорядоченызначения по умолчанию!!!
        tree.add(3.0);
        tree.add(11.8);
        tree.add(5.0);
        tree.add(7.0);
        tree.add(56.0);
        for (Double t:tree){
            System.out.print(t + "   ");
        }

        System.out.println("   ");

        Set<Double> setLink = new LinkedHashSet<Double>();//используется тогда когда нам необходимо помнить в каком по0рядке данные были добавлены в коллекцию
        setLink.add(11.9);
        setLink.add(11.8);
        setLink.add(5.0);
        setLink.add(7.0);
        setLink.add(56.0);
        for (Double l:setLink){
            System.out.print(l + "   ");
        }

        //Queue - очередь. Важно знать когда и какой элемент был добпавлен чтобы потом его получить

        Queue<Integer> que = new LinkedList<Integer>();
        que.offer(2879); // метод .offer ставит новый элемент в конец очереди
        que.offer(43);
        que.offer(67);
        que.offer(8);
        que.offer(0);

        que.poll();// получает первый элемент и удаляет его с очереди
        que.peek();//получает первый элемент но не удаляет его с очереди, можем зациклить программу

        System.out.println("   ");

        for (Integer g:que)System.out.println(g+ " ");

       // while (que.size() > 0) System.out.println(que.poll());//не выводится элемент с индексом 0??????????

        //vector collection
         Vector<Integer> vect = new Vector<Integer>();
        vect.add(25);
        vect.get(0);

        // stack - возвращает последний записанный элемент первым

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(12);
        stack.push(33);
        stack.push(89);
//        System.out.println(stack.pop());//получили посладний элемент
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        while (stack.size() > 0) System.out.println(stack.pop());


        // коллекции пара: ключ/значение. например, ключ это уникальный ID юзера - значение - это его логин и пароль

        Map<Integer, String>  hashMap = new HashMap<Integer, String>();// можно описать 2 параметра аргумента шалона
        hashMap.put(21, "Test1");
        hashMap.put(90, "Test2");
        hashMap.put(99, "Test3");
        hashMap.put(11, "Test4");
        System.out.println(hashMap);
        Set<Integer> s = hashMap.keySet();//создалась новая коллекция в которой только ключи

        System.out.println(hashMap.get(90));// получаем значение по ключу!
        // чтобы вывести всю коллекцию, необходимо использовать интерфейс Entry
        for (Map.Entry<Integer,String> entry: hashMap.entrySet()){
            int key = entry.getKey();
            entry.getValue();//можем получить значение значения и ключа
            System.out.println(entry);//entrySet - метод который приводит тип обьекта к типу Entry
        }

        Map<Integer, Boolean> linkedMap = new LinkedHashMap<Integer, Boolean>();
        linkedMap.put(3,true);
        System.out.println(linkedMap.containsKey(6));//метод проверяет есть ли такой ключ
        System.out.println(linkedMap.containsValue(false));//метод проверяет есть ли такое значение
    //TreeMap
        Map<String, Integer> treeMap = new TreeMap< String,Integer>();//treeMap по умолчанию сортирует по ключам список, по возрастанию ключа
        treeMap.put("Test1", -3);
        treeMap.put("rsdz1", 783);
        treeMap.put("Tn nbn", 0);
        System.out.println(treeMap);

        Map< String,Integer> sortedMap = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
        sortedMap.putAll(treeMap);

    }
}
