package exampreparation;

import java.util.Scanner;

/*Бабата на Деси всяка година приготвя обяд за семейството си за Великден.
Напишете програма, която изчислява какви разходи ще има по приготвянето на обяда, като знаете колко броя козунаци,
кори с яйца и килограма курабии е купила.
Цените на продуктите са следните:
•	Козунак  – 3.20 лв.
•	Яйца –  4.35 лв. за кора с 12 яйца
•	Курабии – 5.40 лв. за килограм
•	Боя за яйца - 0.15 лв. за яйце
Вход
От конзолата се четат 3 реда:
•	Брой козунаци - цяло число в интервала [0 … 99]
•	Брой кори с яйца - цяло число в интервала [0 … 99]
•	Килограми курабии - цяло число в интервала [0 … 99]
Изход
Да се отпечата на конзолата колко ще са разходите по приготвянето на обяда. Сумата да бъде форматирана до втория знак след десетичната запетая.*/

public class EasterLunch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int easterBread = Integer.parseInt(scanner.nextLine());
        int eggsPack = Integer.parseInt(scanner.nextLine()); // кора с 12 яйца
        int kgCookies  = Integer.parseInt(scanner.nextLine());

        double easterBreadPrice = easterBread * 3.20;
        double eggsPackPrice = eggsPack * 4.35;
        double kgCookiesPrice = kgCookies * 5.40;

        double eggPaintPriceForEggsPack = eggsPack * (12 * 0.15);

        double sum = easterBreadPrice + eggsPackPrice + kgCookiesPrice + eggPaintPriceForEggsPack;

        System.out.printf("%.2f", sum);
    }
}
