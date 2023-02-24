package conditional.statements.lab;

import java.util.Scanner;

/* Да се напише програма, която чете цяло число, въведено от потребителя и проверява дали е под 100, между 100 и 200 или над 200. Ако числото е:
•	под 100 отпечатайте: "Less than 100"
•	между 100 и 200 отпечатайте: "Between 100 and 200"
•	над 200 отпечатайте: "Greater than 200"
*/
public class P05Number100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number < 100) {
            System.out.println("Less than 100");
        } else if (number >= 100 && number <= 200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }
    }
}
