package swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingObserverExample {
   JFrame frame;
   public static void main(String[] args) {
      SwingObserverExample example = new SwingObserverExample();
      example.go();
   }
   public void go() {
      frame = new JFrame();

      JButton button = new JButton("Should I do it?");
      button.addActionListener(event ->
         System.out.println("Don't do it, you might regret it!"));
      button.addActionListener(event ->
         System.out.println("Come on, do it!"));

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(button, BorderLayout.CENTER);
      frame.pack();
      frame.setVisible(true);
   }
}