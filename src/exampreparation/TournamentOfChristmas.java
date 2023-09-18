package exampreparation;

import java.util.Scanner;

/*Напишете програма, която проследява представянето на вашия отбор на благотворителен коледен турнир.
Всеки ден получавате имена на игри до команда "Finish". Със спечелването на всяка една игра печелите по 20лв. за благотворителност.
Трябва да изчислите колко пари сте спечелили на края на деня.
Ако имате повече спечелени игри, отколкото загубени – вие сте победители този ден и увеличавате парите от него с 10%.
При приключване на турнира ако през повечето дни сте били победители печелите турнира и увеличавате всичките спечелени пари с 20%.
Никога няма да имате равен брой спечелени и загубени игри.
Вход
Първоначално от конзолата се прочита броя дни на турнира – цяло число в интервала [1… 20]
До получаване на командата "Finish" се чете:
•	Спорт  – текст
За всеки спорт се прочита:
o	Резултат  – текст с възможности: "win" или "lose"
Изход
Накрая се отпечатва един ред:
•	Ако сте спечелили турнира:
     	"You won the tournament! Total raised money: {спечелените пари}"
•	Ако сте загубили на турнира:
"You lost the tournament! Total raised money: {спечелените пари}"
Парите да бъдат форматирани до втората цифра след десетичния знак.*/

public class TournamentOfChristmas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        int dayWinCount = 0;
        int dayLoseCount = 0;
        double raisedMoneySum = 0;
        for (int i = 1; i <= days; i++) {
            String command = scanner.nextLine();

            double raisedMoneyPerDay = 0;
            int winCount = 0;
            int loseCount = 0;
            while (!command.equals("Finish")) {
                String sport = command;
                String result = scanner.nextLine();

                if (result.equals("win")) {
                    raisedMoneyPerDay += 20;
                    winCount++;
                } else if (result.equals("lose")) {
                    loseCount++;
                }

                command = scanner.nextLine();
            }

            if (winCount > loseCount) {
                raisedMoneyPerDay += raisedMoneyPerDay * 0.1;
                dayWinCount++;
            } else {
                dayLoseCount++;
            }

            raisedMoneySum += raisedMoneyPerDay;
        }

        if (dayWinCount > dayLoseCount) {
            raisedMoneySum += raisedMoneySum * 0.2;
            System.out.printf("You won the tournament! Total raised money: %.2f%n", raisedMoneySum);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f%n", raisedMoneySum);
        }
    }
}
