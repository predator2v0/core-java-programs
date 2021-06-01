package classObject;

// driver program for student class.
public class objClassDemo {
	public static void main(String[] args) {
//		object of student class created
		student stud = new student();
//		methods of student class invoked using the created object.
		stud.displayStudentInfo();
		student s1 = new student();
		s1.getStudentInfo();
		s1.displayStudentInfo();
	}
}
