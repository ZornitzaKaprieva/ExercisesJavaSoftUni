package loops.forloop.exercises;

import java.util.Scanner;

/*Напишете програма, която да пресмята резултата от игра. Първо получавате число, което показва колко хода ще продължи играта.
После за всеки ход на играта ще получавате по едно ново число. Според интервала в който попада числото се прибавят точки.
Ако числото е отрицателно или по-голямо 50, тогава то е невалидно.
В началото на играта резултата е 0 и на всеки ход се прибавят точки по следният начин:
•	От 0 до 9  20 % от числото
•	От 10 до 19  30 % от числото
•	От 20 до 29  40 % от числото
•	От 30 до 39  50 точки
•	От 40 до 50  100 точки
•	Невалидно число  резултата се дели на 2
Освен резултата програмата трябва да изкарва статистика за проценти числа в дадените интервали.
Вход
Входът се чете от конзолата:
•	Първи ред - колко хода ще има по време на играта – цяло число в интервала [1...100]
•	За всеки ход – числата, които се проверяват в кой интервал са – цели числа в интервала [-100...100]
Изход
Да се отпечата на конзолата 7 реда:
•	1ви ред: "{Краен резултат}"
•	2ри ред: "From 0 to 9: {процент в интервала}%"
•	3ти ред: "From 10 to 19: {процент в интервала}%"
•	4ти ред: "From 20 to 29: {процент в интервала}%"
•	5ти ред: "From 30 to 39: {процент в интервала}%"
•	6ти ред: "From 40 to 50: {процент в интервала}%"
•	7ми ред: "Invalid numbers: {процент в интервала}%"
Всички числа трябва да са форматирана до вторият знак след запетаята.
Примерен вход: 10  43  57  -12  23  12  0  50  40  30  20
Примерен изход:
295.80
From 0 to 9: 10.00%
From 10 to 19: 10.00%
From 20 to 29: 20.00%
From 30 to 39: 10.00%
From 40 to 50: 30.00%
Invalid numbers: 20.00%*/

public class P05GameOfIntervals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int movesNum = Integer.parseInt(scanner.nextLine());
        double moves = movesNum;

        double result = 0;
        int invalidNumCount = 0;
        int from0To9Count = 0;
        int from10To19Count = 0;
        int from20To29Count = 0;
        int from30To39Count = 0;
        int from40To50Count = 0;

        for(int i = 1; i <= moves; i++){
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 0 || num > 50){
                result /= 2;
                invalidNumCount++;
            }

            if (num >= 0 && num <= 9){
                result += num * 0.2;
                from0To9Count++;
            } else if (num >= 10 && num <= 19){
                result += num * 0.3;
                from10To19Count++;
            } else if (num >= 20 && num <= 29){
                result += num * 0.4;
                from20To29Count++;
            } else if (num >= 30 && num <= 39){
                result += 50;
                from30To39Count++;
            } else if (num >= 40 && num <= 50){
                result += 100;
                from40To50Count++;
            }
        }

        double percent0to9 = from0To9Count / moves * 100;
        double percent10to19 = from10To19Count / moves * 100;
        double percent20to29 = from20To29Count / moves * 100;
        double percent30to39 = from30To39Count / moves * 100;
        double percent40to50 = from40To50Count / moves * 100;
        double invalidNum = invalidNumCount / moves * 100;

        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", percent0to9);
        System.out.printf("From 10 to 19: %.2f%%%n", percent10to19);
        System.out.printf("From 20 to 29: %.2f%%%n", percent20to29);
        System.out.printf("From 30 to 39: %.2f%%%n", percent30to39);
        System.out.printf("From 40 to 50: %.2f%%%n", percent40to50);
        System.out.printf("Invalid numbers: %.2f%%%n", invalidNum);
    }
}
