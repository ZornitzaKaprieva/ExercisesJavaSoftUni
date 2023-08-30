package conditionalstatements.advanced.exercises;

import java.util.Scanner;

/*Магазин за цветя предлага 3 вида цветя: хризантеми, рози и лалета. Цените зависят от сезона.
Сезон	            Хризантеми	        Рози	        Лалета
Пролет / Лято	    2.00 лв./бр.	 4.10 лв./бр.	  2.50 лв./бр.
Есен / Зима	        3.75 лв./бр.	 4.50 лв./бр.	  4.15 лв./бр.
В празнични дни цените на всички цветя се увеличават с 15%. Предлагат се следните отстъпки:
•	За закупени повече от 7 лалета през пролетта – 5% от цената на целият букет.
•	За закупени 10 или повече рози през зимата – 10% от цената на целият букет.
•	За закупени повече от 20 цветя общо през всички сезони – 20% от цената на целият букет.
Отстъпките се правят по така написания ред и могат да се наслагват! Всички отстъпки важат след оскъпяването за празничен ден!
Цената за аранжиране на букета винаги е 2лв. Напишете програма, която изчислява цената за един букет.
Вход
Входът се чете от конзолата и съдържа точно 5 реда:
•	На първия ред е броят на закупените хризантеми – цяло число в интервала [0 ... 200]
•	На втория ред е броят на закупените рози – цяло число в интервала [0 ... 200]
•	На третия ред е броят на закупените лалета – цяло число в интервала [0 ... 200]
•	На четвъртия ред е посочен сезона – [Spring, Summer, Аutumn, Winter]
•	На петия ред е посочено дали денят е празник – [Y – да / N - не]
Изход
Да се отпечата на конзолата 1 число – цената на цветята, форматирана до вторият знак след десетичната запетая.*/

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numChrysanthemums = Integer.parseInt(scanner.nextLine()); //[0 ... 200]
        int numRoses = Integer.parseInt(scanner.nextLine()); //[0 ... 200]
        int numTulips = Integer.parseInt(scanner.nextLine()); //[0 ... 200]
        String season = scanner.nextLine(); //[Spring, Summer, Autumn, Winter]
        String isHoliday = scanner.nextLine(); //[Y – да / N - не]

        double priceChrysanthemums = 0;
        double priceRoses = 0;
        double priceTulips = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                priceChrysanthemums = numChrysanthemums * 2;
                priceRoses = numRoses * 4.1;
                priceTulips = numTulips * 2.5;
                break;
            case "Autumn":
            case "Winter":
                priceChrysanthemums = numChrysanthemums * 3.75;
                priceRoses = numRoses * 4.5;
                priceTulips = numTulips * 4.15;
                break;
        }

        double sum = priceChrysanthemums + priceRoses + priceTulips;

        if (isHoliday.equals("Y")) {
            sum = sum + sum * 0.15;
        }

        if (season.equals("Spring") && numTulips > 7) {
            sum = sum * 0.95;
        }

        if (season.equals("Winter") && numRoses >= 10) {
            sum = sum * 0.9;
        }

        if (numChrysanthemums + numRoses + numTulips > 20) {
            sum = sum * 0.8;
        }

        double bouquetPrice = sum + 2;
        System.out.printf("%.2f", bouquetPrice);
    }
}

