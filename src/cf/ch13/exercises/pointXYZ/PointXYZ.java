package cf.ch13.exercises.pointXYZ;

public class PointXYZ {

    private double x;
    private double y;
    private double z;

    public PointXYZ() {

    }//default constructor

    public PointXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    /**
     * Public API
     */

    public double getXYDistance() {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public double getYZDistance() {
        return Math.sqrt(Math.pow(y,2) + Math.pow(z,2));
    }

    public double getXZDistance() {
        return Math.sqrt(Math.pow(x,2) + Math.pow(z,2));
    }

    public double getXYZDistance() {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2) +Math.pow(z,2));
    }

}//class
