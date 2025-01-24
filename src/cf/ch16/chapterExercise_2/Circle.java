package cf.ch16.chapterExercise_2;

public class Circle extends AbstractShape implements ICircle{

    private double radius;

    public Circle(long id, double radius) {
        super(id);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * Math.pow(radius,2);
    }

    @Override
    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public long getCircumference() {
        return (long)(2 * 3.14 * radius);
    }
}



