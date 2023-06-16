package loops.forloop.pracitce;

import java.util.Scanner;

/*Да се напише програма, която чете n-на брой цели числа, въведени от потребителя,
и проверява дали сред тях съществува число, което е равно на сумата на всички останали.
•	Ако има такъв елемент печата "Yes" и на нов ред "Sum = "  + неговата стойност
•	Ако няма такъв елемент печата "No" и на нов ред "Diff = " + разликата между най-големия елемент и сумата на останалите (по абсолютна стойност)*/

public class P02HalfSumElement {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum; // OR:  sum = sum + currentNum;

            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
        }

        int sumWithoutMaxNum = sum - maxNum;
        if (maxNum == sumWithoutMaxNum) {
            System.out.printf("Yes\nSum = %d\n", maxNum);
        } else {
            int diff = Math.abs(maxNum - sumWithoutMaxNum);
            System.out.printf("No\nDiff = %d\n", diff);
        }
    }
}
