package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday": 
			System.out.println("Sorry, but the churches are closed due to COVID19. I hope God understands.");
			break;
		case "Monday": 
			System.out.println("Don't mention today's name to Garfield. He might go beserk.");
			break;
		case "Tuesday": 
			System.out.println("Isn't it weird to not physically be at school at this poiint in the week?");
			break;
		case "Wedneday": 
			System.out.println("By now youv'e probably adjusted to the new scedules.");
			break;
		case "Thursday": 
			System.out.println("You ate five snickers bars during class today. Probably because your desk is next to the pantry now.");
			break;
		case "Friday": 
			System.out.println("In a normal school week, you'd rejoice at the coming of the weekend. But your still home all day, so there is very little difference.");
			break;
		case "Saturday":
			System.out.println("Somehow, Saturday no longer feels mystical. You don't have to go to school, but you weren't all week anyways.");
			break;
		}
		}
}
