package com.wileyedge.foundations.flowcontrol.ifs;
import java.util.Scanner;
// Problem 4.6
public class TriviaNight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        int score = 0;

        System.out.println("FIRST QUESTION!");
        System.out.println("What is the Lowest Level programming language?");
        System.out.print(" 1) Source Code");
        System.out.print(" 2) Assembly language");
        System.out.print(" 3) C#");
        System.out.print(" 4) Machine Code");

        int guess1 = scan.nextInt();
        if (guess1 == 4) {
            System.out.println("Correct!, 2 questions remaining");
            score += 1;
            System.out.println("Current score is: " + score);
        } else {
            System.out.println("Incorrect :( , 2 questions remaining");
            score += 0;
            System.out.println("Current score is: " + score);
        }

        System.out.println("SECOND QUESTION!");
        System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?");
        System.out.print(" 1) Grace Hopper");
        System.out.print(" 2) Alan Turing");
        System.out.print(" 3) Charles Babbage");
        System.out.print(" 4) Larry Page");

        int guess2 = scan.nextInt();
        if (guess2 == 2) {
            System.out.println("Correct!, 1 question remaining");
            score += 1;
            System.out.println("Current score is: " + score);
        } else {
            System.out.println("Incorrect :( , 1 question remaining");
            score += 0;
            System.out.println("Current score is: " + score);
        }

        System.out.println("LAST QUESTION!");
        System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?");
        System.out.print(" 1) Serenity ");
        System.out.print(" 2) The Battlestar Galactica");
        System.out.print(" 3) The USS Enterprise");
        System.out.print(" 4) The Millennium Falcon");

        int guess3 = scan.nextInt();
        if (guess3 == 3) {
            System.out.println("Correct!, no questions remaining");
            score += 1;
            System.out.println("Current score is: " + score);
        } else {
            System.out.println("Incorrect :( , no questions remaining");
            score += 0;
            System.out.println("Current score is: " + score);
        }

        if (score == 0) {
            System.out.println("Try again, I know you can do better!");
        } else if (score == 1) {
            System.out.println("You can do better!");
        } else if (score == 2) {
            System.out.println("You did great!");
        }  else if (score == 3) {
                        System.out.println("You're so smart!");
        }
    }
}
