package chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TextArea1 implements ActionListener, ItemListener {

    JTextArea text;
    JCheckBox check;

    public static void main(String[] args) {
        TextArea1 gui = new TextArea1();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Just click it !");

        check = new JCheckBox("Goes to 11");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        check.addItemListener(this);

        check.setSelected(true);
        check.setSelected(false);

        button.addActionListener(this);

        text = new JTextArea(10, 20);
        text.setLineWrap(true);

        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroller);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.WEST, check);

        frame.setSize(350, 300);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        text.append("button clicked \n ");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String onOrOff = "off";

        if (check.isSelected()) onOrOff = "on";
        System.out.println("Check box is " + onOrOff);
    }
}
