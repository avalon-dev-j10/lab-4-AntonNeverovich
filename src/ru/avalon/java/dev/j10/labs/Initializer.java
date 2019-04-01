package ru.avalon.java.dev.j10.labs;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Класс, реализующий инициализацию объектов тип Persona
 * @author antonneverovich
 */
public class Initializer {
    
    // Массив имен
    public final static String[] NAME = {"Сергей", "Николай", "Дмитрий", "Михаил", 
                                "Елена", "Антон", "Жанна", "Яна", 
                                "Илона", "Константин", "Зинаида", "Ульяна",
                                "Эдуард", "Станислав", "Ольга", "Мила",
                                "Леонид", "Федор", "Георгий", "Виктор",
                                "Параскева", "Борис", "Роман", "Татьяна"};

    // Массив имен
    public final static String[] CITY = {"Москва", "Екатеринбург", "Ростов", "Санкт-Петербург",
                                "Ярославль", "Гатчина", "Стамбул", "Варшава",
                                "Лондон", "Нью-Йорк", "Донецк", "Кострома",
                                "Хельсинки", "Сткогольм", "Астана", "Мадрид",
                                "София", "Берлин", "Кейптаун", "Рио-де-Жанейро",
                                "Сан-Франциско", "Колыма", "Токио", "Пекин"};
    
    /**
     * Метод возвращает значение случайной даты.
     * @return случайная дата
     */
    public static Date randomDate() {
        Date now = new Date();
        // Задаем интервал дат в милисекундах
        long startDate = now.getTime() - (70L * 365 * 24 * 60 * 60 * 1000); 
        long endDate = now.getTime() - (18L * 365 * 24 * 60 * 60 * 1000);
        // Создаем случайную дату 
        long randomDate = ThreadLocalRandom.current().nextLong(startDate, endDate);
        return new Date(randomDate);
    }
    
    /**
     * Метод возвращает значение случайного имени.
     * @return случайное имя
     */
    public static String randomName(String[] strings) {
        int i = new Random().nextInt(strings.length - 1);
        return strings[i];
    }
    
    
}
