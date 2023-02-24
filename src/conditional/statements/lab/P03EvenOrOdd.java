package conditional.statements.lab;

import java.util.Scanner;

/*Да се напише програма, която чете цяло число, въведено от потребителя и печата дали е четно или нечетно.
Ако е четно отпечатайте "even", ако е нечетно "odd".
*/
public class P03EvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int isOddOrEven = Integer.parseInt(scanner.nextLine());

        if(isOddOrEven % 2 == 0) { //модулно деление (hint: 1548 % 10 = 8 (последната цифра); 1548 % 100 = 48 (последните 2 цифри)
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
