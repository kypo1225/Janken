package player;

import java.util.Random;

import logic.Janken;

public class Npc {
	static Janken id;

	public static Janken npcPlayer() {
		Random r = new Random();

		id = Janken.valueOf(r.nextInt(3));

		return id;
	}
}
