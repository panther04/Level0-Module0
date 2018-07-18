import java.awt.AWTException;


import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class shapinggod {
public static void main(String[] args) {
	Robot one = new Robot("mini");
String color=JOptionPane.showInputDialog("How many sides do you want");
	for (int i = 0; i < Integer.parseInt(color); i++) {
		System.out.println(i);
		one.penDown();
		one.setSpeed(100);
		one.move(30);
	}
	for (int i = 0; i <Integer.parseInt(color) ; i++) {
		System.out.println(color);
		one.penDown();
		one.setSpeed(100);
		one.move(30);
		one.turn(180);
	}

	for (int i = 0; i < Integer.parseInt(color) ; i++) {
		System.out.println(i);
	one.penDown();
	one.setSpeed(100);
	one.move(30);
	one.turn(120);	
	}
	
	for (int i = 0; i < Integer.parseInt(color); i++) {
		System.out.println(color);
		one.penDown();
		one.setSpeed(100);
		one.move(30);
		one.turn(90);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
