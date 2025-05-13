package bcc.swinggame;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class HelloWorldExample{
    public HelloWorldExample(){
        JFrame frame = new JFrame("Hello World");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Good luck!");
        frame.add(label);

		frame.setSize(400, 400);
		frame.setVisible(true);
    }
}