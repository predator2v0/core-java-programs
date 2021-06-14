package iterationBranching;

// demonstration of switch case statements in java
public class switchCase {
	public static void main(String[] args) {
		// integer in switch
		int day = 8;
		switch (day) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("wrong input");
		}
		// switch using string.
		String str = "fri";
		switch (str) {
		case "monday":
			System.out.println("day 1");
			break;
		case "tuesday":
			System.out.println("day 2");
			break;
		case "wednesday":
			System.out.println("day 3");
			break;
		case "thursday":
			System.out.println("day 4");
			break;
		case "friday":
			System.out.println("day 5");
			break;
		case "saturday":
			System.out.println("day 6");
			break;
		case "sunday":
			System.out.println("day 7");
			break;
		default:
			System.out.println("invalid input");
		}
	}
}
