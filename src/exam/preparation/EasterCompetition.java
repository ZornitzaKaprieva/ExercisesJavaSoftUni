package exam.preparation;

import java.util.Scanner;

/*С наближаването на Великден, пекарна организира конкурс за направата на най-хубав козунак.
Напишете програма, която да намира сладкаря с най-висок резултат.
В началото на конкурса се въвежда броя на козунаците, които ще бъдат дегустирани от посетителите на пекарната, като за всеки козунак различен брой посетители, ще дадат оценка от 1 до 10.
Вход
Първоначално от конзолата се прочита броя на козунаците – цяло число в интервала [1… 100]
След това за всеки козунак се прочита:
•	Името на пекаря, който е направил козунака – текст
•	До получаване на командата "Stop" се прочита
o	оценка за козунак от един човек  – цяло число в интервала [1... 10]
Изход
След получаване на командата "Stop" се печата един ред:
•	"{името на пекаря} has {общият брой получени точки} points."
Ако след командата "Stop", пекарят е с най-много точки до момента, да се отпечата допълнителен ред:
•	"{името на пекаря} is the new number 1!"
След дегустация на всички козунаци, да се отпечата един ред:
•	"{името на пекаря с най-много точки} won competition with {точките на пекаря} points!"
*/
public class EasterCompetition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int easterBreadCount = Integer.parseInt(scanner.nextLine());

        int bakerMaxPoints = Integer.MIN_VALUE; //кой има най-много точки до момента. В случая може и = 0, ако предположим, че няма да получат отрицатени точки
        String winnerName = ""; //кой печели състезанието

        for (int i = 1; i <= easterBreadCount; i++){
            String baker = scanner.nextLine();

            int personalPoints = 0;

            String input = scanner.nextLine(); //int + Stop


            while (!input.equals("Stop")){
                int currentEstimate = Integer.parseInt(input);
                personalPoints += currentEstimate;

                input = scanner.nextLine();
            }

            System.out.printf("%s has %d points.\n", baker, personalPoints);

            if (personalPoints > bakerMaxPoints){ //така разбираме кой е новият номер 1
                bakerMaxPoints = personalPoints;
                System.out.printf("%s is the new number 1!\n", baker);
                winnerName = baker; //така разбираме кой е номер 1 в състезанието
            }
        }

        System.out.printf("%s won competition with %d points!\n",winnerName, bakerMaxPoints);
    }
}
