package loops.whileloop.lab;

import java.util.Scanner;

/*Напишете програма, която до получаване на командата "Stop",
чете цели числа, въведени от потребителя и намира най-малкото измежду тях.
Въвежда се по едно число на ред. */

public class P07MinNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        int minNumber = Integer.MAX_VALUE;

        while (!number.equals("Stop")){
            int currentNumber = Integer.parseInt(number);
            
            number = scanner.nextLine();
            
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
        }
        System.out.println(minNumber);
    }
}
