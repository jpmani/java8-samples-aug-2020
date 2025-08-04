package com.java8.pgms.practice;

public class Person {
	
	String name;
    String city;

    Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String toString() {
        return name;
    }
}
