package logic;

import player.Npc;
import player.User;

public class Main {

	public static void main(String[] args) {
		System.out.println(Janken.GU.getCode());
		System.out.println(Npc.npcPlayer());
		User.userPlayer();
	}
}
