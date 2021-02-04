
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		Robot robe = new Robot();
		
		for(int i = 0; i<=10; i++) {
		String color = JOptionPane.showInputDialog("What color would you like the color of the pen to be?");
		
		
		robe.setPenWidth(10);
		
		
		
		
		if(color.equalsIgnoreCase("Blue")) {
			robe.setPenColor(0, 0, 225);
		}
		else if(color.equalsIgnoreCase("Pink")) {
			robe.setPenColor(255,192,203);
		}
		else if(color.equalsIgnoreCase("Green")) {
			robe.setPenColor(0,255, 0);
		}
		else if( color.equalsIgnoreCase("Red")) {
			robe.setPenColor(255,0, 0);
		}
		else if( color.equalsIgnoreCase("Black")) {
			robe.setPenColor(0,0, 0);
}
		else if( color.equalsIgnoreCase("Yellow")) {
			robe.setPenColor(255,255, 0);
		}
		else if( color.equalsIgnoreCase("Orange")) {
			robe.setPenColor(255,165, 0);
		}
		else if( color.equalsIgnoreCase("Purple")) {
			robe.setPenColor(128,0, 128);
		}
		else if( color.equalsIgnoreCase("Tan")) {
			robe.setPenColor(210,180, 140);
		}
		else if(color.equals("")) {
			robe.setRandomPenColor();
		}
		robe.setSpeed(15);
		robe.penDown();
		robe.move(100);
		robe.turn(90);
		robe.move(100);
		robe.turn(90);
		robe.move(100);
		robe.turn(90);
		robe.move(100);
		robe.turn(90);
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		

		}

	}
}
