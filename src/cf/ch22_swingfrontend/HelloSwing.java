package cf.ch22_swingfrontend;

import javax.swing.*;

public class HelloSwing {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setTitle("Koukou Swing App");
        jFrame.setSize(600,300);
        jFrame.setLocationRelativeTo(null); //
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JPanel contentPane = new JPanel();
        jFrame.setContentPane(contentPane);

        contentPane.add(new JLabel("Hello Koukou!"));
        jFrame.setVisible(true);


    }

}
