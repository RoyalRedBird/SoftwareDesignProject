
import blackjack.Card;
import java.util.ArrayList;

public class Game {

	private String name;
        private int hand_value;
        private int rounds_won;
        private int balance;
        private boolean winner;
        
        public Game(){

        }
        
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return this.balance;
	}

	/**
	 * 
	 * @param balance
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getHand_value() {
		return this.hand_value;
	}

	/**
	 * 
	 * @param hand_value
	 */
	public void setHand_value(int hand_value) {
		this.hand_value = hand_value;
	}

	public int getRounds_won() {
		return this.rounds_won;
	}

	/**
	 * 
	 * @param rounds_won
	 */
	public void setRounds_won(int rounds_won) {
		this.rounds_won = rounds_won;
	}
        
        public void setWinner(boolean winner){
            this.winner = winner;
        }
        
        public boolean getWinner(){
            return this.winner;
        }
        
        public void resetHand(){
            
            this.hand_value = 0;
            
        }
        
        public void addToHand(int add){
            
            hand_value += add;
            
        }
        
        public void drawCard(){
            
            int rand = (int)(Math.random() * (13) + 1);
            Card draw = Card.JACK;
            int toReturn = 0;
            
            switch(rand){
                
                case 1:
                    draw = Card.TWO;
                    toReturn = draw.getCardValue();
                    System.out.println("Drew a two.");
                    break;
                case 2:
                    draw = Card.THREE;
                    toReturn = draw.getCardValue();
                    System.out.println("Drew a three.");
                    break;
                case 3:
                    draw = Card.FOUR;
                    toReturn = draw.getCardValue();
                    System.out.println("Drew a four.");
                    break;
                case 4:
                    draw = Card.FIVE;
                    toReturn = draw.getCardValue();
                    System.out.println("Drew a five.");
                    break;
                case 5:
                    draw = Card.SIX;
                    toReturn = draw.getCardValue();
                    System.out.println("Drew a six.");
                    break;
                case 6:
                    draw = Card.SEVEN;
                    toReturn = draw.getCardValue();
                    System.out.println("Drew a seven.");
                    break;
                case 7:
                    draw = Card.EIGHT;
                    toReturn = draw.getCardValue();
                    System.out.println("Drew an eight.");
                    break;
                case 8:
                    draw = Card.NINE;
                    toReturn = draw.getCardValue();
                    System.out.println("Drew a nine.");
                    break;
                case 9:
                    draw = Card.TEN;
                    toReturn = draw.getCardValue();
                    System.out.println("Drew a ten.");
                    break;
                case 10:
                    draw = Card.JACK;
                    toReturn = draw.getCardValue();
                    System.out.println("Drew a Jack.");
                    break;
                case 11:
                    draw = Card.KING;
                    toReturn = draw.getCardValue();
                    System.out.println("Drew a King.");
                    break;
                case 12:
                    draw = Card.QUEEN;
                    toReturn = draw.getCardValue();
                    System.out.println("Drew a Queen.");
                    break;
                case 13:
                    if(hand_value <= 10){
                        
                        System.out.println("Drew an Ace, counting it as 11.");
                        toReturn = 11;
                        
                    }else{
                        
                        System.out.println("Drew an Ace, counting it as 1.");
                        toReturn = 1;
                        
                    }
                    break;
                    
            }
            
            
            addToHand(toReturn);
            
        }

}