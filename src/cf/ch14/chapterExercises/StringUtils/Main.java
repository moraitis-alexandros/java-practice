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


    }//main


}//class
