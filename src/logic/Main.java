package logic;

import player.Enemy;
import player.User;

public class Main {

	public static void main(String[] args) {
		System.out.println("じゃーんけーん");
		System.out.println("あなたは" + User.userHand() + "を出しました");
		System.out.println("相手は" + Enemy.enemyHand() + "を出しました");
		Battle b = new Battle();
		b.Result();
	}
}
