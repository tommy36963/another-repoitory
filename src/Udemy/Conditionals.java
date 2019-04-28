package Udemy;

public class Conditionals {
    public static void main(String[] args) {

        // if (some expression that evaluate to true)
        //          do something

        boolean sayHello = false;
        boolean sayHey = true;

        // only the first statement to evaluate to true gets executed
        if (sayHello) {
            System.out.println("hello");
        } else if (sayHey) {
            System.out.println("Hey");
        } else {
                System.out.println("Goodbye");

        }

        // >, <, >=, <=, !=, == relational operators, can also use boolean variables

        //if(x = 5) assign 5 to x
        //if(x == 5) test whether x has the value 5(it will either be true or false)

        // && AND || OR

        int playerX = 50;

        if(true && false) {
            System.out.println("AND executed");
        }
            // if our player is past the left side of the screen or if our player is past the right side of screen
        if (playerX < 0 || playerX > 800) {
            // some code that reverses our players direction
            System.out.println("OR executed");
        }
    }

}