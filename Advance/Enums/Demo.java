package Advance.Enums;

enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum Direction {
	NORTH("N"), SOUTH("S"), EAST("E"), WEST("W");

	private final String abbreviation;

	Direction(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation() {
		return abbreviation;
	}
}

public class Demo {
	public static void main(String[] args) {

		Day today = Day.SUNDAY;

		switch (today) {
			case MONDAY:
				System.out.println("Today is Monday");
				break;
			case TUESDAY:
				System.out.println("Today is Tuesday");
				break;
			case WEDNESDAY:
				System.out.println("Today is Wedneday");
				break;
			case THURSDAY:
				System.out.println("Today is Thursday");
				break;
			case FRIDAY:
				System.out.println("Today is Friday");
				break;
			case SATURDAY:
				System.out.println("Today is Saturday");
				break;
			case SUNDAY:
				System.out.println("Today is Sunday");
				break;
			default:
				System.out.println("Today is Monday");
		}

		printDay(today);

		for (Direction direction : Direction.values()) {
			System.out.println("Abbreviation for " + direction + " is " + direction.getAbbreviation());
		}
	}

	static void printDay(Day day) {
		System.out.println(day);
	}

}
