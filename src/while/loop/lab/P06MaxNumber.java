package whileLoop.whileLoopLab;

import java.util.Scanner;

/*Напишете програма, която до получаване на командата "Stop",
чете цели числа, въведени от потребителя и намира най-голямото измежду тях.
Въвежда се по едно число на ред.*/
public class P06MaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int maxNum = Integer.MIN_VALUE; //сравняваме го с вазможно най-малкото число. в края ще изелезе най-голямото число

        while (!input.equals("Stop")){
            int currentNumber = Integer.parseInt(input);
            input = scanner.nextLine();

            if (currentNumber > maxNum) { //правим си проверка: ако новото въведено число е по-голямо от maxNum, значи ече то е най-голямо число
                maxNum = currentNumber;
            }
        }

        System.out.println(maxNum);
    }
}
