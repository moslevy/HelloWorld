package com.example.methodsoverriding;

import java.util.LinkedHashSet;

public class TestPerson {

    public static void main(String[] args) {

        LinkedHashSet<Person> people = new LinkedHashSet<>();

        people.add(new Person("John", 20));
        people.add(new Person("Lewis", 30));
        people.add(new Person("John", 20));
        people.add(new Person("Sofia", 50));
        people.add(new Person("Maria", 60));

        for (Person p : people){
            System.out.println(p);
        }
    }


}
