package iterationBranching;

// while loop is an entry control loop, the condition must be strictly satisfied to enter into the loop
// demonstration of while loop in java
public class whileLoop {
	public static void main(String[] args) {
		int n = 10, i = 1;
		while (i <= n) {
			System.out.print(n + " * " + i + " = " + (n * i) + "\t");
			i++;
		}
	}
}
