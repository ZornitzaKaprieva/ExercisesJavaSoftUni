package exampreparation;

import java.util.Scanner;

/*"Numbers" е нова игра, която се играе с 36 карти
(двойки, тройки, четворки, петици, шестици, седмици, осмици, деветки и десетки от всички 4 бои).
Правилата на играта са следните:
	Играе се от двама играчи, които започват с равен брой карти
	На всяко раздаване всеки един от тях дава по 1 карта:
o	Ако картата на първия играч е с по-голяма стойност от картата на втория играч,
първият получава точки, които са равни на разликата между картата на първия и картата на втория
(например: първият дава тройка купа, а вторият двойка каро -> първият печели, защото 3 > 2 и точките, които печели, са 3 – 2 = 1).
o	Ако картата на втория играч е с по-голяма стойност от картата на първия играч,
вторият получава точки, които са равни на разликата между картата на втория и картата на първия
(например: вторият дава осмица пика, а първият шестица спатия -> вторият печели, защото 8 > 6 и точките, които печели, са 8 – 6 = 2).
o	Ако картите, които дават двамата, са с еднаква стойност, тогава се получава "Number wars" и всеки един от играчите трябва да даде по още една карта. Играчът, чиято карта е с по-голяма стойност, печели и играта приключва(В този случай, няма да има еднакви карти).
	Освен при "Number wars", играта може да приключи и при команда "End of game". Тогава никой не печели и играта приключва.
Вход
Първоначално се четат два реда:
•	Име на първия играч - текст
•	Име на втория играч - текст
След това, до получаване на команда "End of game", се четат многократно по два реда:
1.	Карта, която дава първият играч- цяло число в интервала [2…9]
2.	Карта, която дава вторият играч -  цяло число в интервала [2…9]
При еднакви карти на двамата играчи се прочитат нови два реда (карта, която дава първият и карта, която дава вторият.)
Изход
При случая, в който има "Number wars ", да се отпечата:
•	"Number wars!"
•	"{име на победителя} is winner with {брой натрупани точки} points"
При команда "End of game" да се отпечатат два реда:
•	"{име на първия играч} has {брой натрупани точки за първия играч} points"
•	"{име на втория играч} has {брой натрупани точки за втория играч} points"*/

public class GameNumberWars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String player1name = scanner.nextLine();
        String player2name = scanner.nextLine();
        String command = scanner.nextLine();

        int scorePlayer1 = 0;
        int scorePlayer2 = 0;
        boolean haveWinner = false;
        int cardCount = 0;
        String winner = "";
        int winnerScore = 0;
        while(!command.equals("End of game")){
            int player1card = Integer.parseInt(command);
            int player2card = Integer.parseInt(scanner.nextLine());

            if (player1card > player2card){
                scorePlayer1 += player1card - player2card;
            } else if (player2card > player1card) {
                scorePlayer2 += player2card - player1card;
            } else if (player1card == player2card) {
                System.out.println("Number wars!");
                int player1NewCard = Integer.parseInt(scanner.nextLine());
                int player2NewCard = Integer.parseInt(scanner.nextLine());

                if (player1NewCard > player2NewCard){
                    winner = player1name;
                    winnerScore = scorePlayer1;
                } else {
                    winner = player2name;
                    winnerScore = scorePlayer2;
                }
                haveWinner = true;
                break;
            }

            cardCount += 2;
            if (cardCount == 36){
                break;
            }

            command = scanner.nextLine();
        }

        if (haveWinner){
            System.out.printf("%s is winner with %d points%n", winner, winnerScore);
        } else{
            System.out.printf("%s has %d points%n", player1name, scorePlayer1);
            System.out.printf("%s has %d points%n", player2name, scorePlayer2);
        }
    }
}
