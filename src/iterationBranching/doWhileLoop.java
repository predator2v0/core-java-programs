package iterationBranching;

// the do while loop is a exit control loop which will execute at least once even if the condition given is false.
// demonstration of do while loop in java
public class doWhileLoop {
	public static void main(String[] args) {
		int n = 10, i = 1;
		do {
			System.out.print(n + " * " + i + " = " + (n * i) + "\t");
			++i;
		} while (i <= n);
	}
}
