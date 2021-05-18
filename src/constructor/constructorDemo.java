package constructor;

//class for constructor overloading demo
class constructorDemo{
  int id;
  String name;
  // default constructor declaration (constructor without parameters)
  constructorDemo(){
      System.out.println("initialized using default constructor");
      id = 1;
      name = "default constructor";
  }
  // parametrised constructor declaration (constructors with one or more parameters)
  constructorDemo(int idVal){
      System.out.println("initialized using parameterised constructor(1 int parameter)");
      id = idVal;
      name = "parametrised constructor 1";
  }
  constructorDemo(String str){
      System.out.println("initialized using parametrised constructor(1 String parameter)");
      id = 3;
      name = str;
  }
  constructorDemo(int idVal, String str){
      System.out.println("initialized using parametrised constructor(2 parameters)");
      id = idVal;
      name = str;
  }
  void showData(){
      System.out.println("id: "+id);
      System.out.println("name: "+name);
  }
}