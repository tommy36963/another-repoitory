package Udemy;

public class ReferenceAndValueTypes {

    public static void main(String[] args) {
        // byte, short, int, long, float, double, boolean, char

        int x = 5;
        addOneTo(x); //we're passing a value type, so we pass a copy of the value of x, which is 5

        System.out.println(x);

        Person Bob;
        Bob = new Person("Bob"); // we're creating a new person object, and assigning Bob to refer to it
        Bob.setAge(20);
        celebrateBirthday(Bob); //we're passing that reference to a method, so the method can use that reference
        System.out.println(Bob.getAge());

    }

    private static void celebrateBirthday(Person Person) {
        Person.setAge(Person.getAge() + 1);
    }

    // manipulate a copy of the value passed
    static void addOneTo(int number) {
        number = number + 1;
    }

}
