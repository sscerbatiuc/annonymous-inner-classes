package it.step.innerstatic;

class Animal {

    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // inner class
    static class Reptile extends Animal{

        public void displayInfo() {
            System.out.println("Reptila." + getName());
        }
    }

    // static class
    static class Mammal {
        public void displayInfo() {
            System.out.println("Mamifer.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        // object creation of the outer class
        Animal animal = new Animal();

        // object creation of the non-static class
        Animal.Reptile reptile = new Animal.Reptile();
        reptile.displayInfo();

        // object creation of the static nested class
        Animal.Mammal mammal = new Animal.Mammal();
        mammal.displayInfo();

    }
}
