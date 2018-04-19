package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eGameType;

public class GamePlayBlackJackTest {

	@Test
	public void test() {
		GamePlayBlackJack testGame = new GamePlayBlackJack(eGameType.BLACKJACK);
		assertNotNull(testGame);
		
		Player p1 = new Player("Joe",1);
		Player p2 = new Player("Jim",2);
		
		Table t = new Table(); // Table has already been tested to work.
		t.AddPlayerToTable(p1);
		t.AddPlayerToTable(p2);
		
		testGame.AddPlayersToGame(t.GetTable());
		
		//TODO: Add a way in GamePlay to check the population of a game, then test it here.
	}

}
