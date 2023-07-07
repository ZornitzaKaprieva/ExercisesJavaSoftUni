package exampreparation;

import java.util.Scanner;

/*Любо очаква гости за Великден. Той разполага с определен бюджет, който е предвидил, за да купи козунаци и боядисани яйца.
Известно е, че един козунак стига за трима човека, като всеки гост ще получи и по 2 яйца.
Вашата задача е да намерите колко козунака и яйца трябва да купи Любо, както и каква ще е сумата, която той трябва да плати и дали бюджета му е достатъчен.
При изчисляването на броя козунаци, които Любо трябва да закупи, техният брой трябва да се закръгли към по-голямото цяло число.
Ако парите не му стигат, трябва да се изведе съобщение, колко не му достигат.
Известно е, че:
•	Един козунак струва 4лв.
•	Едно яйце струва 0.45лв.
Вход
От конзолата се четат 2 реда:
•	На първия ред са броят на гостите – цяло число в интервала [0 ... 200000]
•	На втория ред е бюджетът с който разполага Любо  – цяло число в интервала [0 ... 200000]
Изход
На конзолата да се отпечатат два реда:
•	Ако бюджетът е достатъчен:
o	"Lyubo bought {брои закупени козунаци} Easter bread and {брои закупени яйца} eggs."
o	"He has {останали пари} lv. left."
•	Ако  бюджетът НЕ Е достатъчен:
o	"Lyubo doesn't have enough money."
o	"He needs {недостигащи пари} lv. more."
Парите да бъдат форматирани до втората цифра след десетичния знак.*/

public class EasterGuests {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double neededBread = Math.ceil( guests / 3.0);
        double neededEggs = guests * 2;

        double breadPrice = neededBread * 4;
        double eggsPrice = neededEggs * 0.45;
        double sum = breadPrice + eggsPrice;

        double diff = Math.abs(budget - sum);

        if(budget >= sum){
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n", neededBread, neededEggs);
            System.out.printf("He has %.2f lv. left.%n", diff);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.%n", diff);
        }
    }
}
