package aggregation;

class Book{
    String name;
    int id;
    Author auth;
    Book(String nm, int id, Author at){
        name = nm;
        this.id = id;
        auth = at;
    }  
    void viewDetails(){
        System.out.println("book id: "+id+"\t book name: "+name);
        System.out.println("author name: "+auth.name+"\t age: "+auth.age);
    }
}
