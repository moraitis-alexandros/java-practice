package cf.ch14;

public class AnimalMain {

    public static void main(String[] args) {

        Dog dog = new Dog("Tommy", 5, "Kans");
        dog.makeSound();
        dog.searchForFood();
        doMakeSound(dog);
    }//main

    public static void doMakeSound(Animal animal) {
       animal.makeSound();
    }//πολυμορφικη μεθοδος



}//class
