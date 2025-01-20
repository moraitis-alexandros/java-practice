package cf.ch15;

public class Main {

    public static void main(String[] args) {
        ISpeakable cat = new Cat("Alice");
        ISpeakable dog = new Dog("Bob");
        GenericSpeakingSchool genericSpeakingSchool = new GenericSpeakingSchool(cat);
        GenericSpeakingSchool genericSpeakingSchool2 = new GenericSpeakingSchool(dog);


//        cat.speak();
//        dog.speak();
//
//        doSpeak(dog);
//        doSpeak(cat);

        genericSpeakingSchool.learnToSpeak();
        genericSpeakingSchool2.learnToSpeak();

    }//main

    public static void doSpeak(ISpeakable iSpeakable) {
        iSpeakable.speak();
    }


}//class
