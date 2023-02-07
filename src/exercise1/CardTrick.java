package exercise1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author rosinsse
 * @author Sebastian Rosinski Feb 7, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13)+1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the card you are thinking of (1-13):");
        int guessValue = sc.nextInt();
        System.out.println("Enter the suit of the card you are thinking of (1-Hearts, 2-Diamonds, 3-Spades, 4-Clubs):");
        int guessSuit = sc.nextInt();
        sc.close();
        
        Card guess = new Card();
        guess.setValue(guessValue);
        guess.setSuit(Card.SUITS[guessSuit - 1]);
        
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getValue() == guess.getValue() && hand[i].getSuit().equals(guess.getSuit())){
                printInfo();
                return;
            }
        }
        
        System.out.println("The card you picked is not in the hand");
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
        System.out.println("I'm Done!");
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Sebastian");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("Become a developer");
        System.out.println("Work at a big tech company or work at a startup");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("Soccer");
        System.out.println("Fishing");
        System.out.println("Gaming");

        System.out.println();
        
    
    }

}
