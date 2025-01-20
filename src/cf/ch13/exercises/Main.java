package cf.ch13.exercises;

public class Main {

    public static void main(String[] args) {

        PointXYZ pointXYZ = new PointXYZ(4, 3, 1);
        System.out.println("XYZ: " + pointXYZ.getXYZDistance());
        System.out.println("XZ: " + pointXYZ.getXZDistance());
        System.out.println("XY: " + pointXYZ.getXYDistance());
        System.out.println("YZ: " + pointXYZ.getYZDistance());
    }//main


}//class
