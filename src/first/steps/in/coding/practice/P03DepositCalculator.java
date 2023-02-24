package first.steps.in.coding.practice;

/*Напишете програма, която изчислява каква сума ще получите в края на депозитния период при определен лихвен процент.
Използвайте следната формула:
сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
Вход: От конзолата се четат 3 реда:
1.	Депозирана сума – реално число в интервала [100.00 … 10000.00]
2.	Срок на депозита (в месеци) – цяло число в интервала [1…12]
3.	Годишен лихвен процент – реално число в интервала [0.00 …100.00]
Изход: Да се отпечата на конзолата сумата в края на срока.
*/
import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percentPerYear = Double.parseDouble(scanner.nextLine());

        double amountPerMonth = (deposit * (percentPerYear / 100)) /12;  //(percentPerYear/100) - така изчисляваме проценти

        double totalSum = deposit + amountPerMonth * months;

        System.out.println(totalSum);


    }
}
