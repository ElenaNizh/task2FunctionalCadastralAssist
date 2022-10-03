import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество сделок: ");
        int numberOfDeals = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите цену за кв.метр");
        int pricePerMeter = Integer.parseInt(scanner.nextLine());

        //генерируем набор сделок
        List<Deal> deals = Generator.generateDeals(numberOfDeals);

        //создаем функцию через функциональный интерфейс, которая выбирает честные сделки
        Function<List<Deal>, List<Deal>> assistant = data -> data.stream()
                .filter(d -> d.getCost() < d.getLength() * d.getWidth() * pricePerMeter)
                .collect(Collectors.toList());

        // Применяем функцию assistant для выбора честных сделок
        List<Deal> fairDeals = assistant.apply(deals);

        //показываем ВСЕ сделки
        System.out.println("ВСЕ сделки:");
        for (Deal deal : deals) {
            System.out.printf("Width: %d, length: %d, cost: %d\n", deal.getWidth(), deal.getLength(), deal.getCost());
        }
        //показываем только честные сделки
        System.out.println("Честные сделки:");
        for (Deal deal : fairDeals) {
            System.out.printf("Width: %d, length: %d, cost: %d\n", deal.getWidth(), deal.getLength(), deal.getCost());
        }
    }
}