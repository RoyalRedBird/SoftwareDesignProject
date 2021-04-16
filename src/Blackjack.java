
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author melvi
 */
public class Blackjack {

    private ArrayList<Game> game = new ArrayList<Game>();
    private Game test = new Game();
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-=-=-=-=-=-=-= Welcome to the game of Blackjack! =-=-=-=-=-=-=-");
        while (true) { // handles the beginning of the game
            System.out.println("How many players are playing today?");
            int playerCount = input.nextInt();
            if (playerCount < 1 || playerCount > 5) {
                System.out.println("***** Minimum amount of players needs to be 1,"
                        + " and maximum players cannot exceed 5");
            } else {
                for(int i =0; i < playerCount; i++){
                    game.add(new Game());
                }
                break;
            }
        }
        
        
    }
}
