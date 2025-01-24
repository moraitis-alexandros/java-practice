package cf.ch14.chapterExercises.StringUtils;

public class Main {

    public static void main(String[] args) {
        String string1 = "Koukos";
        String string2 = "anna";

        System.out.println("Uppercase: " + StringUtils.upperCaseString(string1));
        System.out.println("Reversed: " + StringUtils.reverseString(string1));
        System.out.println("Is palindromic: " + StringUtils.isPalindromic(string1));

        System.out.println("Uppercase: " + StringUtils.upperCaseString(string2));
        System.out.println("Reversed: " + StringUtils.reverseString(string2));
        System.out.println("Is palindromic: " + StringUtils.isPalindromic(string2));

        System.out.println(string1 + " length between 1-31: " + ValidationUtils.hasLengthFromOneToThirtyOne(string1));
        System.out.println(string1 + " length between 1-10: " + ValidationUtils.hasLengthFromOneToTen(string1));
        String string3 = "safhskdhfkshdfhskdhfskdhfksjdhfks"; // more than 31
        System.out.println(string3 + " length between 1-31: " + ValidationUtils.hasLengthFromOneToThirtyOne(string3));
        System.out.println(string3 + " length between 1-10: " + ValidationUtils.hasLengthFromOneToTen(string3));



    }//main


}//class
