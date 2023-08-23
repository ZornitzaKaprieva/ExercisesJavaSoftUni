package loops.forloop.exercises;

import java.util.Scanner;

/*Напишете програма която да пресмята средният разход за месец на семейство за даден период време. За всеки месец разходите са следните:
•	За ток – всеки месец е различен, ще се чете от конзолата
•	за вода – 20 лв.
•	за интернет – 15 лв.
•	за други – събират се тока, водата и интернета за месеца и към сумата се прибавят 20%.
За всеки разход трябва да се пресметне колко общо е платено за всички месеци.
Вход
Входът се чете от конзолата:
•	Първи ред – месеците за които се търси средният разход – цяло число в интервала [1...100]
•	За всеки месец – сметката за ток – реално число в интервала [1.00...1000.00]
Изход
Да се отпечата на конзолата 5 реда:
•	1ви ред: "Electricity: {ток за всички месеци} lv"
•	2ри ред: "Water: {вода за всички месеци} lv"
•	3ти ред: "Internet: {интернет за всички месеци} lv"
•	4ти ред: "Other: {други за всички месеци} lv"
•	5ти ред: "Average: {средно всички разходи за месец} lv"
Всички числа трябва да са форматирана до вторият знак след запетаята.*/

public class P06Bills {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        double electricity = 0;
        for(int i = 1; i <= months; i++){
            double electricityPerMonth = Double.parseDouble(scanner.nextLine());
            electricity += electricityPerMonth;
        }

        double water = 20 * months;
        double internet = 15 * months;
        double other = (electricity + water + internet) + (electricity + water + internet) * 0.2;
        double avgSum = (electricity + water + internet + other) / months;

        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", other);
        System.out.printf("Average: %.2f lv%n", avgSum);
    }
}
