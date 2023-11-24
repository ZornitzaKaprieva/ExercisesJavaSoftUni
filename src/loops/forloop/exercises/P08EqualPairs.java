package loops.forloop.exercises;

import java.util.Scanner;

/*Дадени са 2*n-на брой числа. Първото и второто формират двойка, третото и четвъртото също и т.н.
Всяка двойка има стойност – сумата от съставящите я числа.
Напишете програма, която проверява дали всички двойки имат еднаква стойност или печата максималната разлика между две последователни двойки.
Ако всички двойки имат еднаква стойност, отпечатайте "Yes, value={Value}" + стойността.
В противен случай отпечатайте "No, maxdiff={Difference}" + максималната разлика.
Примерен вход1: 3 1  2  0  3  4  -1
Примерен изход1: Yes, value=3
Примерен вход2: 4  1  1  3  1  2  2  0  0
Примерен изход2: No, maxdiff=4*/

public class P08EqualPairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int lastSum = 0;
        int counter = 0;
        int maxDifference = 1;

        for (int i = 1; i <= input; i++) {
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());

            sum = firstNum + secondNum;

            if (sum == lastSum) {
                counter++;
            }
            if (maxDifference < Math.abs(lastSum - sum) && i >= 2) {
                maxDifference = Math.abs(lastSum - sum);
            }
            if (!(sum == lastSum)) {
                lastSum = sum;
            }
        }

        if (counter == input - 1) {
            System.out.printf("Yes, value=%d", sum);
        } else {

            System.out.printf("No, maxdiff=%d", maxDifference);
        }
    }
}
