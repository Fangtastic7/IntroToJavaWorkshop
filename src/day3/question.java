package day3;

import javax.swing.JOptionPane;

public class question {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello " + name + ", How are you " + name + "?");
		String name2 = JOptionPane.showInputDialog("Tell me where you live.");
		JOptionPane.showMessageDialog(null, "You live in " + name2 + ", I will go to your place: " + name2 + ".");
		String name3 = JOptionPane.showInputDialog("Tell me your social security number.");
		JOptionPane.showMessageDialog(null, "Thanks for the number: " + name3 + ", I will now 'borrow' your money.");
		JOptionPane.showInputDialog("Good Bye " + name + "!");
	}
}
