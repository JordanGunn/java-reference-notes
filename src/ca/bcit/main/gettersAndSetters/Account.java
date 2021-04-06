package ca.bcit.main.gettersAndSetters;

public class Account {

    String name;
    int age;

    public static void main(String[] args) {

        Account a = new Account();

        // setting properties this way is considered
        // bad practice. We want create methods that do this
        a.age = 34;
        a.name = "Pablo";

        a.setName("Pablogne");
        System.out.println(a.getName());
        a.setAge(72);
        int pabloAge = a.getAge();


        System.out.println(a.age);
        System.out.println(a.name);

    }

    public void printDetails() {
        System.out.println(name + ", " + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
