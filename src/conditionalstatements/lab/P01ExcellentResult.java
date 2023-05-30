package conditionalstatements.lab;

import java.util.Scanner;

/*Напише конзолна програма, която чете оценка (цяло число), въведена от потребителя
и отпечатва "Excellent!", ако оценката е 5 или по-висока.*/
public class P01ExcellentResult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = Integer.parseInt(scanner.nextLine());

        if(result >= 5) {
            System.out.println("Excellent!");
        }

    }
}
