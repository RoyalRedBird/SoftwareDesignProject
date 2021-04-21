
import blackjack.Player;
import java.util.*;

/**
 * @author melvi
 */
public class Blackjack {

    public static void main(String[] args) {
        ArrayList<Game> game = new ArrayList<Game>();
        ArrayList<Integer> bets = new ArrayList<Integer>();
        ArrayList<Player> players = new ArrayList<Player>();
        int playerCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("-=-=-=-=-=-=-= Welcome to the game of Blackjack! =-=-=-=-=-=-=-");
        while (true) { // handles the beginning of the game
            System.out.println("How many players are playing today?");
            try {
                playerCount = Integer.parseInt(input.nextLine());
                if (playerCount < 1 || playerCount > 5) {
                    System.out.println("***** Minimum amount of players needs to be 1,"
                            + " and maximum players cannot exceed 5");
                } else {

                    break;
                }
            } catch (Exception e) {
                System.out.println("Number of players must be a number");
            }
        }
        for (int i = 0; i < playerCount; i++) { // creates game objects and players
            game.add(new Game());
            bets.add(null);
            System.out.println("Enter a custom name. If you want a default name, leave blank");
            String custom = input.nextLine();
            if (custom == "") {
                custom = "Player " + (i+1);
            }
            game.get(i).setBalance(25);
            game.get(i).setHand_value(0);
            game.get(i).setWinner(false);
            players.add(new Player(""));
            players.get(i).setName(custom);
            // line above adds players to player array
            System.out.println(custom + " added.\n");
        }

        while (true) { // handles the turn system
            System.out.println("*** TYPE 'EXIT' TO END GAME, OTHERWISE PRESS ENTER ***");
            String quit = input.nextLine();
            if (quit.toLowerCase().matches("exit")) {
                break;
            } else { // runs the methods that handle the game
                bets(game, bets, players); // betting phase
                turns(game, players); // turn phase
                payout(game, bets); // payout phase
            }

        }
        System.out.println("Thank you for playing!");
    }

    public static void bets(ArrayList<Game> object, ArrayList<Integer> bets, ArrayList<Player> players) { // this is a test method for now
        Scanner input = new Scanner(System.in);
        int i = 0;
        do {
            try {
                int balance = object.get(i).getBalance();
                if (balance == 0) { // won't let the user play if their balance is 0
                    i++;
                } else {
                    System.out.println("Enter a bet " + players.get(i).getName()+ ":");
                    System.out.println("Your balance is: $" + object.get(i).getBalance());
                    int bet = Integer.parseInt(input.nextLine());
                    if (balance - bet < 0 || bet < 0) { // checks if user bet more than balance or a negative bet
                        System.out.println("You cant bet more than you have, or a negative wager");
                    } else {
                        bets.set(i, bet); // adds bet to player index
                        System.out.println("Your new balance is: " + (object.get(i).getBalance()-bet) + "\n");
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
            game.get(i).setHand_value(0); // resets the users hand
            if (game.get(i).getWinner()) { // checks if the user won
                int pay = game.get(i).getBalance() + bets.get(i);
                game.get(i).setBalance(pay); // pays the user    
            }
            else{
                int pay = game.get(i).getBalance() - bets.get(i);
                game.get(i).setBalance(pay);
            }
        }

    }

    public static void turns(ArrayList<Game> game, ArrayList<Player> players) {
        Game dealer = new Game(); // creates a dealer
        System.out.print("Dealer's first card: ");
        dealer.drawCard();
        
        Scanner input = new Scanner(System.in);
        int i = 0;
        do {
            if(game.get(i).getHand_value() == 0){
                game.get(i).drawCard();
                game.get(i).drawCard();
                // draws 2 cards for user
            }
            System.out.println("\n" +players.get(i).getName()
                    + ": Your hand value is " + game.get(i).getHand_value());
            System.out.println("Dealer hand is " + dealer.getHand_value()); // prints dealer hand value
            if (game.get(i).getHand_value() < 21) { // checks if the user has 'BUSTED'
                System.out.println("\n[1. Hit\t2. Stand]");
                String userInput = input.nextLine();
                try {
                    if (Integer.parseInt(userInput) < 1 || Integer.parseInt(userInput) > 2) {
                        System.out.println("Enter either 1 or 2");
                    } else if (Integer.parseInt(userInput) == 1) {

                        game.get(i).drawCard();

                    } else {
                        i++; // if they stand, proceed to next player
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a number\n");
                }
            } else if (game.get(i).getHand_value() == 21) { // checks if user got blackjack
                game.get(i).setWinner(true);
                System.out.println("YOU GOT BLACKJACK!");
                i++;
            } else { // player loses
                game.get(i).setWinner(false);
                System.out.println("Sorry, you busted!");
                i++; // proceeds to the next players turn
            }
        } while (i < game.size());

        do { // while dealer hand is less than 16
            System.out.print("Dealer: ");
            dealer.drawCard();
            // *** add code to add a card to dealer hand
            // *** display dealer hand
            

        } while (dealer.getHand_value() < 16);
        System.out.println("\nDealers hand: " +dealer.getHand_value() + "\n");
        i = 0;
        while (i < game.size()) { // handles code to pick winners
            int dealerHand = dealer.getHand_value();
            int playerHand = game.get(i).getHand_value();
            if (dealerHand > 21 && playerHand <= 21) {
                System.out.println(players.get(i).getName() + " won!");
                game.get(i).setWinner(true);
 
            } else if (playerHand > dealerHand && dealerHand <= 21) {
                System.out.println(players.get(i).getName() + " won!");
                game.get(i).setWinner(true);

            } else {
                System.out.println("Sorry " + players.get(i).getName() + ", you lost.\n");
                game.get(i).setWinner(false);
            }
            i++;
            
        }
        dealer.resetHand();

    }

}
