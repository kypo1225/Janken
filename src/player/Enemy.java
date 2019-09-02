package player;

import java.util.Random;

import logic.Janken;

public class Enemy {
	static Janken hand;

	static Janken id;

	public static Janken enemyHand() {
		Random r = new Random();
		id = Janken.valueOf(r.nextInt(3));

		return id;
	}
}
