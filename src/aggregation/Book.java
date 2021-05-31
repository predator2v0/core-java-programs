package aggregation;

class Book {
	String name;
	int id;
//  object of author class is created in book class directly without inheritance.
//  creating a has-A relationship and loosely coupled classes.
//  hence making both classes in the aggregation relationship.
	Author auth;

	Book(String nm, int id, Author at) {
		name = nm;
		this.id = id;
		auth = at;
	}

	void viewDetails() {
		System.out.println("book id: " + id + "\t book name: " + name);
		System.out.println("author name: " + auth.name + "\t age: " + auth.age);
	}
}
