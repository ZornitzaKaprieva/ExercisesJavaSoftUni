package exampreparation;

import java.util.Scanner;

/*На Великден семейството на Деси се събира и тя решава да организира "битка" между великденски яйца.
Правилата на "битката" са следните:
•	Участват двама играчи
•	Всеки от тях започва с определен брой яйца
•	При получаване на команда "one" -> първият играч печели => яйцата на втория намаляват с едно
•	При получаване на команда "two" -> вторият играч печели => яйцата на първия намаляват с едно
•	Играта приключва, ако някой от играчите остане без яйца или до получаване на команда "End"
Вход
Първоначално се четат два реда:
1.	Брой яйца, които има първият играч - цяло число в интервала [1 … 99]
2.	Брой яйца, които има вторият играч - цяло число в интервала [1 … 99]
След това до получаване на команда "End" се четe многократно един ред:
3.	Победител - текст - "one" или "two"
Изход
Ако първият играч остане без яйца:
•	"Player one is out of eggs. Player two has {брой останали яйца на втория играч} eggs left."
Ако вторият играч остане без яйца:
•	"Player two is out of eggs. Player one has {брой останали яйца на първия играч} eggs left."
При команда "End" да се отпечатат два реда:
•	"Player one has {брой останали яйца на първия играч} eggs left."
•	"Player two has {брой останали яйца на втория играч} eggs left."*/

public class EasterEggsBattle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int eggsFirstPlayer = Integer.parseInt(scanner.nextLine());
        int eggsSecondPlayer = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        boolean isFinish = false;

        while (!command.equals("End")){
            String winner = command;

            switch (winner){
                case "one":
                    eggsSecondPlayer--;
                    break;
                case "two":
                    eggsFirstPlayer--;
                    break;
            }

            if (eggsFirstPlayer <= 0){
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.%n", eggsSecondPlayer);
                isFinish = true;
                break;
            }

            if (eggsSecondPlayer <= 0){
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.%n", eggsFirstPlayer);
                isFinish = true;
                break;
            }

            command = scanner.nextLine();
        }

        if(!isFinish){
            System.out.printf("Player one has %d eggs left.%n", eggsFirstPlayer);
            System.out.printf("Player two has %d eggs left.%n", eggsSecondPlayer);
        }
    }
}
