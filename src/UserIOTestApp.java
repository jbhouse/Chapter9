
public class UserIOTestApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Console Tester Application \n");
		ConsoleIO myConsole = IOFactory.getUserIO();
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
	}

}
