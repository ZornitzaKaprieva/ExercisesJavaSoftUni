package conditional.statements.advanced.practice;

import java.util.Scanner;

/*Странно, но повечето хора си плануват от рано почивката.
Млад програмист разполага с определен бюджет и свободно време в даден сезон.
Напишете програма, която да приема на входа бюджета и сезона,
а на изхода да изкарва, къде ще почива програмиста и колко ще похарчи.
Бюджетът определя дестинацията, а сезонът определя колко от бюджета ще изхарчи.
Ако е лято ще почива на къмпинг, а зимата в хотел.
Ако е в Европа, независимо от сезона ще почива в хотел.
Всеки къмпинг или хотел, според дестинацията, има собствена цена която отговаря на даден процент от бюджета:

•	При 100лв. или по-малко – някъде в България
o	Лято – 30% от бюджета
o	Зима – 70% от бюджета
•	При 1000лв. или по малко – някъде на Балканите
o	Лято – 40% от бюджета
o	Зима – 80% от бюджета
•	При повече от 1000лв. – някъде из Европа
o	При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета.
Вход
Входът се чете от конзолата и се състои от два реда, въведени от потребителя:
•	Първи ред – Бюджет, реално число в интервала [10.00...5000.00].
•	Втори ред –  Един от двата възможни сезона: "summer" или "winter"
Изход
На конзолата трябва да се отпечатат два реда.
•	Първи ред – "Somewhere in {дестинация}" измежду "Bulgaria", "Balkans" и "Europe"
•	Втори ред – "{Вид почивка} – {Похарчена сума}"
o	Почивката може да е между "Camp" и "Hotel"
o	Сумата трябва да е закръглена с точност до вторият знак след десетичната запетая
*/
public class P05Journey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine()); //[10.00...5000.00].
        String season = scanner.nextLine(); // "summer" или "winter"

        String destination = "";
        double hotelOrCampBudget = 0;
        String whereToSleep = "";


        if (!(budget < 10) && budget <= 100) {
            destination = "Bulgaria";

            if (season.equals("summer")) {
                whereToSleep = "Camp";
                hotelOrCampBudget = budget * 0.30;
            } else if (season.equals("winter")) {
                whereToSleep = "Hotel";
                hotelOrCampBudget = budget * 0.70;
            }

        } else if (budget >100 && budget <= 1000) {
            destination = "Balkans";

            if (season.equals("summer")) {
                whereToSleep = "Camp";
                hotelOrCampBudget = budget * 0.40;
            } else if (season.equals("winter")) {
                whereToSleep = "Hotel";
                hotelOrCampBudget = budget * 0.80;
            }

        } else if (budget > 1000 && budget <= 5000) {
            destination = "Europe";
            whereToSleep = "Hotel";
            hotelOrCampBudget = budget * 0.90;
        }

        System.out.printf("Somewhere in %s\n%s - %.2f\n", destination, whereToSleep, hotelOrCampBudget);
    }
}
