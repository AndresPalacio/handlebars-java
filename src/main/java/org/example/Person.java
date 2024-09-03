package org.example;

import java.util.HashMap;
import java.util.Map;

public class Person {

    public final String name;
    private final Map<String, Object> data;
    private final int age;

    public Person(String name, Map<String, Object> data) {
        this.name = name;
        this.data = data;
        this.age = 0; // Default age if not provided
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.data = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Map<String, Object> getData() {
        return data;
    }
}