package exampreparation;

import java.util.Scanner;

/*Времето се затопля и клубовете пускат обещаващи промоции.
Напише програма, която да изчислява приходите на един клуб за вечерта и дали е достигната желаната печалба, като знаете следните условия:
цената на един коктейл е дължината неговото име.
Ако цената на една поръчка е нечетно число, има 25% отстъпка от цената на поръчката.
Вход
От конзолата се четат:
•	На първия ред – желаната печалба на клуба - реално число в интервала [1.00... 15000.00]
Поредица от два реда до получаване на командата "Party!" или до достигане на желаната печалба:
o	Име на коктейла – текст
o	Брой на коктейлите за поръчката – цяло число в интервала [1… 50]
Изход
На конзолата първо да се отпечата един ред:
•	При получена команда "Party!":
 "We need {недостигаща сума} leva more."
•	При достигане на желаната печалба:
	"Target acquired."
След това да се отпечата:
	"Club income - {приходи от клуба} leva."
Парите да бъдат форматирани до втората цифра след десетичния знак.
*/
public class Club {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double desiredProfit = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        double overallProfit = 0.0;

        while (!input.equals("Party!")){
            String cocktailName = input;
            int cocktailsCount = Integer.parseInt(scanner.nextLine());

            double cocktailPrice = cocktailName.length();

            double priceForParticulaCocktails = cocktailPrice * cocktailsCount;

                if (!(priceForParticulaCocktails % 2 == 0)){
                    priceForParticulaCocktails = priceForParticulaCocktails * 0.75;
                }

                overallProfit += priceForParticulaCocktails;

            if (overallProfit >= desiredProfit){
                break;
            }

                input = scanner.nextLine();
        }


        if (desiredProfit > overallProfit ){
            double moneyNeeded = desiredProfit - overallProfit;
            System.out.printf("We need %.2f leva more.\n", moneyNeeded);
        } else {
            System.out.println("Target acquired.");
        }

        System.out.printf("Club income - %.2f leva.", overallProfit);
    }
}

