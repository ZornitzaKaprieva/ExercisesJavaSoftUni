package forLoop.forLoopLab;

import java.util.Scanner;

/*Да се напише програма, която чете n-на брой цели числа, подадени от потребителя
и проверява дали сумата от числата на четни позиции е равна на сумата на числата на нечетни позиции.
•	Ако сумите са равни да се отпечатат два реда: "Yes" и на нов ред "Sum = " + сумата;
•	Ако сумите не са равни да се отпечат два реда: "No" и на нов ред "Diff = " + разликата.
Разликата се изчислява по абсолютна стойност.
*/

public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            //отделям  четни от нечетни:
            if (i % 2 == 0) {
                evenSum += currentNum;
            } else {
                oddSum += currentNum;
            }

        }

        int diff = Math.abs(evenSum-oddSum);
        if (evenSum == oddSum) {
            System.out.printf("Yes\nSum = %d\n", evenSum); //може и oddSum. В случая са еднакви
        }else {
            System.out.printf("No\nDiff = %d\n", diff);
        }
    }
}
