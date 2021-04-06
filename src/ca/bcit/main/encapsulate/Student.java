package ca.bcit.main.encapsulate;

public class Student {
    // Encapsulation means setting of variables happens in methods

    // make all instance fields private
    private String name;
    private int age;

    // use getters to retrieve values
    public String getName() {
        return this.name;
    }

    // use setters to set values
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
