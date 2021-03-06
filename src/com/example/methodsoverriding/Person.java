package com.example.methodsoverriding;

public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public int hashCode() {
        return this.age;
    }

    @Override
    public boolean equals(Object obj) {
        Person otherPerson = (Person) obj;
        return this.name.equals(otherPerson.name) && this.age == otherPerson.age;
    }

    @Override
    public String toString() {
        return this.name +", "+ this.age;
    }
}
