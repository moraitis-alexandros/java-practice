package cf.ch7;

public class ChapterExercise {
    static String word = "KOUKOU TSATSA AOU AOU";
    static int key = 3;
    static String codedWord;
    static int[] wordTable = new int[word.length()];
    static int[] codedWordTable = new int[word.length()];
    static int base = 'A';

    public static void main(String[] args) {
        initialize();
        encode();
        decode();



    }//main

    static void initialize() {
        for (int i= 0; i < word.length(); i++) {
            wordTable[i] = word.charAt(i);
        }

//        for (int el : wordTable) {
//            System.out.println(el);
//        }
    }//initiallize

    static void normalize(char ch) {

    }//normalize

    static void encode() {
        //Add the key

        for (int i = 0; i < word.length(); i++) {
            if (wordTable[i] == 32) {
                codedWordTable[i] = wordTable[i];
            } else {
                codedWordTable[i] = ((wordTable[i] - base + key) % 26) + base; /*ΠΡΟΣΟΧΗ
                πρέπει να κάνω normalize γιατί υπάρχει ενδεχόμενο στα τελευταία π.χ z
                να βγει εκτός αλφαβήτου*/
            }
        }

        //Create the string word with string builder
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            stringBuilder.append((char)codedWordTable[i]);
        }

        System.out.println(stringBuilder.toString());
    }//encode

    static void decode() {
        //Add the key
        for (int i = 0; i < word.length(); i++) {

            if (wordTable[i] == 32) {
                codedWordTable[i] = wordTable[i];
            } else {
                wordTable[i] = ((codedWordTable[i] + base - key) % 26) + base;/*ΠΡΟΣΟΧΗ
                πρέπει να κάνω normalize γιατί υπάρχει ενδεχόμενο στα τελευταία π.χ z
                να βγει εκτός αλφαβήτου*/
            }
        }

        //Create the string word with string builder
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            stringBuilder.append((char)wordTable[i]);
        }

        System.out.println(stringBuilder.toString());
    }//decode


}//class
