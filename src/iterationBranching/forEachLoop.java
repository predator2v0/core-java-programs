package iterationBranching;

// demonstration of the for each loop in java
public class forEachLoop {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int index = 0;
		for (int i : arr) {
			System.out.println("arr[" + index + "]:" + i);
			index++;
		}
	}
}
