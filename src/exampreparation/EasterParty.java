package exampreparation;

import java.util.Scanner;

/*Деси има рожден ден на Великден и иска да организира парти за своите приятели.
Тя знае какъв е броят гости, които иска да покани и колко е кувертът за всеки гост.
От броя гости зависи и каква отстъпка ще получи за куверта за един човек.
Ако покани:
•	Между 10 (вкл.) и 15 (вкл.) човека -> 15 % отстъпка от куверта за един човек
•	Между 15 и 20 (вкл.) човека -> 20 % отстъпка от куверта за един човек
•	Над 20 човека -> 25 % отстъпка от куверта за един човек
Деси трябва да предвиди и закупуването на торта за партито. Цената на тортата е 10% от бюджета на Деси.
Напишете програма, която изчислява дали бюджетът на Деси ще и е достатъчен за партито.
Вход
От конзолата се четат 3 реда:
1.	Брой гости – цяло число в интервала [1...99]
2.	Цена на куверт за един човек – реално число в интервала [0.00 … 99.00]
3.	Бюджетът на Деси  – реално число в интервала [0.00 … 9999.00]
Изход
На конзолата да се отпечата един ред:
•	Ако бюджетът  е достатъчен:
o	"It is party time! {останали пари} leva left."
•	Ако бюджетът не е достатъчен:
o	"No party! {недостигащи пари} leva needed."
Резултатът да бъде форматиран до втория знак след десетичната запетая.*/

public class EasterParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfGuests = Integer.parseInt(scanner.nextLine());
        double priceForGuest = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double cakePrice = budget * 0.1; //10% от бюджета на Деси.

        if (numberOfGuests >= 10 && numberOfGuests <= 15){
            priceForGuest = priceForGuest * 0.85;
        } else if (numberOfGuests > 15 && numberOfGuests <= 20) {
            priceForGuest = priceForGuest * 0.8;
        } else if (numberOfGuests > 20) {
            priceForGuest = priceForGuest * 0.75;
        }

        double expenses = (numberOfGuests * priceForGuest) + cakePrice;
        double leftMoney = Math.abs(budget - expenses);

        if (expenses <= budget){
            System.out.printf("It is party time! %.2f leva left.", leftMoney);
        } else {
            System.out.printf("No party! %.2f leva needed.", leftMoney);
        }
    }
}
