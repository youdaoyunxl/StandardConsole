package com.juven.java8.jihe;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {

    private String name;
    private String number;

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("(%s,%s)", this.name, this.number);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash =  47 * hash + Objects.hashCode(this.name);
        hash =  47 * hash + Objects.hashCode(this.number);
        return hash;
    }

    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        Student s1 = new Student("Justin", "B835031");
        Student s2 = new Student("Monica", "B835032");
        Student s3 = new Student("Justin", "B835031");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(s1.getClass());
    }

}
