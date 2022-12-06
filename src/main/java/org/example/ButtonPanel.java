package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    JButton but1 = new JButton("BUTTON");
    //but1=new JButton("Press me");
    public ButtonPanel(){
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");

            }


        });
        add(but1);
    }


}
