package conditionalStatements.conditionalStatementsPractice;


/*По време на обедната почивка искате да изгледате епизод от своя любим сериал.
Вашата задача е да напишете програма, с която ще разберете дали имате достатъчно време да изгледате епизода.
По време на почивката отделяте време за обяд и време за отдих. Времето за обяд ще бъде 1/8 от времето за почивка,
а времето за отдих ще бъде 1/4 от времето за почивка.
Вход
От конзолата се четат 3 реда:
1.	Име на сериал – текст
2.	Продължителност на епизод  – цяло число в диапазона [10… 90]
3.	Продължителност на почивката  – цяло число в диапазона [10… 120]
Изход
На конзолата да се изпише един ред:
•	Ако времето е достатъчно да изгледате епизода:
"You have enough time to watch {име на сериал} and left with {останало време} minutes free time."
•	Ако времето не Ви е достатъчно:
"You don't have enough time to watch {име на сериал}, you need {нужно време} more minutes."
Времето да се закръгли до най-близкото цяло число нагоре.
Примерен вход и изход
*/

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfSeries = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int restDuration = Integer.parseInt(scanner.nextLine());

        double lunchTime = restDuration/8.0; //защото, ако делим на 8, ще се приеме като int и ще дели на цяло число
        double restTime = restDuration/4.0;

        double timeLeftForSeries = restDuration - (lunchTime + restTime);

        if(timeLeftForSeries >= episodeDuration) {
            double freeTimeLeft = Math.ceil(restDuration - (episodeDuration + lunchTime + restTime));

            System.out.printf("You have enough time to watch %s " +
                    "and left with %.0f minutes free time.", nameOfSeries, freeTimeLeft); //%.0f - дава цяло число
        } else {
            double neededMoreTime = Math.ceil(episodeDuration - timeLeftForSeries);

            System.out.printf("You don't have enough time to watch %s, " +
                    "you need %.0f more minutes.", nameOfSeries, neededMoreTime);
        }

    }
}
