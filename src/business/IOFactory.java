package business;
import java.util.Scanner;

import util.ConsoleIO;
import util.UserIO;

public class IOFactory {
	
	public static UserIO getUserIO(String prompt) {
//		I dont think i should worry about closing sc. but maybe I'm wrong.
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print(prompt);
			String s = sc.next();
			if (s.equalsIgnoreCase("g")) {
				JOptionPanelIO newPanel = new JOptionPanelIO();
				return newPanel;
			} else if (s.equalsIgnoreCase("c")) {
				ConsoleIO newConsole = new ConsoleIO();
				return newConsole;
			} else {
				System.out.println("that wasnt valid");
				sc.next();
				continue;
			}
		}
	}
	
}
