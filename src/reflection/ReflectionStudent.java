package reflection;

public class ReflectionStudent {
	private int roll;
	private String name;
	private double marks;
	private final double total = 500;
	char grade;

//	constructor
	public ReflectionStudent(int roll, String name, double marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
//	getters and setters

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
//	methods
	private double calculatePercentage() {
		return getMarks()/total;
	}
	public char calculateGrade() {
		double perc = calculatePercentage();
		if (perc >=91 && perc <= 100) {
			return 'O';
		}
		else if (perc >=81 && perc <= 90) {
			return 'E';
		}
		else if (perc >=71 && perc <= 80) {
			return 'A';
		}
		else if (perc >=61 && perc <= 70) {
			return 'B';
		}
		else if (perc >=51 && perc <= 60) {
			return 'C';
		}
		else if (perc >=41 && perc <= 50) {
			return 'D';
		}
		else if (perc >=0 && perc <= 40) {
			return 'F';
		}
		else {
			return 'K';
		}
	}
	public static void main(String[] args) {
		ReflectionStudent reflectionStudent =  new ReflectionStudent(01,"cdsd",565);
		System.out.println(reflectionStudent.toString());
	}

}
