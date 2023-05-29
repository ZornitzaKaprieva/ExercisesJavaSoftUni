package first.steps.in.coding.additional.exercises;

import java.util.Scanner;

/*Градинар продавал реколтата от градината си на зеленчуковата борса.
Продава зеленчуци за N лева на килограм и плодове за M лева за килограм.
Напишете програма, която да пресмята приходите от реколтата в евро ( ако приемем, че едно евро е равно на 1.94лв).
Вход
От конзолата се четат 4 числа, по едно на ред:
•	Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
•	Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
•	Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
•	Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]
Изход
Да се отпечата на конзолата едно число: приходите от всички плодове и зеленчуци в евро.
Резултата да се форматира до втория знак след десетичния разделител.
 */
public class P04VegetableMarket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double priceKiloVegetables = Double.parseDouble(scanner.nextLine()); //[0.00… 1000.00]
        double priceKiloFruits = Double.parseDouble(scanner.nextLine()); //[0.00… 1000.00]

        int totalKiloVegetables = Integer.parseInt(scanner.nextLine()); //[0… 1000]
        int totalKiloFruits = Integer.parseInt(scanner.nextLine()); //[0… 1000]

        boolean isValidPriceVeg = priceKiloVegetables >= 0 && priceKiloVegetables <= 1000;
        boolean isValidPriceFruits = priceKiloVegetables >= 0 && priceKiloVegetables <= 1000;
        boolean isValidKiloVeg = priceKiloVegetables >= 0 && priceKiloVegetables <= 1000;
        boolean isValidKiloFruits = priceKiloVegetables >= 0 && priceKiloVegetables <= 1000;
        boolean isValidInput = isValidPriceVeg && isValidPriceFruits && isValidKiloVeg && isValidKiloFruits;

        double sumVeg = priceKiloVegetables * totalKiloVegetables;
        double sumFruits = priceKiloFruits * totalKiloFruits;
        double overallSumLv = sumVeg + sumFruits;

        double overallSumEuro = overallSumLv /  1.94;

        System.out.printf("%.2f", overallSumEuro);
    }
}

