package pkgCore;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TableTest {

	@Test
	public void TestTableExists() {
		Table t = new Table();
		assertNotNull(t);
	}
	
	@Test
	public void TestTableWorks() {
		Table t = new Table();
		Player p1 = new Player("Joe",1);
		Player p2 = new Player("Jim",2);
		t.AddPlayerToTable(p1);
		ArrayList<Player> playerList = t.GetTable();
		assertNotNull(playerList);
		Player playerGet = t.GetPlayerFromTable(p1);
		assertNotNull(playerGet);
		assertEquals(playerGet,p1);
	}

}
