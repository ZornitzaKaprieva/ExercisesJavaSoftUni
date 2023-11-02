package firststeps.practice;

import java.util.Scanner;

/*Напишете програма за конвертиране на щатски долари (USD) в български лева (BGN).
Използвайте фиксиран курс между долар и лев: 1 USD = 1.79549 BGN.
Примерен вход1: 22
Примерен изход2: 39.50078
Примерен вход2: 12.5
Примерен изход2: 22.443625*/

public class P01USDToBGN {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;
        System.out.println(bgn);
    }
}
