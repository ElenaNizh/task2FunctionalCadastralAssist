import java.util.Random;

public class Deal {

    private int length;
    private int width;
    private int cost;
    private final Random random = new Random();

    private final static int MAX_LENGTH = 100;   // Максимальное значение длины комнаты для генерации
    private final static int MAX_WIDTH = 100;    // Максимальное значение ширины комнаты для генерации
    private final static int MAX_COST = 500;  // Максимальное значение стоимости комнаты для генерации
    // Максимальный коэффицент ценности и  комфорта помещения
    //private final static int MAX_RATIO = 10;

    public Deal() {
        this.length = random.nextInt(MAX_LENGTH);
        this.width = random.nextInt(MAX_WIDTH);
        this.cost = length * width * (random.nextInt(MAX_COST));
    }


    public int getLength() {
        return length;
    }


    public int getWidth() {
        return width;
    }


    public int getCost() {
        return cost;
    }


}
