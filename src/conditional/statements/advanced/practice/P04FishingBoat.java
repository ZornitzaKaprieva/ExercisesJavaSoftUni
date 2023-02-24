package conditional.statements.advanced.practice;

import java.util.Scanner;

/*Тони и приятели много обичали да ходят за риба,
те са толкова запалени по риболова, че решават да отидат на риболов с кораб.
Цената за наема на кораба зависи от сезона и броя рибари.
Цената зависи от сезона:
•	Цената за наем на кораба през пролетта е  3000 лв.
•	Цената за наем на кораба през лятото и есента е  4200 лв.
•	Цената за наем на кораба през зимата е  2600 лв.
В зависимост от броя си групата ползва отстъпка:
•	Ако групата е до 6 човека включително  –  отстъпка от 10%.
•	Ако групата е от 7 до 11 човека включително  –  отстъпка от 15%.
•	Ако групата е от 12 нагоре  –  отстъпка от 25%.
Рибарите ползват допълнително 5% отстъпка ако са четен брой освен ако не е есен - тогава нямат допълнителна отстъпка.
Напишете програма, която да пресмята дали рибарите ще съберат достатъчно пари.
Вход
От конзолата се четат точно три реда.
•	Бюджет на групата – цяло число в интервала [1…8000]
•	Сезон –  текст : "Spring", "Summer", "Autumn", "Winter"
•	Брой рибари – цяло число в интервала [4…18]
Изход
Да се отпечата на конзолата един ред:
•	Ако бюджетът е достатъчен:
"Yes! You have {останалите пари} leva left."
•	Ако бюджетът НЕ Е достатъчен:
"Not enough money! You need {сумата, която не достига} leva."
Сумите трябва да са форматирани с точност до два знака след десетичната запетая.
Примерен вход и изход
*/
public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupBudget = Integer.parseInt(scanner.nextLine()); //[1…8000]
        String season = scanner.nextLine(); //"Spring", "Summer", "Autumn", "Winter"
        int numberOfFishermen  = Integer.parseInt(scanner.nextLine()); //4-18

        boolean isValidBudget = groupBudget >= 1 && groupBudget <= 8000;
        boolean isValidNumberOfFishermen = numberOfFishermen >= 4 && numberOfFishermen <= 18;
        double seasonRent = 0;
        double groupDiscount = 0;

        switch (season){

            case "Spring":
                seasonRent = 3000;
                
                    if (numberOfFishermen <= 6) {
                        groupDiscount = seasonRent * 0.1;
                    } else if (numberOfFishermen > 6 && numberOfFishermen <= 11) {
                        groupDiscount = seasonRent * 0.15;
                    }else if (numberOfFishermen > 12 && numberOfFishermen <= 18) {
                        groupDiscount = seasonRent * 0.25;
                    }
                break;

            case "Summer":
            case "Autumn":
                seasonRent = 4200;

                if (numberOfFishermen <= 6) {
                    groupDiscount = seasonRent * 0.1;
                } else if (numberOfFishermen > 6 && numberOfFishermen <= 11) {
                    groupDiscount = seasonRent * 0.15;
                }else if (numberOfFishermen > 12 && numberOfFishermen <= 18) {
                    groupDiscount = seasonRent * 0.25;
                }
                break;

            case "Winter":
                seasonRent = 2600;

                if (numberOfFishermen <= 6) {
                    groupDiscount = seasonRent * 0.1;
                } else if (numberOfFishermen > 6 && numberOfFishermen <= 11) {
                    groupDiscount = seasonRent * 0.15;
                }else if (numberOfFishermen > 12 && numberOfFishermen <= 18) {
                    groupDiscount = seasonRent * 0.25;
                }
                break;
        }

        double rentalPrice = seasonRent - groupDiscount;

        if (numberOfFishermen % 2 == 0 && !season.equals("Autumn")) {
            rentalPrice = rentalPrice * 0.95;
        }

        if (groupBudget >= rentalPrice && isValidBudget && isValidNumberOfFishermen) {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(rentalPrice - groupBudget));
        } else if (groupBudget < rentalPrice && isValidBudget && isValidNumberOfFishermen){
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(rentalPrice - groupBudget));
        }
    }
}
