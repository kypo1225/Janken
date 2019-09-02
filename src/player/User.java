package player;

import java.util.Scanner;

import logic.Janken;

public class User {
	static Janken id;

	public static Janken userHand() {
		int key = new Scanner(System.in).nextInt();
		System.out.println("ポン");
		id = Janken.valueOf(key);
		return id;
	}
}
