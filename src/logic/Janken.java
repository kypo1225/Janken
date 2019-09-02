package logic;

public enum Janken {
	グー(0), チョキ(1), パー(2);

	private final int code;

	private Janken(int code) {
		this.code = code;
	}

	public static Janken valueOf(int id) {
		// values() で、列挙したオブジェクトをすべて持つ配列が得られる
		for (Janken num : values()) {
			if (num.getCode() == id) { // id が一致するものを探す
				return num;
			}
		}
		throw new IllegalArgumentException("no such enum object for the id: " + id);
	}

	public int getCode() {
		return code;
	}
}