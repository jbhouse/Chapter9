import java.util.Scanner;

public class ConsoleIO implements UserIO {

	Scanner sc = new Scanner(System.in);
	
	public ConsoleIO() {
//		the directions say that the constructor here should create an instance of the 
//		scanner class. but that just seems wrong to me. I'll revisit this though.
	}

	@Override
	public void print(String s) {
		System.out.print(s);
	}

	@Override
	public void println() {
		System.out.println();
	}

	@Override
	public void println(String s) {
		System.out.println(s);
	}

	@Override
	public int getInt(String prompt) {
		while (true) {
			System.out.println(prompt);
			if (sc.hasNextInt()) {
				int thisInt = sc.nextInt();
				return thisInt;
			} else {
				System.out.println("That was not a valid integer. Try again please.");
				sc.nextLine();
//				continue;
			}
		}

	}

	@Override
	public int getInt(String prompt, int min, int max) {
		while(true) {
			System.out.print(prompt);
			if(sc.hasNextInt()) {
				int nxtInt = sc.nextInt();
				if(nxtInt>min&&nxtInt<max) {
					return nxtInt;
				} else {
					System.out.println("You must enter a value between "+min+" and "+max+"\n");
					continue;
				}
			} else {
				System.out.println("I'd appreciate an int here");
				sc.next();
				continue;
			}
		}
	}

	@Override
	public double getDouble(String prompt) {
		while(true) {
			System.out.print(prompt);
			if(sc.hasNextDouble()) {
				return sc.nextDouble();
			} else {
				System.out.println("That was not an integer.\n");
				sc.next();
				continue;
			}
		}
	}

	@Override
	public double getDouble(String prompt, double min, double max) {
		while(true) {
			System.out.print(prompt);
			if(sc.hasNextDouble()) {
				double nxtDouble = sc.nextDouble();
				if(nxtDouble>min&&nxtDouble<max) {
					return nxtDouble;
				} else {
					System.out.print("You must enter a value between "+min+" and "+max+"\n");
					sc.next();
					continue;
				}
			} else {
				System.out.print("I'm lookin for a double here\n");
				sc.next();
				continue;
			}
		}
	}

	@Override
	public String getString(String prompt) {
		int count = 0;
		while (true) {
			System.out.print(prompt);
			String input = sc.nextLine();
			if(!input.isEmpty()) {
				return input;
			} else {
				if (count==0) {
					count++;
					sc.nextLine();
					continue;
				} else {
					System.out.println("I'm looking for a string here. hit enter and try again");
					sc.nextLine();
					continue;
				}
			}
		}
	}

	@Override
	public String getString(String prompt, String s1, String s2) {
		System.out.print(prompt);
		while (true) {
			String input = sc.next();
			if(input.equalsIgnoreCase(s1)||input.equalsIgnoreCase(s2)) {
				return input;
			} else {
				System.out.print("Please enter either "+s1+" or "+s2); 
				continue;
			}
		}
	}
	
}
