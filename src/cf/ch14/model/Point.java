package cf.ch14.model;

import java.util.Random;

public class Point {

    private int x;
    private int y;

    private Point() {

    }//constructor

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }//overloaded constructor

    public static Point getInstance() {
        return new Point();
    }

    public static Point getRandomPoint() {
        Random random = new Random(System.currentTimeMillis());
        return new Point(random.nextInt(10), random.nextInt(10));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}//class
