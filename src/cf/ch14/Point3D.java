package cf.ch14;

public class Point3D extends Point2D {
    private double z;

    public Point3D() {
        super(); //constructor chaining
        z = 0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

//    @Override
//    public String pointToString() {
//        return super.pointToString() + "(" + z + ")";
//    }


    @Override
    public String toString() {
        return super.toString() + "(" + z + ")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        z += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        z += 1;
    }
}//class
