package loops.forloop.exercises;

import java.util.Scanner;

/*Напишете програма, която чете n-на брой числа, въведени от потребителя, и пресмята сумата,
минимума и максимума на числата на четни и нечетни позиции (броим от 1).
Когато няма минимален / максимален елемент, отпечатайте "No".
Изходът да се форматира в следния вид:
"OddSum=" + {сума на числата на нечетни позиции},
"OddMin=" + { минимална стойност на числата на нечетни позиции } / {“No”},
"OddMax=" + { максимална стойност на числата на нечетни позиции } / {“No”},
"EvenSum=" + { сума на числата на четни позиции },
"EvenMin=" + { минимална стойност на числата на четни позиции } / {“No”},
"EvenMax=" + { максимална стойност на числата на четни позиции } / {“No”}
Всяко число трябва да е форматирано до втория знак след десетичната запетая.*/

public class P11OddEvenPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        double evenSum = 0;
        double oddSum = 0;

        double evenMin = Integer.MAX_VALUE;
        double oddMin = Integer.MAX_VALUE;

        double evenMax = Integer.MIN_VALUE;
        double oddMax = Integer.MIN_VALUE;

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= num; i++) {
            double currentNum = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += currentNum;
                evenCount++;

                if (currentNum <= evenMin) {
                    evenMin = currentNum;
                }

                if (currentNum > evenMax) {
                    evenMax = currentNum;
                }
            } else {
                oddSum += currentNum;
                oddCount++;

                if (currentNum <= oddMin) {
                    oddMin = currentNum;
                }

                if (currentNum > oddMax) {
                    oddMax = currentNum;
                }
            }
        }

        System.out.printf("OddSum=%.2f,%n", oddSum);

        if(oddCount == 0){
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        } else{
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }

        System.out.printf("EvenSum=%.2f,%n", evenSum);

        if(evenCount == 0){
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else{
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f%n", evenMax);
        }
    }
}
