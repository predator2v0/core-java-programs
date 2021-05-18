package constructor;

//class for constructor chaining
public class constructorChain{
 int x,y;
 constructorChain(){
     this(5);
     System.out.println("constructior without parameter");
 }
 constructorChain(int x){
     this(x,7);
     System.out.println("constructor with single parameter");
 }
 constructorChain(int x, int y){
     System.out.println("constructor with double parameter");
     System.out.println("x= "+x+"\ty= "+y);
     this.x = x;
     this.y = y;
 }
}
