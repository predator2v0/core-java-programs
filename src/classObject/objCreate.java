package classObject;

// import java.io.*;
// import java.util.*;
// import java.lang.*;
public class objCreate {
	String name;

	public static void main(String[] args) {
		try {
			// BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			// Scanner sc = new Scanner(System.in);
			// b.close();
			// sc.close();
			objCreate ob1 = new objCreate();
//          accessing value from command line argument and using it inside program
			ob1.name = args[0];
			System.out.println(ob1.name);
		} catch (Exception e) {
			e.fillInStackTrace();
		}
	}
}
