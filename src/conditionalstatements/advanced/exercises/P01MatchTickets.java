package conditionalstatements.advanced.exercises;

import java.util.Scanner;

/*Когато пуснали билетите за Евро 2016, група запалянковци решили да си закупят. Билетите имат две категории с различни цени:
•	IP – 499.99 лева.
•	Normal – 249.99 лева.
Запалянковците имат определен бюджет, а броят на хората в групата определя какъв процент от бюджета трябва да се задели за транспоОт 1 до 4 – 75% от бюджета.
•	От 5 до 9 – 60% от бюджета.
•	От 10 до 24 – 50% от бюджета.
•	От 25 до 49 – 40% от бюджета.
•	50 или повече – 25% от бюджета.
Напишете програма, която да пресмята дали с останалите пари от бюджета могат да си купят билети за избраната категория. И колко пари ще им останат или ще са им нужни.
Вход
Входът се чете от конзолата и съдържа точно 3 реда:
•	На първия ред е бюджетът – реално число в интервала [1 000.00 ... 1 000 000.00]
•	На втория ред е категорията – "VIP" или "Normal"
•	На третия ред е броят на хората в групата – цяло число в интервала [1 ... 200]
Изход
Да се отпечата на конзолата един ред:
•	Ако бюджетът е достатъчен:
o	"Yes! You have {останалите пари на групата} leva left."
•	Ако бюджетът НЕ Е достатъчен:
o	"Not enough money! You need {сумата, която не достига} leva."
Сумите трябва да са форматирани с точност до два знака след десетичната запетая.
Примерен вход1: 1000  Normal  1
Примерен изход1: Yes! You have 0.01 leva left.
Примерен вход2: 30000  VIP  49
Примерен изход2: Not enough money! You need 6499.51 leva.*/

public class P01MatchTickets {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String cat = scanner.nextLine(); //"VIP" или "Normal"
        int numberPeople = Integer.parseInt(scanner.nextLine());

        double overallTicketPrice = 0; //switch
        double priceTransport = 0;    // if

        //STEP1:
        switch (cat){
            case "VIP":
                overallTicketPrice = numberPeople * 499.99;
                break;
            case "Normal":
                overallTicketPrice = numberPeople * 249.99;
        }

        //STEP2:
        if (numberPeople >=1 && numberPeople <= 4) {
             priceTransport = budget * 0.75; 
        } else if (numberPeople >=5 && numberPeople <= 9) {
            priceTransport = budget * 0.6;
        }else if (numberPeople >=10 && numberPeople <= 24) {
            priceTransport = budget * 0.5;
        }else if (numberPeople >=25 && numberPeople <= 49) {
            priceTransport = budget * 0.4;
        }else if (numberPeople > 49) {
            priceTransport = budget * 0.25;
        }

        //STEP3:
        double overallExpenses = overallTicketPrice + priceTransport;
        double sumLeft = Math.abs(budget - overallExpenses);

        if (budget >= overallExpenses) {
            System.out.printf("Yes! You have %.2f leva left.\n", sumLeft);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.\n", sumLeft);
        }
    }
}
