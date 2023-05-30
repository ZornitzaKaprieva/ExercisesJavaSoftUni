package loops.whileloop.lab;

import java.util.Scanner;

/*Напишете програма, която чете число n, въведено от потребителя,
и отпечатва всички числа ≤ n от редицата: 1, 3, 7, 15, 31, ….
Всяко следващо число се изчислява като умножим предишното с 2 и добавим 1.*/
public class P04Sequence2kPlus1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sequence2kPlus1 = 1;

        while (sequence2kPlus1 <= number) {
            System.out.println(sequence2kPlus1);
            sequence2kPlus1 = sequence2kPlus1 * 2 + 1;
        }
    }
}
