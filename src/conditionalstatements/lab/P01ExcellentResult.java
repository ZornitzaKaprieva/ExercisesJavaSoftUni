package conditionalstatements.lab;

import java.util.Scanner;

/*Напишете програма, която чете оценка (цяло число), въведена от потребителя
и отпечатва "Excellent!", ако оценката е 5 или по-висока.
Примерен вход1: 6
Примерен изход1: Excellent!
Примерен вход2: 5
Примерен изход2: Excellent!
Примерен вход3: 4
Примерен изход3: (няма изход)*/

public class P01ExcellentResult {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int result = Integer.parseInt(scanner.nextLine());

        if(result >= 5) {
            System.out.println("Excellent!");
        }
    }
}
