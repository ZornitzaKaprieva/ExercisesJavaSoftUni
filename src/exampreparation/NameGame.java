package exampreparation;

import java.util.Scanner;

/*Иван е измислил нова игра в която да се състезава със своите приятели. Вашата задача е да напишете програма за играта.
Всеки играч написва името си, след това за всяка една буква от името си написва по едно цяло число,
ако числото съвпада с ASCII стойността на съответната буква, играчът получава 10 точки, в противен случай, получава само 2 точки.
Победител е играчът с най-много точки в края на играта.
В случай, че двама играчи имат равен брой точки, печели този, който втори е достигнал резултата.
Вход
До получаване на командата "Stop" се чете по един ред:
•	Име на играча с дължина n - текст
За всеки играч се четат n на брой реда:
•	число – цяло число в интервала[0…127]
Изход
Да се отпечата един ред в следния формат:
•	"The winner is {името на победителя} with {точките на победителя} points!"*/

public class NameGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        String winner = "";
        int totalScore = 0;
        while (!command.equals("Stop")) {
            String namePlayer = command;

            int points = 0;
            for (int i = 0; i < namePlayer.length(); i++) {
                int num = Integer.parseInt(scanner.nextLine());
                int charLetter = namePlayer.charAt(i);

                if (num == charLetter) {
                    points += 10;
                    } else {
                        points += 2;
                    }
            }

            if (points >= totalScore) {
                totalScore = points;
                winner = namePlayer;
            }

            command = scanner.nextLine();
        }

            System.out.printf("The winner is %s with %d points!", winner, totalScore);
        }
    }
