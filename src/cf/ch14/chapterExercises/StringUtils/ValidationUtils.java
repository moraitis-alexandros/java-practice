package cf.ch14.chapterExercises.StringUtils;

/**
 * Utility class for validating string
 */
public class ValidationUtils {

    private ValidationUtils() {

    }//private constructor


    public static boolean hasLengthFromOneToThirtyOne(String string) {
        return ((!string.isEmpty()) && (string.length() <= 31)) ;
    }

    public static boolean hasLengthFromOneToTen(String string) {
        return ((!string.isEmpty()) && (string.length() <= 10)) ;
    }



}//class
