package exampreparation;

import java.util.Scanner;

/*Преподавателският екип на СофтУни организира работен ден на басейн по случай настъпването на лятото.
Вашата задача е да напишете програма, която да изчислява каква сума трябва да се заплати.
За всеки един човек от екипа трябва да се заплати такса вход.
Трябва да имате предвид, че един чадър стига за двама души. Знае се, че само 75% от екипа искат шезлонги.
При изчислението на броя на чадърите и шезлонгите, техният брой да се закръгли до по-голямото цяло число.
Вход
От конзолата се четат 4 числа:
•	Първи ред – брой на хората. Цяло число в интервала [1…100]
•	Втори ред – такса вход. Реално число в интервала [0.00…50.00]
•	Трети ред – цена един за шезлонг. Реално число в интервала [0.00…50.00]
•	Четвърти ред – цена за един чадър. Реално число в интервала [0.00...50.00]
Изход
"{сумата за покриване на разходите} lv."
Резултатът да се форматира до втората цифра след десетичния знак.*/

public class PoolDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        double entranceFee = Double.parseDouble(scanner.nextLine());
        double price1LoungeChair = Double.parseDouble(scanner.nextLine());
        double price1Umbrella = Double.parseDouble(scanner.nextLine());

        double entranceAllPeople = numberOfPeople * entranceFee;
        double priceAllUmbrella = Math.ceil(numberOfPeople/2.0) * price1Umbrella;
        double priceAllLoungeChair = Math.ceil(numberOfPeople * 0.75) * price1LoungeChair;

        double amountToCoverExpenses = entranceAllPeople + priceAllUmbrella + priceAllLoungeChair;
        System.out.printf("%.2f lv.", amountToCoverExpenses);
    }
}
