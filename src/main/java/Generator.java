
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {


    private static Random random = new Random(System.currentTimeMillis());

    //Генерация набора сделок
    public static List<Deal> generateDeals(int numberOfDeals) {
        List<Deal> deals = new ArrayList<>();
        for (int i = 0; i < numberOfDeals; i++) {
            deals.add(generateNewDeal());
        }
        return deals;
    }

    //генерация сделки
    private static Deal generateNewDeal() {
        return new Deal();
    }

}

