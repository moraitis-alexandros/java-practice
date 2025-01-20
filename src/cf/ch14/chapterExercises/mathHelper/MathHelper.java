package cf.ch14.chapterExercises.mathHelper;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class MathHelper {

    private MathHelper() {

    }//default constructor

    public static OptionalInt getMax(int[] array) {
        return Arrays.stream(array).max();
    }

    public static OptionalInt getMin(int[] array) {
        return Arrays.stream(array).min();
    }

    public static OptionalDouble getAvg(int[] array) {
        return Arrays.stream(array).average();
    }

}//class
