package Udemy;

public class Scope {
    // because x is declared outside of any method it is in scope to all methods, in other words
    // any method can access x
    static int x; // declaring variable x

    public static void main(String[] args) {

        int x = 5;  // assigning a value to x
        System.out.println(x);

        doSomething();
    }


    static void doSomething() {
        x = 10; // assigning a value to x

    }
    static void doSomethingLocally() {
        // because y is declared inside of this method, its only local to this method
            // no other method has access to y
        int y = 100;  // delcaring and initializing the variable y
    }

}

