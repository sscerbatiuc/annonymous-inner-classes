package it.step.inner.with.person;

public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("Person is working");
    }

    public class Passport {
        private String number;

        public Passport(String number) {
            this.number = number;
        }

        public String getInfo() {
            return this.number + " " + name;
        }
    }

}
