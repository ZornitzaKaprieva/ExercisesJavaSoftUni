package conditional.statements.advanced.practice;

import java.util.Scanner;

/*Атанас решава да прекара отпуската си в Банско и да кара ски. Преди да отиде обаче, трябва да резервира хотел и да изчисли колко ще му струва престоя. Налични са следните видове помещения, със следните цени за престой:
	"room for one person" – 18.00 лв за нощувка
	"apartment" – 25.00 лв за нощувка
	"president apartment" – 35.00 лв за нощувка
Според броят на дните, в които ще остане в хотела (пример: 11 дни = 10 нощувки) и видът на помещението, което ще избере, той може да ползва различно намаление.
Намаленията са както следва:
вид помещение	по-малко от 10 дни	между 10 и 15 дни	повече от 15 дни
room for one person	не ползва намаление	не ползва намаление	не ползва намаление
apartment	30% от крайната цена	35% от крайната цена	50% от крайната цена
president apartment	10% от крайната цена	15% от крайната цена	20% от крайната цена
След престоя, оценката на Атанас за услугите на хотела може да е позитивна (positive) или негативна (negative) . Ако оценката му е позитивна, към цената с вече приспаднатото намаление Атанас добавя 25% от нея. Ако оценката му е негативна приспада от цената 10%.
Вход
Входът се чете от конзолата и се състои от три реда:
•	Първи ред - дни за престой - цяло число в интервала [0...365]
•	Втори ред - вид помещение - "room for one person", "apartment" или "president apartment"
•	Трети ред - оценка - "positive"  или "negative"
Изход
На конзолата трябва да се отпечата един ред:
•	Цената за престоят му в хотела, форматирана до втория знак след десетичната запетая.
*/
public class P09SkiTrip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfStay = Integer.parseInt(scanner.nextLine());//[0...365]
        String roomType = scanner.nextLine(); //"room for one person", "apartment" или "president apartment"
        String estimate = scanner.nextLine();; //"positive"  или "negative"

        int nights = daysOfStay - 1;
        double price = 0;

        switch (roomType) {
            case "room for one person":
                price = nights * 18;
                break;

            case "apartment":
                price = nights * 25;

                if (nights < 10){
                    price = price * 0.7;

                } else if (nights >= 10 && nights <= 15) {
                    price = price * 0.65;
                }
                else if (nights > 15 ) {
                    price = price * 0.5;
                }

                break;
            case "president apartment":
                price = nights * 35;

                if (nights < 10){
                    price = price * 0.9;
                } else if (nights >= 10 && nights <= 15) {
                    price = price * 0.85;
                }
                else {
                    price = price * 0.8;
                }

                break;
        }

        if (estimate.equals("positive")) {
            price = price + (price*0.25);
        } else if (estimate.equals("negative")) {
            price = price * 0.9;
        }

        System.out.printf("%.2f", price);

    }
}
