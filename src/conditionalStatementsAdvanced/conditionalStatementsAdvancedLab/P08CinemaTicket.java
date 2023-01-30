package conditionalStatementsAdvanced.conditionalStatementsAdvancedLab;

import java.util.Scanner;

/* Да се напише програма която чете ден от седмицата (текст) – въведен от потребителя
и принтира на конзолата цената на билет за кино според деня от седмицата: \
Monday	Tuesday	Friday 12
Wednesday	Thursday	14
Saturday	Sunday 16
*/
public class P08CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        //solution 1 (switch):

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.println(12);
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println(14);
                break;
            case "Saturday":
            case "Sunday":
                System.out.println(16);
                break;
        }

        //solution 1.2 (switch):
        int priceTicket = 0;

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Friday":
                priceTicket = 12;
                break;
            case "Wednesday":
            case "Thursday":
                priceTicket = 14;
                break;
            case "Saturday":
            case "Sunday":
                priceTicket = 16;
                break;
        }

        System.out.println(priceTicket);

        //solution 2 (if):

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Friday")) {
            System.out.println(12);
        } else if (day.equals("Wednesday") || day.equals("Thursday")) {
            System.out.println(14);
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println(16);
        }

        //solution 2.2 (if + int)
        int ticketPrice = 0;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Friday")) {
            ticketPrice = 12;
        } else if (day.equals("Wednesday") || day.equals("Thursday")) {
            ticketPrice = 14;
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            ticketPrice = 16;
        }

        System.out.println(ticketPrice);


    }
}
