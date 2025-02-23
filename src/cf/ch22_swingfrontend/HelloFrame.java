package cf.ch22_swingfrontend;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloFrame extends JFrame {

    public HelloFrame() {
        setTitle("Hello Coding Koukou");
        setSize(400,200);
        setLocationRelativeTo(null);
        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.add(new JLabel("Koukou Label"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton btn = new JButton();
        contentPane.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(contentPane, "Koukou","Hello", JOptionPane.INFORMATION_MESSAGE);
            }
        });



    }
}
