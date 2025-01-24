package cf.ch16.chapterExercise_2;

public class Line extends AbstractShape implements ILine {

    private double length;

    public Line(long id, double length) {
        super(id);
        this.length = length;
    }

}
