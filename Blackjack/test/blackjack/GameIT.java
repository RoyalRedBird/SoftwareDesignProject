/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Damini
 */
public class GameIT {
    
    public GameIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBalance method, of class Game.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBalance method, of class Game.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        int balance = 0;
        Game instance = new Game();
        instance.setBalance(balance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHand_value method, of class Game.
     */
    @Test
    public void testGetHand_value() {
        System.out.println("getHand_value");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.getHand_value();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHand_value method, of class Game.
     */
    @Test
    public void testSetHand_value() {
        System.out.println("setHand_value");
        int hand_value = 0;
        Game instance = new Game();
        instance.setHand_value(hand_value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRounds_won method, of class Game.
     */
    @Test
    public void testGetRounds_won() {
        System.out.println("getRounds_won");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.getRounds_won();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRounds_won method, of class Game.
     */
    @Test
    public void testSetRounds_won() {
        System.out.println("setRounds_won");
        int rounds_won = 0;
        Game instance = new Game();
        instance.setRounds_won(rounds_won);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWinner method, of class Game.
     */
    @Test
    public void testSetWinner() {
        System.out.println("setWinner");
        boolean winner = false;
        Game instance = new Game();
        instance.setWinner(winner);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWinner method, of class Game.
     */
    @Test
    public void testGetWinner() {
        System.out.println("getWinner");
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.getWinner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetHand method, of class Game.
     */
    @Test
    public void testResetHand() {
        System.out.println("resetHand");
        Game instance = new Game();
        instance.resetHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToHand method, of class Game.
     */
    @Test
    public void testAddToHand() {
        System.out.println("addToHand");
        int add = 0;
        Game instance = new Game();
        instance.addToHand(add);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawCard method, of class Game.
     */
    @Test
    public void testDrawCard() {
        System.out.println("drawCard");
        Game instance = new Game();
        instance.drawCard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
