package it.step.inner.with.person;

public class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person("John Smith");
        Person.Passport internal = p.new Passport("A56789");
        Person.Passport international = p.new Passport("B1234");
        System.out.println(internal.getInfo());
        System.out.println(international.getInfo());
    }
}
