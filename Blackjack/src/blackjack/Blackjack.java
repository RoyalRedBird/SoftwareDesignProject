
import java.util.*;

/**
 * @author melvi
 */
public class Blackjack {

    public static void main(String[] args) {
        ArrayList<Game> game = new ArrayList<Game>();
        ArrayList<Integer> bets = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("-=-=-=-=-=-=-= Welcome to the game of Blackjack! =-=-=-=-=-=-=-");
        while (true) { // handles the beginning of the game
            System.out.println("How many players are playing today?");
            try {
                int playerCount = Integer.parseInt(input.nextLine());
                if (playerCount < 1 || playerCount > 5) {
                    System.out.println("***** Minimum amount of players needs to be 1,"
                            + " and maximum players cannot exceed 5");
                } else {
                    for (int i = 0; i < playerCount; i++) { // creates game objects and players
                        game.add(new Game());
                        bets.add(null);
                        System.out.println("Enter a custom name. If you want a default name, leave blank");
                        String custom = input.nextLine();
                        if (custom == "") {
                            custom = "Player " + i;
                        }
                        game.get(i).setBalance(25);
                        game.get(i).setHand_value(0);
                        game.get(i).setWinner(false);

                        // playerArray.add(custom)
                    }
                    break;
                }
            } catch (Exception e) {
                System.out.println("Number of players must be a number");
            }
        }

        while (true) { // handles the turn system
            System.out.println("*** TYPE 'EXIT' TO END GAME, OTHERWISE PRESS ENTER ***");
            String quit = input.nextLine();
            if (quit.toLowerCase().matches("exit")) {
                break;
            } else {
                bets(game, bets);
                turns(game);
                payout(game, bets);
            }

        }
        System.out.println("Thank you for playing!");
    }

    public static void bets(ArrayList<Game> object, ArrayList<Integer> bets) { // this is a test method for now
        Scanner input = new Scanner(System.in);
        int i = 0;
        do {
            try {
                int balance = object.get(i).getBalance();
                if (balance == 0) { // won't let the user play if their balance is 0
                    i++;
                } else {
                    System.out.println("Enter a bet");
                    int bet = Integer.parseInt(input.nextLine());
                    if (balance - bet < 0 || bet < 0) { // checks if user bet more than balance or a negative bet
                        System.out.println("You cant bet more than you have, or a negative wager");
                    } else {
                        object.get(i).setBalance((balance - bet)); // updates the balance of the player
                        bets.set(i, bet); // adds bet to player index
                        System.out.println("Your new balance is: " + object.get(i).getBalance());
                        i++;
                    }
                }

            } catch (Exception e) {
                System.out.println("Your bet must be a number");
            }
        } while (i < object.size());
    }

    public static void payout(ArrayList<Game> game, ArrayList<Integer> bets) {
        for (int i = 0; i < game.size(); i++) {
            if (game.get(i).getWinner()) { // checks if the user won
                int pay = game.get(i).getBalance() + bets.get(i);
                game.get(i).setBalance(pay); // pays the user
            }
        }
    }

    public static void turns(ArrayList<Game> game) {
        Game dealer = new Game(); // creates a dealer
        Scanner input = new Scanner(System.in);
        int i = 0;
        do {
            System.out.println("Your hand value is " + game.get(i).getHand_value());
            System.out.println("Dealer hand is " + dealer.getHand_value());
            if (game.get(i).getHand_value() < 21) { // checks if the user has 'BUSTED'
                System.out.println("\n[1. Hit\t2. Stand]");
                String userInput = input.nextLine();
                try {
                    if (Integer.parseInt(userInput) < 1 || Integer.parseInt(userInput) > 2) {
                        System.out.println("Enter either 1 or 2");
                    } else if (Integer.parseInt(userInput) == 1) {
                        // run code to add a card to their hand, DO NOT INCREMENT i   
                    } else {
                        i++; // if they stand, proceed to next player
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a number\n");
                }
            }
            else if(game.get(i).getHand_value() == 21){
                System.out.println("YOU GOT BLACKJACK!");
            }
            else{
                System.out.println("Sorry, you busted!");
                i++; // proceeds to the next players turn
            }
        } while (i < game.size());
    }

}
