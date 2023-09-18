package exampreparation;

import java.util.Scanner;

/*Времето се затопля и туристи, започват да си правят разходки високо в планината, където все още има сняг,
като за целта те трябва да закупят нужната туристическа екипировка.
Вашата задача е да напишете програма, която да изчислява, стойността на екипировката,
както и дали определения бюджет е достатъчен или не, като се знае, че в магазина има следната промоция:
Всеки трети продукт е на половин цена.
Вход
От конзолата се чете:
•	На първи ред – бюджетът - реално число в интервала [1.00… 100000.00]
•	След това поредица от два реда (до получаване на команда "Stop" или при заявка за купуване на продукт, чиято стойност е по-висока от наличния бюджет) :
o	Име на продукта – текст
o	Цена на продукта – реално число в интервала [1.00… 5000.00]
Изход
На конзолата да се отпечатат следните редове според случая:
•	При получаване на командата "Stop", на един ред:
o	"You bought {брой на закупените продукти} products for {цена на покупките} leva."
•	При заявка за покупка на продукт, чиято цена е по-висока от останалите пари, на два реда:
o	"You don't have enough money!"
o	"You need {недостигащи пари} leva!"*/

public class TouristShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        boolean isFinish = false;

        int productCount = 0;
        double sum = 0;
        while (!command.equals("Stop")){
            String product = command;
            double price = Double.parseDouble(scanner.nextLine());

            productCount++;
            if (productCount % 3 == 0){
                price = price * 0.5;
            }

            sum += price;
            if (budget < sum ){
                isFinish = true;
                break;
            }

            command = scanner.nextLine();
        }

        if(!isFinish){
            System.out.printf("You bought %d products for %.2f leva.", productCount, sum);
        } else{
            double diff = Math.abs(budget - sum);
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", diff);
        }
    }
}
