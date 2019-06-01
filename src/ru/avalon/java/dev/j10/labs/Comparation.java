package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

/**
 * Реализация интерфейса Comparator
 * @author antonneverovich
 */
public class Comparation implements Comparator<String> {

    @Override
    public int compare(String s, String s1) {
        if (s.charAt(0) < s1.charAt(0)) { // сортируем по убыванию
            return 1;
        } else if (s.charAt(0) == s1.charAt(0)) {
            return 0;
        } else {
            return -1;
            
        }
    }
    
}
