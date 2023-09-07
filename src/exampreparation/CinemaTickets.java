package exampreparation;

import java.util.Scanner;

/*Вашата задача е да напишете програма, която да изчислява процента на билетите за всеки тип от продадените билети:
студентски(student), стандартен(standard) и детски(kid), за всички прожекции.
Трябва да изчислите и колко процента от залата е запълнена за всяка една прожекция.
Вход
Входът е поредица от цели числа и текст:
•	На първия ред до получаване на командата "Finish" - име на филма – текст
•	На втори ред – свободните места в салона за всяка прожекция – цяло число [1 … 100]
•	За всеки филм, се чете по един ред до изчерпване на свободните места в залата или до получаване на командата "End":
o	Типа на закупения билет - текст ("student", "standard", "kid")
Изход
На конзолата трябва да се печатат следните редове:
•	След всеки филм да се отпечата, колко процента от кино залата е пълна
"{името на филма} - {процент запълненост на залата}% full."
•	При получаване на командата "Finish" да се отпечатат четири реда:
o	"Total tickets: {общият брой закупени билети за всички филми}"
o	"{процент на студентските билети}% student tickets."
o	"{процент на стандартните билети}% standard tickets."
o	"{процент на детските билети}% kids tickets."*/

public class CinemaTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int studentCount = 0;
        int standardCount = 0;
        int kidsCount = 0;
        int totalTicketsCount = 0;
        while (!command.equals("Finish")) {
            String movieName = command;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            int currentTicketCount = 0;
            for (int i = 1; i <= freeSeats; i++) {
                String ticketType = scanner.nextLine();

                switch (ticketType) {
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    case "kid":
                        kidsCount++;
                        break;
                }

                if (ticketType.equals("End") || currentTicketCount >= freeSeats) {
                    break;
                }

                currentTicketCount++;
                totalTicketsCount++;
            }

            double percentFull = (1.0 * currentTicketCount / freeSeats) * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, percentFull);

            command = scanner.nextLine();

        }
        double percentStudent = (1.0 * studentCount / totalTicketsCount) * 100;
        double percentStandard = (1.0 * standardCount / totalTicketsCount) * 100;
        double percentKids = (1.0 * kidsCount / totalTicketsCount) * 100;

        System.out.printf("Total tickets: %d%n", totalTicketsCount);
        System.out.printf("%.2f%% student tickets.%n", percentStudent);
        System.out.printf("%.2f%% standard tickets.%n", percentStandard);
        System.out.printf("%.2f%% kids tickets.%n", percentKids);
    }
}
