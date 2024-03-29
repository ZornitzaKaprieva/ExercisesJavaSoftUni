package loops.forloop.lab;

import java.util.Scanner;

/*Да се напише програма, която чете 2 * n-на брой цели числа, подадени от потребителя,
и проверява дали сумата на първите n числа (лява сума) е равна на сумата на вторите n числа (дясна сума).
При равенство печата " Yes, sum = " + сумата; иначе печата " No, diff = " + разликата.
Разликата се изчислява като положително число (по абсолютна стойност).
Примерен вход1: 2  10  90  60  40
Примерен изход1: Yes, sum = 100
Примерен вход2: 2  90  9  50  50
Примерен изход2: No, diff = 1*/

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //solution 1:
        int n = Integer.parseInt(scanner.nextLine()); 

        //for цикъл за първата сума:
        int leftSum = 0;
        for (int i = 1; i <= n; i++) { //щом не е стринг е ок да почва от 1 (зависи от логиката)
            int currentNum = Integer.parseInt(scanner.nextLine()); 
            leftSum = leftSum + currentNum;
        }

        //for цикъл за втората сума:
        int rightSum = 0;
        for (int i = 1; i <= n; i++) { 
            int currentNum = Integer.parseInt(scanner.nextLine());
            rightSum = rightSum + currentNum;
        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d%n", leftSum);
        } else {
            int diff = Math.abs(leftSum - rightSum);
            System.out.printf("No, diff = %d%n", diff);
        }

        //solution 2:
        /*int n2 = Integer.parseInt(scanner.nextLine()); //1. задаваме колко числа ще приема програмата.

        int leftSum2 = 0;
        int rightSum2 = 0;

        for (int i = 1; i <= n2 * 2; i ++) { //задаваме, че ще направим 2 итерации
            int currentNum2 = Integer.parseInt(scanner.nextLine());

            if ( i <= n2) {
                leftSum2 = leftSum2 + currentNum2;
            } else {
                rightSum2 = rightSum2 + currentNum2;
            }
        }
        if (leftSum2 == rightSum2) {
            System.out.printf("Yes, sum = %d%n", leftSum2);
        } else {
            int diff = Math.abs(leftSum2 - rightSum2);
            System.out.printf("No, diff = %d%n", diff);
        }
*/
    }
}
