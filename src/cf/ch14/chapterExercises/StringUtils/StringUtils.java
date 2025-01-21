package cf.ch14.chapterExercises.StringUtils;

import java.util.Objects;

public class StringUtils {

    private StringUtils() {

    }

    public static String reverseString(String string) {
        StringBuilder reversedString = new StringBuilder();
//        return reversedString.append(string).reverse().toString(); //with one line using stringbuilder reverse function
        int j = 0;
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString.insert(j, string.charAt(i));
            j++;
        }
        return reversedString.toString();
    }

    public static String upperCaseString(String string) {
            return string.toUpperCase();
    }

    public static Boolean isPalindromic(String string) {
        return Objects.equals(string, StringUtils.reverseString(string));
    }










}//class
