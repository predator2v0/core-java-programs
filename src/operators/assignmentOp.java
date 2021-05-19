package operators;

public class assignmentOp {
	public static void main(String[] args) {
		int a = 5, b = 6;
		int c = b;
		
		System.out.println("GIVEN: int a = 5, int b = 6");
		System.out.println("int c = b");
		System.out.println("c: " + c);
		System.out.println("a += c: " + (a += c));
		System.out.println("b -= c: " + (b -= c));
		System.out.println("a *= c: " + (a *= c));
		System.out.println("a /= c: " + (a /= c));
		System.out.println("a %= c: " + (a %= c));
	}
}
