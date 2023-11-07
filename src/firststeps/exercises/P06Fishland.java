package firststeps.exercises;

import java.util.Scanner;

/*Георги ще има гости вечерта и решава да ги нагости с паламуд, сафрид и миди.
Затова отива на рибната борса, за да си купи по няколко килограма.
Oт конзолата се въвеждат цените в лева на скумрията и цацата.
Също количеството на паламуд, сафрид и миди в килограми.
Колко пари ще са му необходими, за да плати сметката си, ако цените на борсата са:
•	Паламуд – 60% по-скъп от скумрията
•	Сафрид – 80% по-скъп от цацата
•	Миди – 7.50 лв. за килограм
Вход
От конзолата се четат 5 числа:
•	Първи ред – цена на скумрията на килограм. Реално число в интервала [0.00…40.00]
•	Втори ред – цена на цацата на килограм. Реално число в интервала [0.00…30.00]
•	Трети ред – килограма паламуд. Реално число в интервала [0.00…50.00]
•	Четвърти ред – килограма сафрид. Реално число в интервала [0.00… 70.00]
•	Пети ред – килограма миди. Цяло число в интервала [0 ... 100]
Изход
Да се отпечата на конзолата едно число с плаваща запетая: колко пари ще са нужни на Георги, за да си плати сметката.
Числото трябва да е форматирано до вторият знак след десетичната запетая (1.2457 -> 1.25).
Примерен вход1: 6.90  4.20  1.5  2.5  1
Примерен изход1: 42.96
Примерен вход2: 5.55  3.57  4.3  3.6  7
Примерен изход2: 113.82*/

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPricePerKg = Double.parseDouble(scanner.nextLine());
        double spratPricePerKg = Double.parseDouble(scanner.nextLine());

        double bonitoKilos = Double.parseDouble(scanner.nextLine());
        double scadKilos = Double.parseDouble(scanner.nextLine());
        double musselsKilos = Double.parseDouble(scanner.nextLine());

        double bonitoPrice = (mackerelPricePerKg + (mackerelPricePerKg * 0.6)) * bonitoKilos;
        double scadPrice = (spratPricePerKg + (spratPricePerKg * 0.8)) * scadKilos;
        double musselsPrice = 7.5 * musselsKilos;

        double sum = bonitoPrice + scadPrice + musselsPrice;

        System.out.printf("%.2f", sum);
    }
}
