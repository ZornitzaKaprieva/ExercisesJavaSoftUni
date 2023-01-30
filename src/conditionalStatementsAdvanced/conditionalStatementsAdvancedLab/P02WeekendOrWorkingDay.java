package conditionalStatementsAdvanced.conditionalStatementsAdvancedLab;


import java.util.Scanner;

/*Напишете програма която, чете ден от седмицата (текст), на английски език - въведен от потребителя.
Ако денят е работен отпечатва на конзолата - "Working day", ако е почивен - "Weekend".
Ако се въведе текст различен от ден от седмицата да се отпечата - "Error".*/
public class P02WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        //solution 1:

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
        }
        //solution 2: (is it OK?)

 /*       switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                System.out.println("Working day");
                break;
            case "Saturday", "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");

        }*/
    }
}
