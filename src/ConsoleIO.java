import java.util.Scanner;

public class ConsoleIO implements UserIO {

	
	public ConsoleIO() {
//		the directions say that the constructor here should create an instance of the 
//		scanner class. but that just seems wrong to me. I'll revisit this though.
//		this class is nowhere near done, I am just pushing these changes as it is nearly the end of the day
//		Scanner sc = new Scanner(System.in);
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
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(prompt);
			if (sc.hasNextInt()) {
				int thisInt = sc.nextInt();
				sc.close();
				return thisInt;
			} else {
				System.out.println("That was not a valid integer. Try again please.");
				continue;
			}
		}

	}

	@Override
	public int getInt(String prompt, int min, int max) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getDouble(String prompt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getDouble(String prompt, double min, double max) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getString(String prompt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getString(String prompt, String s1, String s2) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
