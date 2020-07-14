package GameAction;

import java.util.Scanner;

public class Turn {

	public Turn(Player play) {
		beginning();
		draw();
		action();
		end();
	}

	static void beginning() {
		System.out.print("Activate any effects card: ");
		Scanner action = new Scanner(System.in);
		String x = action.nextLine();
	}
	
	static void draw() {
		System.out.println("Draw 1 Card");
	}
	
	static void action() {
		System.out.print("Activate any effects card: ");
		Scanner action = new Scanner(System.in);
		action.nextLine();
	}
	
	static void end() {
		System.out.print("Turns End any effects?: ");
		Scanner action = new Scanner(System.in);
		String x = action.nextLine();
	}
	
	public boolean turnCheck() {
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
