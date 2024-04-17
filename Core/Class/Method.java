class Computer {
	public void playMusic() {
		System.out.println("Plays Music...");
	}

	public String getAPen(int cost) {
		if (cost >= 50)
			return "Pen";

		return "Not affordable";
	}
}

public class Method {
	public static void main(String[] args) {
		Computer comp = new Computer();
		comp.playMusic();
		String str = comp.getAPen(100);
		System.out.println(str);
	}
}
