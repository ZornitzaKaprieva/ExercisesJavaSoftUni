package loops.whileloop.exercises;

import java.util.Scanner;

/*Напишете програма, която прочита едно число n, след това прочита n на брой цели числа
и принтира средно аритметичното на тяхната сума число, форматирано до втората цифра след десетични знак.*/

public class P05AverageNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        for(int i = 1; i <= n; i++){
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;
        }

        double avg = sum / n;

        System.out.printf("%.2f", avg);
    }
}
