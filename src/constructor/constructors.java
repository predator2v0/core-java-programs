package constructor;

import methods.ObjMethod;
public class constructors {
    public static void main(String[] args) {
        constructorDemo cd1 = new constructorDemo();
        cd1.showData();
        constructorDemo cd2 = new constructorDemo(2);
        cd2.showData();
        constructorDemo cd3 = new constructorDemo("parametrised constructor 2");
        cd3.showData();
        constructorDemo cd4 = new constructorDemo(4,"parametrised constructor 3");
        cd4.showData();
        constructorChain cc = new constructorChain();
        System.out.println("cc.x= "+cc.x+"\tcc.y= "+cc.y);

        System.out.println(PvtConstructor.val);
        
//      from ObjMethod.java in package methods;
        ObjMethod om = new ObjMethod();
        om.sayHello();
    }
}


