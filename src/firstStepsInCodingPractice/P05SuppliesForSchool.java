package firstStepsInCodingPractice;

/*Учебната година вече е започнала и отговорничката на 10Б клас - Ани
трябва да купи определен брой пакетчета с химикали, пакетчета с маркери, както и препарат за почистване на дъска.
Тя е редовна клиентка на една книжарница, затова има намаление за нея, което представлява някакъв процент от общата сума.
Напишете програма, която изчислява колко пари ще трябва да събере Ани, за да плати сметката,
като имате предвид следния ценоразпис:
•	Пакет химикали - 5.80 лв.
•	Пакет маркери - 7.20 лв.
•	Препарат - 1.20 лв (за литър)
Вход: От конзолата се четат 4 числа:
•	Брой пакети химикали - цяло число в интервала [0...100]
•	Брой пакети маркери - цяло число в интервала [0...100]
•	Литри препарат за почистване на дъска - цяло число в интервала [0…50]
•	Процент намаление - цяло число в интервала [0...100]
Изход: Да се отпечата на конзолата колко пари ще са нужни на Ани, за да си плати сметката.
*/
import java.util.Scanner;

public class P05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int howManyPens = Integer.parseInt(scanner.nextLine());
        int howManyHighlights = Integer.parseInt(scanner.nextLine());
        int howManyCleaner = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pensPrice = howManyPens * 5.80;
        double highlightsPrice = howManyHighlights * 7.20;
        double cleanerPrice = howManyCleaner * 1.20;

        double purchaseSum = pensPrice + highlightsPrice + cleanerPrice;
        double finalDiscount = purchaseSum * (discount/100.0);

        double finalSum = purchaseSum - finalDiscount;

        System.out.println(finalSum);




    }
}
