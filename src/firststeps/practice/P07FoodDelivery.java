package firststeps.practice;

import java.util.Scanner;

/*Ресторант отваря врати и предлага няколко менюта на преференциални цени:
•	Пилешко меню –  10.35 лв.
•	Меню с риба – 12.40 лв.
•	Вегетарианско меню  – 8.15 лв.
Напишете програма, която изчислява колко ще струва на група хора да си поръчат храна за вкъщи.
Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
Цената на доставка е 2.50 лв и се начислява най-накрая.
Вход
От конзолата се четат 3 реда:
•	Брой пилешки менюта – цяло число в интервала [0 … 99]
•	Брой менюта с риба – цяло число в интервала [0 … 99]
•	Брой вегетариански менюта – цяло число в интервала [0 … 99]
Изход
Да се отпечата на конзолата един ред:  "{цена на поръчката}"
Примерен вход1: 2 4 3
Примерен изход1: 116.2
Примерен вход2: 9 2 6
Примерен изход2: 202.72*/

public class P07FoodDelivery {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegieMenu  = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chickenMenu * 10.35d;
        double fishPrice = fishMenu * 12.40d;
        double vegiePrice = vegieMenu * 8.15d;
        double mainMeals = chickenPrice + fishPrice + vegiePrice;
        double dessert = mainMeals * 0.2;

        double mealsSum = mainMeals + dessert;
        double finalSum = mealsSum + 2.50;

        System.out.println(finalSum);
    }
}
