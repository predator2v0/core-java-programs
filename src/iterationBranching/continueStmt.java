package iterationBranching;

// demonstration of continue statements in java
public class continueStmt {
	public static void main(String[] args) {
		int n = 4;
		// continue statement in loop.
		System.out.println("continue inside simple loop:");
		for (int i = 0; i < n; i++) {
			if (i > 3 && i < 7)
				continue;
			System.out.println(n + " * " + i + " = " + n * i + "\t");
		}
		// continue statement with label
		System.out.println("continue with label:");
		xyz: for (int j = 0; j < 6; j++) {
			if (j == 3) {
				System.out.println("transfering control to loop beginning:");
				continue xyz;
			}
			System.out.println(n + " * " + j + " = " + n * j + "\t");
		}
		System.out.println("hello! you are free of loop now.");
	}
}
