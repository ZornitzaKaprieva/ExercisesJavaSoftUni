package loops.nestedloops.exercises;

import java.util.Scanner;

/*Деси трябва да заведе котката си на ветеринар в клиниката "Happy Cat", но паркингът се заплаща.
Напишете програма, която пресмята колко общо трябва да се плати за престоя на колата на Деси на паркинга, за да заведе котката си на ветеринар.
Паркингът е различен от останалите и има разнообразен ценоразпис.
За всеки четен ден и нечетен час, паркингът таксува 2.50 лева.
Във всеки нечетен ден и четен час таксата е 1.25 лева, във всички останали случаи се заплаща 1 лев.
Таксуването става на всеки изминал час от деня.
Всеки един от изходите трябва да бъде закръглен до втория знак след десетичната запетая.
Вход
От конзолата се четат два реда:
•	Брой дни – цяло число в интервала [1 … 5]
•	Брой часове за всеки един от дните - цяло число в интервала [1 … 24]
Изход:
Да се отпечата на конзолата:
•	За всеки изминал ден, общата сума, която трябва да се плати – "Day: {индексът на деня} – {общата сума за деня} leva"
•	Когато програмата приключи - "Total: {общата сума за всички дни} leva"*/

public class P11HappyCatParking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        for (int d = 1; d <= day; d++){

            double price = 0;
            for (int h = 1; h <= hour; h++){
                if (d % 2 == 0 && h % 2 != 0){
                    price += 2.5;
                } else if (d % 2 != 0 && h % 2 == 0) {
                    price += 1.25;
                } else {
                    price += 1;
                }
            }

            sum += price;
            System.out.printf("Day: %d - %.2f leva%n", d, price);
        }

        System.out.printf("Total: %.2f leva%n", sum);
    }
}