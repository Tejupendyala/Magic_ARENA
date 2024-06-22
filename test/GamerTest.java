import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GamerTest {

	@Test
    public void testPlayerInitialization() {
        Player player = new Player("TestPlayer", 100, 10, 5);
        assertEquals("TestPlayer", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getStrength());
        assertEquals(5, player.getAttack());
        assertTrue(player.isAlive());
    }

    @Test
    public void testTakeDamage() {
        Player player = new Player("TestPlayer", 100, 10, 5);
        player.takeDamage(20);
        assertEquals(80, player.getHealth());
        player.takeDamage(85); // this should bring health to 0
        assertFalse(player.isAlive());
    }

    @Test
    public void testCalculateAttackDamage() {
        Player player = new Player("TestPlayer", 100, 10, 5);
        assertEquals(30, player.calculateAttackDamage(6)); // 5 * 6 = 30
    }

    @Test
    public void testCalculateDefenseStrength() {
        Player player = new Player("TestPlayer", 100, 10, 5);
        assertEquals(20, player.calculateDefenseStrength(4)); // 10 * 4 = 20
    }

}
