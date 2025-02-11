package cf.ch20;

public class Regex {

    public static void main(String[] args) {
        String s3 = "info@aueb.gr";
        String s = "Green";
        String s2 = " 9";
        String dateString = "12/3/2025";
        String s4 = "KOukou KK aaa";
        System.out.println(isRedOrGreen(s));
        System.out.println(beginsWithOneUpperCaseAndEndsIng(s));
        System.out.println(whiteSpaceDigit(s2));
        System.out.println(isEmail(s3));
        System.out.println(isInDateFormat(dateString));
        System.out.println(doReplace(s4));
        System.out.println(doReplaceBackReference(s4));
       String[] tokens = doSplit(s4);
       for (String token : tokens) {
           System.out.println(token);
       }
    }

    /**
     * Ελεγχει (matches) αν το input string
     * ειναι re η green
     *
     * @param s
     * @return
     */
    public static boolean isRed(String s) {
        return s.matches("red");
    }

    /**
     * Ελεγχει αν το input string ειναι "red"
     * η "green"
     *
     * @param s
     * @return
     */
    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");
    }

    /**
     * Ελεγχει αν το input string ειναι "red" η "Red"
     * η "green" η "Green"
     *
     * @param s
     * @return
     */
    public static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]ed|[gG]reen");
    }


    public static boolean beginsWithOneUpperCaseAndEndsIng(String s) {
        return s.matches("[A-Z]ing");
    }

    public static boolean isOneLetterEndIng(String s) {
        return s.matches("[A-Za-z]ing");
    }

    public static boolean whiteSpaceDigit(String s) {
        return s.matches("^\\s\\d.*");
    }

    public static boolean anySymbolDigit(String s) {
        return s.matches(".\\d");
//        return s.matches(".[0-9]");
    }

    public static boolean isEmail(String s) {
        return s.matches("\\w*\\.?\\w+@\\w+\\.[a-z]{2,4}");
    }

    public static boolean isInDateFormat(String s) {
        return s.matches("\\d{1,2}/\\d{1,2}/\\d{4}");
    }

    public static String[] doSplit(String s) {
        return s.split("\\s+"); //s for space character
    }

    public static String doReplace(String s) {
        return s.replaceAll("\\s+","&");
    }
    public static  String doReplaceBackReference(String s) {
        return s.replaceAll("(.*)\\s+(.*)", "$2 $1");
    }

}

