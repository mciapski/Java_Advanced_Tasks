package Collections.Workshop2;


import java.math.BigDecimal;
import java.util.Comparator;

public class EarningsComparator implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        return player1.getEarnings().compareTo(player2.getEarnings());
    }


}
