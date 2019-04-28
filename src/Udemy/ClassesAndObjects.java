package Udemy;

import javax.swing.*;

public class ClassesAndObjects {
    public static void main(String[] args) {

        JLabel label = new JLabel();

        Person Bob = new Person("Bob");
        Bob.setAge(20);
        Person Pac = new Person("Pac");
        Pac.setAge(31);

        Bob.sayHelloTo(Pac);

        System.out.println(Bob.getName() + " is " + Bob.getAge() + " years old");
        System.out.println( Pac.getName() + "is " + Pac.getAge() + " years old");

    }
}
