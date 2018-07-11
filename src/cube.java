import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class cube {
public static void main(String[] args) {
String hil=JOptionPane.showInputDialog("Are you felling 3D today");
Robot hi = new Robot("mini");
Robot hill = new Robot("mini");	
if (hil.equals("yes")) {
		
	
	Robot cube = new Robot("mini");
	cube.setSpeed(100);
	cube.penDown();
	cube.move(30);
	cube.turn(90);
	cube.move(30);
	cube.turn(90);
	cube.move(30);
	cube.turn(90);
	cube.move(30);
	cube.turn(90);
	cube.move(30);
	cube.turn(45);
	cube.move(30);
	cube.turn(45);
	cube.move(30);
	cube.turn(90);
	cube.move(30);
	cube.turn(45);
	cube.move(30);
	cube.turn(135);
	cube.move(30);
	cube.turn(45);
	cube.move(30);

}
	else if (hil.equals("no")) {
	
		
	
		
	hill.penDown();
	hill.setSpeed(100);hill.move(30);
	hill.turn(90);
	hill.move(30);
	hill.turn(90);
	hill.move(30);
	hill.turn(90);
	hill.move(30);
	hill.turn(90);
	hill.move(30);	
	
	}
	else  {
		hi.penDown();
		hi.setSpeed(100);
		hi.move(10000);
	}
		
	



}
}