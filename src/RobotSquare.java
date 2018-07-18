/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot frog = new Robot();

        // 3. Put the robot's pen down
frog.penDown();

        // 6. Make the robot move as fast as possible
frog.setSpeed(100);

        // 5. Do everything below here 4 times
frog.move(200);
frog.turn(90);
frog.move(200);
frog.turn(90);
frog.move(200);
frog.turn(90);
frog.move(200);
frog.turn(90);
        //         2. Move your robot 200 pixels
frog.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
frog.turn(90);

    }
}
