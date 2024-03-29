package conditionalstatements.exercises;

import java.util.Scanner;

/*Студент трябва да пропътува n километра. Той има избор измежду три вида транспорт:
•	Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
•	Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
•	Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.
Напишете програма, която въвежда броя километри n и период от деня (ден или нощ) и изчислява цената на най-евтиния транспорт.
Вход
От конзолата се четат два реда:
•	Първият ред съдържа числото n – брой километри – цяло число в интервала [1…5000]
•	Вторият ред съдържа дума “day” или “night” – пътуване през деня или през нощта
Изход
Да се отпечата на конзолата най-ниската цена за посочения брой километри, форматирана до втория знак след десетичния разделител.
Примерен вход1: 5 day
Примерен изход1: 4.65
Примерен вход2: 180  night
Примерен изход2: 10.80*/

public class P04TransportPrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String when = scanner.nextLine();

        double price = 0;

        if (n < 20) {

            if (when.equals("day")) {
                price = 0.7 + (n * 0.79);
            } else if (when.equals("night")) {
                price = 0.7 + (n * 0.9);
            }

        } else if (n >= 20 && n < 100) {
            price = n * 0.09;
        } else if (n >= 100) {
            price = n * 0.06;
        }

            System.out.printf("%.2f", price);
        }
    }

