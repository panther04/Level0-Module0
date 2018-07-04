package extra;

import org.jointheleague.graphical.robot.Robot;

public class robotgrafity {
public static void main(String[] args) {
	Robot bird = new Robot();
	bird.setSpeed(100);
	bird.penDown();
	bird.turn(40);
	bird.move(100);
	bird.turn(100);
	bird.move(100);
	bird.move(-50);
	bird.turn(120);
	bird.move(100);
	bird.hide();
	
	
	
}
}
