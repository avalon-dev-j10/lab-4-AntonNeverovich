package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting implements Sort {

    @Override
    public void sort(Object[] array) {
        if (array instanceof Comparable[]) {
            sort((Comparable[]) array);
        }
    }
    
    @Override
    public void sort(Comparable[] array) {
        Arrays.sort(array);
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        Object buffer;
        boolean condition = true;
        while (condition) {
            condition = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (comparator.compare(array[i], array[i + 1]) > 0) {
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                    condition = true;
                }  
            }
        }
    }
       
}
