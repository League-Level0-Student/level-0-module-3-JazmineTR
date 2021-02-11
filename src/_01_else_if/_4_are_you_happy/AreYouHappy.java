package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
	String areYouHappy = JOptionPane.showInputDialog("Are you Happy? Yes or No?");
	
	if(areYouHappy.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you are doing!");
		System.exit(0);
	}
	else if (areYouHappy.equalsIgnoreCase("No")) {
	 String doYouString = JOptionPane.showInputDialog(null, "Do you want to be happy?" );	
	 if(doYouString.equalsIgnoreCase("Yes")) {
		 JOptionPane.showMessageDialog(null, "Change something");
	 }
	 else {
		 JOptionPane.showMessageDialog(null, "Keep doing what you are doing!");
	 }
    }
	
	}
}