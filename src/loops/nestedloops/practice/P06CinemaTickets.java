package loops.nestedloops.practice;

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
o	"{процент на детските билети}% kids tickets."
Примерен вход1:
    Taxi
    10
    standard
    kid
    student
    student
    standard
    standard
    End
    Scary Movie
    6
    student
    student
    student
    student
    student
    student
    Finish
Примерен изход1:
    Taxi - 60.00% full.
    Scary Movie - 100.00% full.
    Total tickets: 12
    66.67% student tickets.
    25.00% standard tickets.
    8.33% kids tickets.*/

public class P06CinemaTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputMovie = scanner.nextLine(); // до получаване на командата "Finish" - име на филма

        int counterTotalTickets = 0;
        int counterStudentTickets = 0;
        int counterStandardTickets = 0;
        int counterKidTickets = 0;

        while (!inputMovie.equals("Finish")){
            String movie = inputMovie;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            String ticketType = scanner.nextLine();

            int counterTicketsPerMovie = 0;
            while (!ticketType.equals("End")){
                counterTicketsPerMovie++;

                switch (ticketType) {
                    case "student":
                        counterStudentTickets++;
                        break;
                    case "standard":
                        counterStandardTickets++;
                        break;
                    case "kid":
                        counterKidTickets++;
                        break;
                }

                if (counterTicketsPerMovie >= freeSeats) { //ако някой иска да си купи билет, но няма вече място в залата
                    break;
                }

                ticketType = scanner.nextLine();
            }

            counterTotalTickets += counterTicketsPerMovie;

            double percentFull = (counterTicketsPerMovie * 1.0 / freeSeats) * 100;
            System.out.printf("%s - %.2f%% full.\n", movie, percentFull);

            inputMovie = scanner.nextLine();
        }

        double percentStudentTickets = (counterStudentTickets * 1.0 / counterTotalTickets) * 100;
        double percentStandardTickets = (counterStandardTickets * 1.0  / counterTotalTickets) * 100;
        double percentKidTickets = (counterKidTickets * 1.0  / counterTotalTickets ) * 100;

        System.out.printf("Total tickets: %d\n", counterTotalTickets);
        System.out.printf("%.2f%% student tickets.\n", percentStudentTickets);
        System.out.printf("%.2f%% standard tickets.\n", percentStandardTickets);
        System.out.printf("%.2f%% kids tickets.\n", percentKidTickets);
    }
}
