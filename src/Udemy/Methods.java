package Udemy;

public class Methods {
    public static void main(String[] args)  {
        sayHelloWorld();

        sayHelloTo("Ronny");
        sayHelloTo("John");

        int x = returnFive();

        System.out.println(x);

        int result = square(5);
        System.out.println(result);

    }
    // THis method both returns a vlue and takes in data
    static  int square (int x) {
        return x * x;
    }
    // This method returns an int type with the value 5
    static int returnFive() {
        return 5;
    }
    // This method will say hello to whatever name is passed when called
    static void sayHelloTo(String name) {
        System.out.println("Hello, " + name);
    }
    // This method simply says "Hello world!"
    static void sayHelloWorld() {
        System.out.println("Hello, World!");
    }
}
