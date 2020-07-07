package com.shumsky.heap;

public class LessonN {
    public static void main(String[] args) {
        Person person1 = new Person("anton", 32);
        Person person3 = new Person("anton", 32);
        Person person2 = new Person();
        person2.setAge(32);
        person2.setFullName("aleshka");



        System.out.println(person2.equals(person3));
        System.out.println(person1.equals(person3));
    }
}
