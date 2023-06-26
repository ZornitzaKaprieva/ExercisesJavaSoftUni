package exampreparation;

import java.util.Scanner;

/*Симона и Светлин ще ходят на почивка в Африка и искат да отидат на сафари.
Понеже за делничните дни вече имат планове, решават, че ще отидат събота или неделя.
Напишете програма, която изчислява колко ще им струва ходенето на сафари и дали бюджетът им ще им стигне да отидат,
като имате предвид следното:
•	Цената на един литър гориво е 2.10 лв.
•	Цената за екскурзовод е 100лв.
•	В зависимост от деня има отстъпки от общата цена - за събота 10%, а за неделя 20%
Вход
От конзолата се четат 3 реда:
•	Бюджет – реално число в интервала [0.00… 10000.00]
•	Колко литра гориво ще са им нужни – реално число в интервала [1.00… 50.00]
•	Ден от седмицата – текст с възможности "Saturday" и "Sunday"
Изход
Да се отпечата на конзолата един ред:
•	Ако бюджетът е достатъчен:
"Safari time! Money left: {колко пари са им останали} lv. "
•	Ако бюджетът не е достатъчен:
"Not enough money! Money needed: {колко пари не им достигат} lv."
Сумите трябва да са форматирани до втория знак след десетичната запетая.*/

public class Safari {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuelLiters = Double.parseDouble(scanner.nextLine());
        String dayOfWeek = scanner.nextLine(); //"Saturday" и "Sunday"

        double price1LiterFuel = 2.10;
        double priceTourGuide = 100.0;

        double allCosts = (fuelLiters * price1LiterFuel) + priceTourGuide;

        double totalPriceWithDiscount = 0;

        switch (dayOfWeek){
            case "Saturday":
                totalPriceWithDiscount = allCosts * 0.9;
                break;
            case "Sunday":
                totalPriceWithDiscount = allCosts * 0.8;
                break;
        }

        double moneyLeft = Math.abs(budget - totalPriceWithDiscount);

        if (allCosts <= budget){
            System.out.printf("Safari time! Money left: %.2f lv.", moneyLeft);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", moneyLeft);
        }
    }
}
