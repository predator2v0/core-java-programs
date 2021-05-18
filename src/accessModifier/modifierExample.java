package accessModifier;

import modifiers.custompack;
public class modifierExample extends custompack {
    public static void main(String[] args) {
        custompack cp = new custompack();
        modifierExample me = new modifierExample();
        // sayhello();  // default method[sayhello()] -- cannot be accessed outside the package directly with the same class object or inheritance
        // public method[welcome()] -- can be accessed anywhere either by same class object or by child class object after inheritance.
        cp.welcome();
        me.welcome();
        // protected method [createdby()] -- can only be accessed by the object of child class after inheritance.
        me.createdby();
        //  private method [thankyou()] -- cannot be accessed outside the class directly. can only be accessed outised from a public method of the same class.
        // default methods can also be accessed outside the package if called from the public method of the same class.
        me.accessprivate();
        cp.accessprivate();
    }
}
