package loops.forloop.lab;

import java.util.Scanner;

/*Напишете програма, която чете цяло положително число n, въведено от потребителя
и печата числата от n до 1 в обратен ред.
Въведеното число n, винаги ще бъде по-голямо от 1.*/
public class P02NumbersNTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >= 1 ; i--) { // за числата от 5 до 1: for (int i = 5; i >= 1 ; i--) = от 5 намалаваме с едно, докато 5 не достигне 1
            System.out.println(i);
        }


    }
}
