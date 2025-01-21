package cf.ch16.default_static;

public class CodingWelcome implements IWelcome {

    //Hide
    public static void staticMethod() {
        System.out.println("Static method from CodingWelcome hides IWelcome");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Overriden default method in CodingWelcome");
        IWelcome.super.defaultMethod();
    }
}
