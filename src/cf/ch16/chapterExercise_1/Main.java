package cf.ch16.chapterExercise_1;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(12, 22);
        Line line = new Line(122,232.5);
        Rectangle rec = new Rectangle(22, 44.3, 100);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Rectangle area: " + rec.getArea());
        System.out.println("Line area: " + line.getLength());


    }//main


}//class
