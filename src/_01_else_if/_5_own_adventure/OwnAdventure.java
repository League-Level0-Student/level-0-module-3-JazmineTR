package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	
JOptionPane.showMessageDialog(null, "You are a detective lurking around the crime scene of the murder of Joanne Levison.You only get one chance, so make sure you don't pick the wrong choice."
		+ " As you look around you see 3 pieces of evidences so far,"
		+ "which is a kitchen knife on the carpet floor with blood on the blade,"
		+ " a piece of long black hair,"
		+ " and a shoe imprints.");
String evidence = JOptionPane.showInputDialog("Which piece of evidence would you like to explore first? "
		+ "The kitchen knife with blood, strand of hair, or shoe imprint");

if(evidence.equalsIgnoreCase("the kitchen knife with blood")){
	JOptionPane.showMessageDialog(null, "When you look at the knife, there are fingerprints on the handle of the knife.You quickly put into a bag for further examination");
    String further = JOptionPane.showInputDialog("Would you like to search for more evidence or explore the other two evidences?");  
    if(further.equalsIgnoreCase("Search for more evidence")) {
    JOptionPane.showMessageDialog(null, " You should have chosen explore the other two evidences, since those were the only evidences for this crime scene");
    JOptionPane.showMessageDialog(null, "You have just wasted your time! Mission Failed!");
    System.exit(0);
    }
    else {
    	JOptionPane.showMessageDialog(null, "Good choice!");
    	String explore = JOptionPane.showInputDialog("Now, which one would you like to explore next? Strand of hair or shoe imprint");
   
    	if(explore.equalsIgnoreCase("Strand of hair")) {
    		JOptionPane.showMessageDialog(null, "When you look at the strand of hair, you compare it to the victim's body to see if it is the same color and thickness.");
    		 String hair = JOptionPane.showInputDialog("Would you like the strand of hair to match the victim's hair or would you like it to be the murderer's hair?");
    		if(hair.equalsIgnoreCase("Match with the victim")) {
    			JOptionPane.showMessageDialog(null, "false alarm, just the hair of the victim");
    			
    		}
    		else if(hair.equalsIgnoreCase("murderer's hair")) {
    			JOptionPane.showMessageDialog(null, "Another piece of evidence for examination");
    	}
    			
    		if(explore.equalsIgnoreCase("shoe imprint")) {
    			
    		}
    }
 	 
    
else if(evidence.equalsIgnoreCase("strand of hair")) {
	JOptionPane.showMessageDialog(null, "When you look at the strand of hair, you compare it to the victim's body to see if it is the same color and thickness.");
	 String hair = JOptionPane.showInputDialog("Would you like the strand of hair to match the victim's hair or would you like it to be the murderer's hair?");
	if(hair.equalsIgnoreCase("Match with the victim")) {
		JOptionPane.showMessageDialog(null, "false alarm, just the hair of the victim");
		
	}
	else if(hair.equalsIgnoreCase("murderer's hair")) {
		JOptionPane.showMessageDialog(null, "Another piece of evidence for examination");
	}
		String next = JOptionPane.showInputDialog("Now, which evidence would you like to explore next? Kitchen knife or shoe imprint?");
if(next.equalsIgnoreCase("Kitchen knife")) {
	JOptionPane.showMessageDialog(null, "When you look at the knife, there are fingerprints on the handle of the knife.You quickly put into a bag for further examination");
    String look = JOptionPane.showInputDialog("Would you like to search for more evidence or explore the other two evidences?");  
    if(look.equalsIgnoreCase("Search for more evidence")) {
    JOptionPane.showMessageDialog(null, " You should have chosen explore the other two evidences, since those were the only evidences for this crime scene");
    JOptionPane.showMessageDialog(null, "You have just wasted your time! Mission Failed!");
    System.exit(0);
    }
    else {
    	JOptionPane.showMessageDialog(null, "Good choice!");
}
}
else if (next.equalsIgnoreCase("shoe imprint")) {
	JOptionPane.
}
}
}
}
}
}

 