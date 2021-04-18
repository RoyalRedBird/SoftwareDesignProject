/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package blackjack;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public enum Card {
 
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    KING(10),
    QUEEN(10),
    ACE(11);
    
    private int cardValue;
    
    private Card(int cardValue){
        
        this.cardValue = cardValue;
        
    }
    
    public int getCardValue(){
        
        return cardValue;
        
    }

}
