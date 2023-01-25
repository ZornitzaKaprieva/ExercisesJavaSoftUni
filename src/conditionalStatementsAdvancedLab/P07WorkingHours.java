package conditionalStatementsAdvancedLab;

import java.util.Scanner;

/*Да се напише програма, която чете час от денонощието(цяло число) и ден от седмицата(текст) -
въведени от потребителя и проверява дали офисът на фирма е отворен,
като работното време на офисът е от 10-18 часа, от понеделник до събота включително*/
public class P07WorkingHours {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        //solution 1 (switch)

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (hour >= 10 && hour <= 18){
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
                break;
            default:
                System.out.println("closed");
        }

        //solution 2 (boolean){

        boolean isWorkingDays = day.equals("Monday") ||
                day.equals("Tuesday") ||
                day.equals("Wednesday") ||
                day.equals("Thursday") ||
                day.equals("Friday") ||
                day.equals("Saturday"); //ако някоя стойност е налична = true

        boolean isWorkingHours = hour >= 10 && hour <= 18;

        if (isWorkingDays && isWorkingHours) {
            System.out.println("open");
        }else {
            System.out.println("closed");
        }
    }
}
