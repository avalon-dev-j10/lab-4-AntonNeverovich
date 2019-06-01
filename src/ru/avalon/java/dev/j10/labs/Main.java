package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        
            /*
             * TODO(Студент): Проинициализируйте массив strings
             *
             * Массив слелдует проинициализировать таким образом,
             * чтобы он содержал 20 строк, расположенных не
             * по порядку.
             */
        String[] strings = new String[20];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = Initializer.randomName(Initializer.CITY);
        } 
            
        // Проверка инициализации массива
        System.out.println("Массив string: " + "\n" + Arrays.toString(strings));
            
	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	Person[] persons = new Person[20];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Persona();
        }
        
        // Проверка инициализации массива
        System.out.println("Неотсортированный массив: " + "\n" + Arrays.toString(persons));

            /*
             * TODO(Студент): Проинициализируйте переменную sort
             *
             * 1. Создайте класс, реализующий интерфейс Sort
             *
             * 2. Проинициализируйте переменную sort экземпляром
             *    созданного класса.
             */
        Sort sort = new Sorting();

            /*
             * TODO(Студент): Проинициализируйте переменную comparator
             *
             * 1. Создайте класс, реализующий интерфейс Comparator.
             *    Подумайте о контексте, в котором будет
             *    использоваться экземпляр.
             *
             * 2. Проинициализируйте переменную comparator
             *    экземпляром созданного класса.
             */
        Comparator comparator = new Comparation();
        
            /*
             * TODO(Студент): Отсортируйте массив persons по возрастанию
             *
             * 1. Если всё сделано правильно, предложенный вызов
             *    метода sort должен отсортировать массив по
             *    возрастанию.
             *
             * 2. С использованием отладчика убедитесь в том,
             *    что массив отсортирован по возрастанию.
             */
        sort.sort(persons);

        // Проверка сортировки
        System.out.println("Отсортированный массив: " + "\n" + Arrays.toString(persons));
        
        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);
        
        // Проверка сортировки
        System.out.println("Отсортированный массив: " + "\n" + Arrays.toString(strings));

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, comparator);
        
        // Проверка сортировки
        System.out.println("Отсортированный массив по убыванию: " + "\n" + Arrays.toString(strings));
    }
}
