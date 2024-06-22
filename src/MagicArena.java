
public class MagicArena {
	
	 public static void main(String[] args) {
	        Gamer playerA = new Gamer("PlayerA", 50, 5, 10);
	        Gamer playerB = new Gamer("PlayerB", 100, 10, 5);

	        boolean playerATurn = playerA.getHealth() < playerB.getHealth(); 

	        while (playerA.isAlive() && playerB.isAlive()) {
	            Gamer attacker, defender;

	            if (playerATurn) {
	                attacker = playerA;
	                defender = playerB;
	            } else {
	                attacker = playerB;
	                defender = playerA;
	            }

	            // Attacker rolls a die
	            int attackDieRoll = attacker.rollDie();
	            int attackDamage = attacker.calculateAttackDamage(attackDieRoll);

	            // Defender rolls a die
	            int defenseDieRoll = defender.rollDie();
	            int defenseStrength = defender.calculateDefenseStrength(defenseDieRoll);

	            // Calculate actual damage dealt to defender
	            int damageTaken = Math.max(0, attackDamage - defenseStrength);

	            defender.takeDamage(damageTaken);

	            System.out.printf("%s attacks %s with die roll %d. Damage: %d\n", attacker.getName(), defender.getName(),
	                    attackDieRoll, damageTaken);

	            playerATurn = !playerATurn;
	        }

	        // Determine the winner
	        if (!playerA.isAlive() && !playerB.isAlive()) {
	            System.out.println("It's a draw!");
	        } else if (!playerA.isAlive()) {
	            System.out.println("gamerB wins!");
	        } else {
	            System.out.println("gamerA wins!");
	        }
	    }

}
