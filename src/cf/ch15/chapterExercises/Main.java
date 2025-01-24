package cf.ch15.chapterExercises;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog("Bob",12);
        Animal cat = new Cat("Mirella", 4);

        doSpeak(dog);
        doSpeak(cat);
    }//main

    public static void doSpeak(Animal animal) {
        animal.speak();
    }//polymorphic method




}//class
