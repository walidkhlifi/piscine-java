import java.util.*;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
       List<Integer> res =new ArrayList<>();
       List<Integer> listCoins =new ArrayList<>(coins);
       Collections.sort(listCoins, Collections.reverseOrder());

        for (int coin : listCoins) {
            while (amount >= coin) {
                res.add(coin);
                amount -= coin;
            }
        }
        return res;
    }
}