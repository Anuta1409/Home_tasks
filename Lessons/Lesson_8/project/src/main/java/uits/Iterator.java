package uits;
/**
 * Created by Anna on 05.12.2015.
 */

/**
 * Iterator - то что ходит по массиву или коллекции
 * Методы;
 * 1) hasNest - естьли элемент который мы можем вывести
 * 2) next - выводит леметны коллекции
 * Object - родитель всех классов
 */
public interface Iterator {
    public boolean hasNest();//проверяет, естьлиследующий элемент
    public Object next();// возвращает следующий элемент

}
