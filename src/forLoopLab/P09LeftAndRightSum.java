package forLoopLab;

import java.util.Scanner;

/*Да се напише програма, която чете 2 * n-на брой цели числа, подадени от потребителя,
и проверява дали сумата на първите n числа (лява сума) е равна на сумата на вторите n числа (дясна сума).
При равенство печата " Yes, sum = " + сумата; иначе печата " No, diff = " + разликата.
Разликата се изчислява като положително число (по абсолютна стойност). */
public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //solution 1:
        int n = Integer.parseInt(scanner.nextLine()); //1. задаваме колко числа ще приема програмата.

        //for цикъл за първата сума:
        int leftSum = 0;
        for (int i = 1; i <= n; i++) { //щом не е стринг е ок да по ва от 1 (зависи от логиката)
            int currentNum = Integer.parseInt(scanner.nextLine()); //2. Въвеждаме толкова числа, колкото ни иска програмата
            leftSum = leftSum + currentNum;
            }

        //for цикъл за втората сума:
        int rightSum = 0;
        for (int i = 1; i <= n; i++) { //щом не е стринг е ок да по ва от 1 (зависи от логиката)
            int currentNum = Integer.parseInt(scanner.nextLine()); //2. Въвеждаме толкова числа, колкото ни иска програмата
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
