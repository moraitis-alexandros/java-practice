package cf.ch16.chapterExercise_2;

public class Rectangle extends AbstractShape implements IRectangle {

    private double width;
    private double height;

    public Rectangle(long id, double width, double height) {
        super(id);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width * height);
    }

    @Override
    public long getCircumference() {
        return (long)(2 * (width + height));
    }
}
