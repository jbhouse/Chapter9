
public class UserIOTestApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Console Tester Application \n");
		UserIO myConsole = IOFactory.getUserIO("Type \"g\" for gui or \"c\" for console: ");
		if(String.valueOf(myConsole.getClass()).equals("class ConsoleIO")) {
			System.out.println("Int test");
			int minInt = -100;
			int maxInt = 100;
			int userInt = myConsole.getInt("Enter an integer between "+minInt+" and "+maxInt+": ", minInt, maxInt);
			System.out.println();
			System.out.println("Double Test");
			double userDouble = myConsole.getDouble("Enter an integer between "+minInt+" and "+maxInt+": ", -100.00, 100.00);
			System.out.println();
			System.out.println("Required String Test");
			String email = myConsole.getString("Enter your email address: ");
			System.out.println();
			System.out.println("String Choice Test");
			String s1 = "x";
			String s2 = "y";
			String choice = myConsole.getString("Select one ("+s1+"/"+s2+"): ", s1, s2);
			System.out.println("WOW! THE CONSOLE WORKS GREAT");
		} else if (String.valueOf(myConsole.getClass()).equals("class JOptionPanelIO")) {
//			since we know that our factory method returned a userio interface
//			with a joptionpanelio classif we reached this part of the code
//			we can then cast our interface to a joptionpanelio, and call methods
//			from its super class. giving us access to showInputDialog() && showMessageDialog()
			String userInput = ((JOptionPanelIO) myConsole).showInputDialog("Please input a value");
//			and now, after much pain, i have learned that showinputdialog is in fact, a static method...
//			ok, this was a super cool learning experience. but i started this too late at night and now it's 1am 
//			and i'll read the jpanel docs tomorrow to finish this off but for now i can pull 
//			in input through both the above and below methods and that's good enough for 1am goodnight
			String moreInput = JOptionPanelIO.showInputDialog("this is tragic");
		}
	}

}
