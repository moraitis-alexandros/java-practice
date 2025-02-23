package cf.ch22_swingfrontend;

import jdk.jfr.Event;

import java.awt.*;

public class Main {

    private static final   HelloFrame helloFrame = new HelloFrame();

    public static void main(String[] args) {

//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                helloFrame.setVisible(true);
//            }
//        });

        //or equally with lamdas
        EventQueue.invokeLater(() -> helloFrame.setVisible(true));



    }
}
