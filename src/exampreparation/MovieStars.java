package exampreparation;

import java.util.Scanner;

/*Счетоводителят на киноцентър "Тинтява 15" ви наема да напишете програма, която пресмята хонорарите за актьорите.
Всяка продукция има бюджет за актьори. До команда "ACTION" ще получавате име на актьор и възнаграждението му.
Ако името на актьора е по-дълго от 15 символа възнаграждението му ще е 20% от останалия бюджет до момента.
Ако бюджетът в даден момент свърши, програмата трябва да прекъсне.
Вход
От конзолата първо се чете един ред:
•	Бюджет за актьори - реално число в интервала [1000.0... 2 100 000.0]
След това се четат многократно по един или два реда до команда "ACTION" или до изчерпване на бюджета:
•	Име на актьор - текст
Ако името на актьора съдържа по-малко или равно на 15 брой символи:
o	Възнаграждение - реално число в интервала [250.0… 1 000 000.0]
Изход
На конзолата да се отпечата един ред:
•	Ако бюджетът е достатъчен :
             "We are left with {останал бюджет} leva."
•	Ако бюджетът не е достатъчен:
	"We need {необходим бюджет} leva for our actors."
Резултатът да се форматира до втората цифра след десетичния знак!*/

public class MovieStars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        boolean isFinish = false;

        while (!command.equals("ACTION")){
            String name = command;

            if (name.length() <= 15){
                double payment = Double.parseDouble(scanner.nextLine());
                budget -= payment;
            } else {
                budget -= budget * 0.2;
            }

            if (budget <= 0){
                isFinish = true;
                break;
            }

            command = scanner.nextLine();
        }

        double diff = Math.abs(budget);
        if (!isFinish){
            System.out.printf("We are left with %.2f leva.", diff);
        } else {
            System.out.printf("We need %.2f leva for our actors.", diff);
        }
    }
}
