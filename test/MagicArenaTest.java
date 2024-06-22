import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MagicArenaTest {

	 private Player playerA;
	    private Player playerB;
	    private MagicalArena arena;

	    @Before
	    public void setUp() {
	        playerA = new Player("Player A", 50, 5, 10);
	        playerB = new Player("Player B", 100, 10, 5);
	        arena = new MagicalArena(playerA, playerB);
	    }

	    @Test
	    public void testArenaInitialization() {
	        assertEquals(playerA, arena.getCurrentAttacker());
	        assertEquals(playerB, arena.getCurrentDefender());
	    }

	    @Test
	    public void testAttackRound() {
	        // Simulate an attack round
	        arena.attackRound(6, 2); 
	        assertEquals(70, playerB.getHealth()); 
	    }

	    @Test
	    public void testGameEndsWhenPlayerHealthReachesZero() {
	        while (playerA.isAlive() && playerB.isAlive()) {
	            arena.attackRound(playerA.rollDie(), playerB.rollDie());
	        }
	        assertFalse(playerA.isAlive()); 
	        assertTrue(playerB.isAlive()); 
	    }


}
