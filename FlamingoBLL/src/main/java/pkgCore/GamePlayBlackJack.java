package pkgCore;

import java.util.HashMap;
import java.util.UUID;
import pkgEnum.eGameType;

public class GamePlayBlackJack extends GamePlay {
	
	private HashMap<UUID, HandBlackJack> hmGameHands = new HashMap<UUID, HandBlackJack>();

	public GamePlayBlackJack(Table t) {
		super(eGameType.BLACKJACK);
		t.CreateDeck(pkgEnum.eGameType.BLACKJACK); // TODO: make the CreateDeck method actually work
		this.AddPlayersToGame(t.GetTable());
		
		for(Player pAdd: t.GetTable()) {
			hmGameHands.put(pAdd.getPlayerID(), new HandBlackJack());
		}
	}

}
