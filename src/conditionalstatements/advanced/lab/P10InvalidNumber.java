package conditionalstatements.advanced.lab;

import java.util.Scanner;

/*Дадено число е валидно, ако е в диапазона [100…200] или е 0.
Да се напише програма, която чете цяло число, въведено от потребителя,
и печата "invalid" ако въведеното число не е валидно. */

public class P10InvalidNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        boolean isValidNumber = number >= 100 && number <= 200 || number == 0; //ако е в този диапазон или е 0

        if (!isValidNumber) { //!ако не е валидно число, печата "invalid"
            System.out.println("invalid");
        }
    }
}
