import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        //Task 3 – Wait for the user to press enter.
        scan.nextLine();
        hitOrStay();

        //Task 4 – Get two random cards.
        //– Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>
        
        int card1 = drawRandomCard();
        int card2 = drawRandomCard();

        System.out.println("\n You get a \n" + cardString (card1)+ "\n and a \n" +  cardString (card2));

        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>
        int total = Math.min(10,card1) + Math.min(10,card2);
        System.out.println("your total is: " + total);

        
        //Task 6 – Get two random cards for the dealer.
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hidden
        int dealerCard1 = drawRandomCard();
        int dealerCard2 = drawRandomCard();
        System.out.println("The dealer shows \n" + cardString (dealerCard1) + "\nand has a card facing down \n" + faceDown());
        int dealerTotal = Math.min(10,dealerCard1) + Math.min(10,dealerCard2);
        System.out.println("\n The dealer's total is hidden");
       
        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>
        //       2. Once the player stays, break the loop. 
        while (true) {
                String option = hitOrStay();
                if(option.equals("stay")) {
                        break;
                }
                int newCard = drawRandomCard();
                total += Math.min(newCard,10);
                System.out.println("\n You get a\n" + cardString(newCard));
                System.out.print("Your new total is: " + total);

// Task 9 - While the player is hitting, if they go bust (total exceeds 21) print: "Bust! Player loses". Then, shut down the game with System.exit(0) (System.exit(0) terminates execution).
// Task 10 - (new line) Dealer's turn
// (new line) The dealer's cards are (new line) <dealer card 1> (new line) 
// Taskk 11 - must keep hitting until total gets to 17. print dealer gets a new line

        if (total >21){
                System.out.println("\nBust!, Player loses");
                System.exit(0);
               }
        }  
        System.out.println("\n Dealer's turn");
        System.out.println("\n The dealer's cards are\n" + cardString(dealerCard1) + "and a\n  + \n" +
        cardString(dealerCard2));

        while(dealerTotal <17) {
                int newCard = drawRandomCard();
                System.out.println("Dealer gets a \n" + cardString(newCard));
                dealerTotal+= Math.min(newCard,10);
                System.out.println("Dealer's total is " + dealerTotal);
        }

        // Task 12 -If the dealer's total is higher than 21, print: "Bust! Dealer loses" and end the game with System.exit(0).
        if (dealerTotal > 21)  {
                System.out.println("\nBust!, Dealer loses");
                System.exit(0);
        }  
        if (total >dealerTotal) {
                System.out.println("Player wins!");
        } else { 
        System.out.println("Dealer wins");
}
        scan.close();
}

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
     public static int drawRandomCard() {
        double randomNumber = (Math.random() *13) +1 ; // number from 0-13
        randomNumber += 1; // 1 - 13.9999
        return (int)randomNumber;
     }
     
    public static String cardString (int cardNumber) {
            switch (cardNumber) {
                case 1:   
                return "   _____\n"+
                       "  |A _  |\n"+ 
                       "  | ( ) |\n"+
                       "  |(_'_)|\n"+
                       "  |  |  |\n"+
                       "  |____V|\n";
                case 2:
                return  "   _____\n"+              
                        "  |2    |\n"+ 
                        "  |  o  |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____Z|\n";
                      
                case 3:
                return"   _____\n" +
                      "  |3    |\n"+
                      "  | o o |\n"+
                      "  |     |\n"+
                      "  |  o  |\n"+
                      "  |____E|\n";
    
                case 4:
                return "   _____\n" +
                       "  |4    |\n"+
                       "  | o o |\n"+
                       "  |     |\n"+
                       "  | o o |\n"+
                       "  |____h|\n";
    
                case 5:
                return  "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";
    
                case 6:
                return  "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";
    
                case 7:
                return  
                        "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";
              
                case 8:
                return  "   _____ \n" +
                "  | o o |\n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
                case 9:
                return  "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";
    
                case 10:
                return  "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
                case 11:
                return  "   _____\n" +
                        "  |J  ww|\n"+ 
                        "  | o {)|\n"+ 
                        "  |o o% |\n"+ 
                        "  | | % |\n"+ 
                        "  |__%%[|\n";
                case 12:
                return  "   _____\n" +
                        "  |Q  ww|\n"+ 
                        "  | o {(|\n"+ 
                        "  |o o%%|\n"+ 
                        "  | |%%%|\n"+ 
                        "  |_%%%O|\n";
                case 13:
                return  "   _____\n" +
                        "  |K  WW|\n"+ 
                        "  | o {)|\n"+ 
                        "  |o o%%|\n"+ 
                        "  | |%%%|\n"+ 
                        "  |_%%%>|\n";

                default: return "Not possible";
            }
        }


    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */

    public static String hitOrStay() {
    System.out.println("\nDo you want to hit or stay?");
    String response = scan.nextLine();
    
    while (!(response.equalsIgnoreCase("hit") || response.equalsIgnoreCase("stay"))) {
        System.out.println("Please write hit or stay");
        response = scan.nextLine();
    } 
    return response;
        }
}
