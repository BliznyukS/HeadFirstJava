package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3C implements ActionListener {

    JFrame frame3C;

    public static void main(String[] args) {
        SimpleGui3C gui3C = new SimpleGui3C();
        gui3C.go();
    }

    private void go() {
        frame3C = new JFrame();
        frame3C.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button3C = new JButton("change colors");
        button3C.addActionListener(this);

        MyDrawPanel panel3C = new MyDrawPanel();

        frame3C.getContentPane().add(BorderLayout.SOUTH, button3C);
        frame3C.getContentPane().add(BorderLayout.CENTER, panel3C);
        frame3C.setVisible(true);
        frame3C.setSize(300, 300);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame3C.repaint();
    }
}
