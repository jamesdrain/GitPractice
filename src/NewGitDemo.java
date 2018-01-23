import java.util.Scanner;

public class NewGitDemo {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String userName;
		
		System.out.println("Hi, what's your name? ");
		userName = scnr.nextLine();
		
		System.out.println(userName);
		
		scnr.close();
		
	}

}
