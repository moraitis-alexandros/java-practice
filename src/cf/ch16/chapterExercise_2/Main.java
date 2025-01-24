package cf.ch16.chapterExercise_2;



public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12, 22);
        Rectangle rec = new Rectangle(22, 44.3, 100);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Rectangle area: " + rec.getArea());

        System.out.println(rec.getCircumference());


    }//main


}
