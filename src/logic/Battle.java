package logic;

import player.Enemy;
import player.User;

public class Battle {

	public void Result() {

		switch (Enemy.enemyHand()) {
		case グー:
			if (User.userHand() == Janken.パー) {
				System.out.println("あなたの勝ちです");
			} else if (User.userHand() == Janken.チョキ) {
				System.out.println("あなたの負けです");
			} else if (User.userHand() == Janken.グー) {
				System.out.println("あ伊子です");
			}
			break;
		case チョキ:
			if (User.userHand() == Janken.グー) {
				System.out.println("あなたの勝ちです");
			} else if (User.userHand() == Janken.パー) {
				System.out.println("あなたの負けです");
			} else if (User.userHand() == Janken.チョキ) {
				System.out.println("あいこです");
			}
			break;
		case パー:
			if (User.userHand() == Janken.チョキ) {
				System.out.println("あなたの勝ちです");
			} else if (User.userHand() == Janken.グー) {
				System.out.println("あなたの負けです");
			} else if (User.userHand() == Janken.パー) {
				System.out.println("あいこです");
			}
			break;
		}
		/*		if ((Enemy.enemyHand() == Janken.GU) && (User.userHand() == Janken.PER)) {
					System.out.println("あなたの勝ちです");
				} else if ((Enemy.enemyHand() == Janken.PER) && (User.userHand() == Janken.TYOKI)) {
					System.out.println("あなたの勝ちです");
				} else if ((Enemy.enemyHand() == Janken.TYOKI) && (User.userHand() == Janken.GU)) {
					System.out.println("あなたの勝ちです");
				} else if ((User.userHand() == Janken.GU) && (Enemy.enemyHand() == Janken.PER)) {
					System.out.println("あなたの負けです");
				} else if ((User.userHand() == Janken.PER) && (Enemy.enemyHand() == Janken.TYOKI)) {
					System.out.println("あなたの負けです");
				} else if ((User.userHand() == Janken.TYOKI) && (Enemy.enemyHand() == Janken.GU)) {
					System.out.println("あなたの負けです");
				} else {
					System.out.println("あいこでしゅ");
				}*/
	}

}
