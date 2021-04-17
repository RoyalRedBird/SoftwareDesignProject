import java.util.*;

/**
 * @author melvi
 */
public class Blackjack {

	public static void main(String[] args) {
        ArrayList<Game> game = new ArrayList<Game>();
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
                        System.out.println("Enter a custom name. If you want a default name, leave blank");
                        String custom = input.nextLine();
                        if(custom == ""){
                            custom = "Player " + i;               
                        }
                        game.get(i).setBalance(25);
                        // playerArray.add(custom)
                    }
                    break;
                }
            } catch (Exception e) {
                System.out.println("Number of players must be a number");
            }
        }

        while (true) { // handles the turn system
            play(game);
            break; // TEMPORARY, DELETE LATER
        }
    }
    
    public static void play(ArrayList<Game> object){ // this is a test method for now
        Scanner input = new Scanner(System.in);
        int i = 0;
        do{
            try{
                int balance = object.get(i).getBalance();
                System.out.println("Enter a bet");
                int bet = Integer.parseInt(input.nextLine());
                if(balance - bet == 0){
                    System.out.println("Bet cannot be negative");
                }
                else{
                    object.get(i).setBalance((balance - bet));
                    System.out.println("Your new balance is: " + object.get(i).getBalance());
                    i++;
                }
            }
            catch(Exception e){
                System.out.println("Your bet must be a number");
            }
        } while(i < object.size());
    }

}