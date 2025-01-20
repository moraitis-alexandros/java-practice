package cf.ch14;

import cf.ch14.model.Point;
import cf.ch14.model.Teacher;
import cf.ch14.services.CodingFactorySingleton;
import cf.ch14.services.HelloUtil;


public class Main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "Ath", "Koukou1");
        Teacher teacher2 = new Teacher(2, "B", "Koukou2");
        Teacher teacher3 = new Teacher(3, "C", "Koukou3");

        HelloUtil.sayHello();

//        Point point = new Point(); //Does not work because all contructors are private
        Point point = Point.getInstance(); //static factory method #1
        Point point2 = Point.getRandomPoint(); //static factory method #2

        CodingFactorySingleton cf1 = CodingFactorySingleton.getInstance();
        CodingFactorySingleton cf2 = CodingFactorySingleton.getInstance();

        System.out.println(cf1);
        System.out.println(cf2);


    }//main


}//class
