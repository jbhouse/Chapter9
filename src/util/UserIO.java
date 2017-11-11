package util;
import java.util.Scanner;

public interface UserIO extends UserOutput, UserInput {
	Scanner sc = new Scanner(System.in);
}
