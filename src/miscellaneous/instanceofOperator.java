package miscellaneous;

interface ifs {

}

public class instanceofOperator {
    public static void main(String[] args) {
        instanceofOperator io = new instanceofOperator();
        boolean b = io instanceof instanceofOperator;
        System.out.print("same class object instance of same class: ");
        System.out.println(b);
        System.out.print("object instance of interface without implement: ");
        boolean bb = io instanceof ifs;
        System.out.println(bb);
        // inheritance
        instanceparent p = new instanceparent();
        instancechild c = new instancechild();
        System.out.println("child instance of parent: " + (c instanceof instanceparent));
        System.out.println("parent instance of child: " + (p instanceof instancechild));
        System.out.println("object instance of interface with implement: " + (c instanceof ifs));
        p = c;
        System.out.println("parent instance of child after assigning child ref. to parent ref.: " + (p instanceof instancechild));
        instanceparent pc = new instancechild();
        if (pc instanceof instancechild) {
            instancechild cp = (instancechild) p;
            System.out.println(cp);
        }
        p.show();
        c.hide();
    }
}

class instanceparent {
    void show() {
        System.out.println("parent show");
    }
}

class instancechild extends instanceparent implements ifs {
    void hide() {
        System.out.println("child hide");
    }
}
