package cf.ch7;

public class StringBuilderApp {

    public static void main(String[] args) {
        String concatStr="";

        long timeStart = 0L;
        long timeEnd = 0L;
        double elapsedTime = 0.0;
        double stringBuilderElapsedTime = 0.0;
        StringBuilder stringBuilder = new StringBuilder();

        timeStart = System.currentTimeMillis(); //long
        for (int i = 0; i <= 50_000; i++) {
            concatStr = concatStr + i;
        }
        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) /1000.0;

        timeStart = System.currentTimeMillis(); //long
        for (int i = 0; i <= 100_000; i++) {
            stringBuilder.append(i); //Δεν είναι immutable οπότε δεν χρησιμοποιεί θέσεις στο heap
        }
        timeEnd = System.currentTimeMillis();
        stringBuilderElapsedTime = (timeEnd - timeStart) /1000.0;

        System.out.println("String elapsed Time: "+elapsedTime+" seconds");
        System.out.println("String elapsed Time: "+stringBuilderElapsedTime+" seconds");
    }//main
}//class
