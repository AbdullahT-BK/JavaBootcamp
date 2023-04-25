import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello there!");
        System.out.println("What's your name?");
        String name = scan.nextLine();

        System.out.println("What's your favorite color?");
        String color = scan.nextLine();
        System.out.println("Huh," + color + "? " + "Mine's Electric Lime.");

        System.out.println("I really like limes. They're my favorite fruit, too.");
        System.out.println("What's YOUR favorite fruit, " + name);
        String fruit = scan.nextLine();

        System.out.println("Really? " + fruit +"?" + " That's wild!");
        System.out.println("Speaking of favorits, what's your favorite number?");
        int number = scan.nextInt();

        System.out.println(number + " is a cool number. Mine's -7");
        int product = number * -7;
        System.out.println("Did you know number * -7 is " + product + "?" + " That's a cool number too!" );

        System.out.println("Well, thanks for talking to me " + name);

    }

}
