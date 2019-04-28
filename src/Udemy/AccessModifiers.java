package Udemy;

public class AccessModifiers {

    // private most restrictive
    // default
    // protected
    // public



    public static void main(String[] args) {

    }
    // public visibility, method can be accessed anywhere in program
    //  as long as you have an instance of this class to call it from
    public void doSomethingPublic () {

    }
    // can only be accessed within this class
    private  void doSomethingPrivate(){

    }
    // method can only be accessed inside of this package and subclasses of this class
    protected void soSomethingProtected() {

    }
    // default visibility means this method can be accessed inside of this package
    void doSomething() {

    }
}
