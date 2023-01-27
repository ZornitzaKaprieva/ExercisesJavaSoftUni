package conditionalStatementsAdvancedPractice;

import java.util.Scanner;

/*В една кинозала столовете са наредени в правоъгълна форма в r реда и c колони.
Има три вида прожекции с билети на различни цени:
•	Premiere – премиерна прожекция, на цена 12.00 лева.
•	Normal – стандартна прожекция, на цена 7.50 лева.
•	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.
Напишете програма,
която чете тип прожекция (стринг), брой редове и брой колони в залата (цели числа), въведени от потребителя,
и изчислява общите приходи от билети при пълна зала.
Резултатът да се отпечата във формат като в примерите по-долу, с 2 знака след десетичната точка.
*/
public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projectionType = scanner.nextLine();
        int numberOfRows = Integer.parseInt(scanner.nextLine());
        int numberOfColumns  = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;

        if (projectionType.equals("Premiere")) {
            ticketPrice = 12.0;
        } else if (projectionType.equals("Normal")) {
            ticketPrice = 7.5;
        } else if (projectionType.equals("Discount")) {
            ticketPrice = 5;
        }

        double totalIncome = ticketPrice * (numberOfRows * numberOfColumns);

        System.out.printf("%.2f leva", totalIncome);



    }
}
