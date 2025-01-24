package cf.ch16.chapterExercise_2;


public abstract class AbstractShape implements IShape {

    private long id;

    public AbstractShape(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
