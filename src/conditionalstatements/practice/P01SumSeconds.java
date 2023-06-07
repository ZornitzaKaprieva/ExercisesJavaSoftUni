package conditionalstatements.practice;

import java.util.Scanner;

/* Трима спортни състезатели финишират за някакъв брой секунди (между 1 и 50).
Да се напише програма, която чете времената на състезателите в секунди, въведени от потребителя
и пресмята сумарното им време във формат "минути:секунди".
Секундите да се изведат с водеща нула (2  "02", 7  "07", 35  "35"). */

public class P01SumSeconds {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int player1 = Integer.parseInt(scanner.nextLine());
        int player2 = Integer.parseInt(scanner.nextLine());
        int player3 = Integer.parseInt(scanner.nextLine());

        int sumSec = player1 + player2 + player3;
        int minutes = sumSec/60;
        int seconds = sumSec % 60;

        if (seconds < 10){
            System.out.printf("%d:0%d", minutes, seconds);
        }else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
