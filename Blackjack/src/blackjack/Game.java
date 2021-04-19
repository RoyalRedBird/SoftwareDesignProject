
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

}