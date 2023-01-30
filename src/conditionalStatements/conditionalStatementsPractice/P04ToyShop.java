package conditionalStatements.conditionalStatementsPractice;

/*Петя има магазин за детски играчки. Тя получава голяма поръчка, която трябва да изпълни.
С парите, които ще спечели иска да отиде на екскурзия.
Цени на играчките:
•	Пъзел - 2.60 лв.
•	Говореща кукла - 3 лв.
•	Плюшено мече - 4.10 лв.
•	Миньон - 8.20 лв.
•	Камионче - 2 лв.
Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена.
От спечелените пари Петя трябва да даде 10% за наема на магазина.
Да се пресметне дали парите ще ѝ стигнат да отиде на екскурзия.

Изход
На конзолата се отпечатва:
•	Ако парите са достатъчни се отпечатва:
o	"Yes! {оставащите пари} lv left."
•	Ако парите НЕ са достатъчни се отпечатва:
o	"Not enough money! {недостигащите пари} lv needed."

Резултатът трябва да се форматира до втория знак след десетичната запетая.

*/

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double trip = Double.parseDouble(scanner.nextLine());
        int puzzleNum = Integer.parseInt(scanner.nextLine());
        int dollNum = Integer.parseInt(scanner.nextLine());
        int bearNum = Integer.parseInt(scanner.nextLine());
        int minionNum = Integer.parseInt(scanner.nextLine());
        int truckNum = Integer.parseInt(scanner.nextLine());
        int numPurchase = puzzleNum + dollNum + bearNum + minionNum + truckNum;

        double puzzlePrice = puzzleNum * 2.60;
        double dollPrice = dollNum * 3.00;
        double bearPrice = bearNum * 4.10;
        double minionPrice = minionNum * 8.20;
        double truckPrice = truckNum * 2.00;
        double sumPrice = puzzlePrice + dollPrice + bearPrice + minionPrice + truckPrice;
            if (numPurchase >= 50) {
                 sumPrice = sumPrice - (sumPrice * 0.25);
             }

        double profitWithRent = sumPrice - (sumPrice * 0.1);
        double enoughMoney = profitWithRent - trip;
        double neededMoney =  trip - profitWithRent;


                if (trip <= profitWithRent) {
                    System.out.printf("Yes! %.2f lv left.", enoughMoney);
                } else {
                    System.out.printf("Not enough money! %.2f lv needed.", neededMoney);
                }
        }
    }


