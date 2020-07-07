package com.shumsky.heap;

public class Person {
    private int age;
    private String fullName;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.age = age;
        this.fullName = fullName;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void move() {
        System.out.println("Idet");
    }

    public void talk() {
        System.out.println("Govorit");
    }

    public static void trogat() {
        System.out.println("ne nado");
    }

    @Override
    public String toString() {
        return "Person{" + " fullname=" + fullName + '\'' + ",age= " + age + '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Person)) return false;

        Person that = (Person) object;

        if (age != that.age) return false;
        return fullName.equals(that.fullName);
    }
}
