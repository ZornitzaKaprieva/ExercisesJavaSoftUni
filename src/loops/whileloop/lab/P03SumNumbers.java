package loops.whileloop.lab;

import java.util.Scanner;

/*Напишете програма, която чете цяло число от конзолата и на всеки следващ ред цели числа,
докато тяхната сума стане по-голяма или равна на първоначалното число.
След приключване на четенето да се отпечата сумата на въведените числа.*/

public class P03SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (sum < number) {
            int nextNumber = Integer.parseInt(scanner.nextLine());
            sum += nextNumber;
        }
        
            System.out.println(sum);
    }
}
