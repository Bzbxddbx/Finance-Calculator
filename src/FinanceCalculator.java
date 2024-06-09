import java.util.Scanner;

public class FinanceCalculator {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму: ");
        float sum = scanner.nextFloat();

        float pocketMoney = sum * 0.15f;
        float averageTarget = sum * 0.55f;
        float investments = sum * 0.30f;

        System.out.printf("На карманные расходы: %.2f рублей\n" +
                        "На то что копишь: %.2f рублей\n" +
                        "На инвестиции: %.2f рублей",
                            pocketMoney, averageTarget, investments);
    }
}
