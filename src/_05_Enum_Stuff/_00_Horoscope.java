package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void fakefuture(Zodiac z) {
		switch(z) {
		case ARIES:{
			JOptionPane.showMessageDialog(null, "You will spend a lot of time at home this week");
			break;
		}
		case TAURUS:{
			JOptionPane.showMessageDialog(null, "You might be a bull");
			break;
		}
		case GEMINI:{
			JOptionPane.showMessageDialog(null, "You might have a twin, but you probably don't");
			break;
		}
		case CANCER:{
			JOptionPane.showMessageDialog(null, "Wait, your'e a Cancer? get out of my body!");
			break;
		}
		case LEO:{
			JOptionPane.showMessageDialog(null, "You will think you are better than everyone else. You wil be wrong.");
			break;
		}
		case VIRGO:{
			JOptionPane.showMessageDialog(null, "Do I have to do all twelve of these? there is a 50% chance you're a woman.");
			break;
		}
		case LIBRA:{
			JOptionPane.showMessageDialog(null, "You like laws or something");
			break;
		}
		case SCORPIO:{
			JOptionPane.showMessageDialog(null, "I dare you to eat a scorpion. OH WaIt DoN't i Was JusT KiddIng!");
			break;
		}
		case SAGITTARIUS:{
			JOptionPane.showMessageDialog(null, "You might like centaurs");
			break;
		}
		case CAPRICORN:{
			JOptionPane.showMessageDialog(null, "you are the target audience of corn-flavored capri sun");
			break;
		}
		case AQUARIUS:{
			JOptionPane.showMessageDialog(null, "You will die one day");
			break;
		}
		case PISCES:{
			JOptionPane.showMessageDialog(null, "And you are a fish! --Voldemort");
			break;
		}
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		fakefuture(_05_Enum_Stuff.Zodiac.CAPRICORN);
		fakefuture(_05_Enum_Stuff.Zodiac.SCORPIO);
	}
}
