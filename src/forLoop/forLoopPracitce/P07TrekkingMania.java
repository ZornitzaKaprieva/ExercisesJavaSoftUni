package forLoop.forLoopPracitce;

import java.util.Scanner;

/*Катерачи от цяла България се събират на групи и набелязват следващите върхове за изкачване. Според размера на групата, катерачите ще изкачват различни върхове.
•	Група до 5 човека – изкачват Мусала
•	Група от 6 до 12 човека – изкачват Монблан
•	Група от 13 до 25 човека – изкачват Килиманджаро
•	Група от 26 до 40 човека –  изкачват К2
•	Група от 41 или повече човека – изкачват Еверест
Да се напише програма, която изчислява процента на катерачите изкачващи всеки връх.
Вход
От конзолата се четат поредица от числа, всяко на отделен ред:
•	На първия ред – броя на групите от катерачи – цяло число в интервала [1...1000]
•	За всяка една група на отделен ред – броя на хората в групата – цяло число в интервала [1...1000]
Изход
Да се отпечатат на конзолата 5 реда, всеки от които съдържа процент между 0.00% и 100.00% с точност до втората цифра след десетичната запетая.
•	Първи ред - процентът изкачващи Мусала
•	Втори ред – процентът изкачващи Монблан
•	Трети ред – процентът изкачващи Килиманджаро
•	Четвърти ред – процентът изкачващи К2
•	Пети ред – процентът изкачващи Еверест
*/
public class P07TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfGroups = Integer.parseInt(scanner.nextLine()); // [1...1000]

        boolean isValidNumberOfGroups = numberOfGroups >= 1 && numberOfGroups <= 1000;

        int counterMusalaGroups = 0;
        int counterMontBlancGroups = 0;
        int counterKilimanjaroGroups  = 0;
        int counterK2Groups  = 0;
        int counterEverestGroups   = 0;

        int allPeopleForMusala = 0;
        int allPeopleForMontBlanc = 0;
        int allPeopleForKilimanjaro = 0;
        int allPeopleForK2 = 0;
        int allPeopleForEverest = 0;

        int overallNumberOfPeople = 0;

        for (int i = 1; i <= numberOfGroups; i++) {
            int numberOfPeopleInTheGroup = Integer.parseInt(scanner.nextLine());
            overallNumberOfPeople += numberOfPeopleInTheGroup;


            if (numberOfPeopleInTheGroup >= 1 && numberOfPeopleInTheGroup <= 5 && isValidNumberOfGroups){
                counterMusalaGroups++;
                allPeopleForMusala += numberOfPeopleInTheGroup;

            } else if (numberOfPeopleInTheGroup >= 6 && numberOfPeopleInTheGroup <= 12 && isValidNumberOfGroups) {
                counterMontBlancGroups++;
                allPeopleForMontBlanc += numberOfPeopleInTheGroup;

            }else if (numberOfPeopleInTheGroup >= 13 && numberOfPeopleInTheGroup <= 25 && isValidNumberOfGroups) {
                counterKilimanjaroGroups++;
                allPeopleForKilimanjaro += numberOfPeopleInTheGroup;

            } else if (numberOfPeopleInTheGroup >= 26 && numberOfPeopleInTheGroup <= 40 && isValidNumberOfGroups) {
                counterK2Groups++;
                allPeopleForK2 += numberOfPeopleInTheGroup;

            } else if (numberOfPeopleInTheGroup >= 41 && isValidNumberOfGroups){
                counterEverestGroups++;
                allPeopleForEverest += numberOfPeopleInTheGroup;
            }
        }

        double percentMusala =  (allPeopleForMusala * 1.0 / overallNumberOfPeople) * 100;
        double percentMontBlanc = (allPeopleForMontBlanc * 1.0 / overallNumberOfPeople) * 100;
        double percentKilimanjaro = (allPeopleForKilimanjaro * 1.0 / overallNumberOfPeople) * 100;
        double percentK2 = (allPeopleForK2 * 1.0 / overallNumberOfPeople) * 100;
        double percentEverest = (allPeopleForEverest * 1.0 / overallNumberOfPeople) * 100;

        System.out.printf("%.2f%%\n", percentMusala);
        System.out.printf("%.2f%%\n", percentMontBlanc);
        System.out.printf("%.2f%%\n", percentKilimanjaro);
        System.out.printf("%.2f%%\n", percentK2);
        System.out.printf("%.2f%%\n", percentEverest);
    }
}
