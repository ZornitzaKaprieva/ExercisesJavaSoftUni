package first.steps.in.coding.practice;

/*Напишете програма за конвертиране на щатски долари (USD) в български лева (BGN).
Използвайте фиксиран курс между долар и лев: 1 USD = 1.79549 BGN.*/
import java.util.Scanner;

public class P01USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;
        System.out.println(bgn);
    }
}
