import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class PlayerTests {
	
	Player player1;
	Player player2;
	
	@Before
	public void setUp() {
		player1 = new Player("Bob", 6000, 150, 50);
		player2 = new Player("Slime", 200, 100, 5);
		
		player1.setPlayerLevel(3);
	}
	
	@Test
	public void testIsDead() {
		boolean result = player1.isDead();
		
		assertFalse(result);
	}
	
	@Test
	public void testAttack() {
		player1.attack(player2);
		
		int expectedResult = 50;
		
		assertEquals(expectedResult, player2.getPlayerHP());
	}
	
}
