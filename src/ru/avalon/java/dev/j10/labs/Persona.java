package ru.avalon.java.dev.j10.labs;

import java.util.Date;

/**
 *
 * @author antonneverovich
 */
public class Persona implements Person {

    private String name;
    private Date date;
    private String[] strings;

    public Persona() {
        this.name = Initializer.randomName(Initializer.NAME);
        this.date = Initializer.randomDate();
    }
    
    public Persona(String[] strings) {
        this.strings = strings;
    }
    
    /**
     * getters
     */
    @Override
    public String getName() {return name; }
    @Override
    public Date getBirthDate() { return date; }
    public String[] getStrings() { return strings; }

    @Override
    public int compareTo(Person p) {
        if(this.getName().charAt(0) > p.getName().charAt(0)) {
            return 1;
        } else if(this.getName().charAt(0) < p.getName().charAt(0))  {
            return -1;
        } else { 
            if (this.getBirthDate().getTime() > p.getBirthDate().getTime()) {
                return 1;
            } else if (this.getBirthDate().getTime() < p.getBirthDate().getTime()) {
                return -1;
            } else 
                return 0;
        }
    }

    
    @Override
    public String toString() {
        return name + ":\t\t" + date + "\n";
    }
    
    
}
