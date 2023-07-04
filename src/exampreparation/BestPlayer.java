package exampreparation;

import java.util.Scanner;

/*Пепи иска да напишете програма, чрез която да разбере кой е най-добрият играч от световното първенство.
Информацията, която получавате ще бъде играч и колко гола е отбелязал.
От вас се иска да отпечатате кой е играчът с най-много голове и дали е направил хет-трик.
Хет-трик е, когато футболистът е вкарал 3 или повече гола. Ако футболистът е вкарал 10 или повече гола, програмата трябва да спре.
Вход:
От конзолата се четат по два реда до въвеждане на команда "END":
•	Име на играч – текст
•	Брой вкарани голове  – цяло положително число в интервала [1 … 10000]
Изход:
На конзолата да се отпечатат 2 реда :
•	На първия ред:
            "{име на играч} is the best player!"
•	На втория ред :
o	 Ако най-добрият футболист е направил хеттрик:
                   "He has scored {брой голове} goals and made a hat-trick !!!"
o	Ако най-добрият футболист не е направил хеттрик:
                   "He has scored {брой голове} goals."*/

public class BestPlayer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String bestPlayer = "";
        int bestPlayerGoals = 0;
        while (!input.equals("END")){
            String name = input;
            int goals = Integer.parseInt(scanner.nextLine());

            if (goals > bestPlayerGoals){
                bestPlayer = name;
                bestPlayerGoals = goals;
            }

            if (goals >= 10){
                break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n", bestPlayer);

        if (bestPlayerGoals >= 3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", bestPlayerGoals);
        } else {
            System.out.printf("He has scored %d goals.%n", bestPlayerGoals);
        }
    }
}
