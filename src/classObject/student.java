package classObject;

import java.util.Scanner;

class student {
	// data members
	int roll, std;
	String name;
	float marks; // total=500, obtained = marks;
	char grade;

	// member functions
	void getStudentInfo() {
		System.out.println();
		Scanner s = new Scanner(System.in);
		System.out.print("enter the roll number: ");
		roll = s.nextInt();
		s.nextLine(); // used to clear the buffer after the nextInt() so that the next String input
						// can be taken without fail.
		System.out.print("enter the name of the student: ");
		name = s.nextLine();
		System.out.print("class: ");
		std = s.nextInt();
		System.out.print("Marks obtained(out of 500): ");
		marks = s.nextFloat();
		calcGrade(marks);
		s.close();
	}

	void calcGrade(float marks) {
		float perc = marks / 5;
		if (perc >= 91 && perc <= 100)
			grade = 'O';
		else if (perc >= 81 && perc <= 90)
			grade = 'E';
		else if (perc >= 71 && perc <= 80)
			grade = 'A';
		else if (perc >= 61 && perc <= 70)
			grade = 'B';
		else if (perc >= 51 && perc <= 60)
			grade = 'C';
		else if (perc >= 41 && perc <= 50)
			grade = 'D';
		else if (perc <= 40 && perc >= 0)
			grade = 'F';
		else {
			System.out.println("wrong marks");
			System.exit(0);
		}
	}

	void displayStudentInfo() {
		System.out.println();
		System.out.print("NAME: " + name + "\t CLASS: " + std + "\t ROLL NO.: " + roll + "\nMARKS: " + marks
				+ "\t GRADE: " + grade + "\n");
	}
}
