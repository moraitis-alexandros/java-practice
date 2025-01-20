package cf.ch14.chapterExercises.mathHelper;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{5, 10 ,15};

        System.out.println("Avg: " + MathHelper.getAvg(array));
        System.out.println("Max: " + MathHelper.getMax(array));
        System.out.println("Min: " + MathHelper.getMin(array));


    }
}
