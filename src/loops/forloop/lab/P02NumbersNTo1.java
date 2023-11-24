package loops.forloop.lab;

import java.util.Scanner;

/*Напишете програма, която чете цяло положително число n, въведено от потребителя и печата числата от n до 1 в обратен ред.
Въведеното число n, винаги ще бъде по-голямо от 1.
Примерен вход1: 2
Примерен изход1: 2 1
Примерен вход2: 5
Примерен изход2: 5 4 3 2 1*/

public class P02NumbersNTo1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >= 1 ; i--) {
            System.out.println(i);
        }
    }
}
