package loops.nestedloops.exercises;

import java.util.Scanner;

/*Имаме банкноти и монети по 1лв., по 2лв. и по 5лв.
Да се напише програма, която прочита въведените от потребителя брой банкноти и монети и сума,
и извежда на екран всички възможни начини, по които сумата може да се изплати с наличните банкноти.
Вход
Входът се чете от конзолата и съдържа точно 4 реда:
1.	Брой монети по 1лв. - цяло положително число;
2.	Брой монети по 2лв. - цяло положително число;
3.	Брой банкноти по 5лв. - цяло положително число;
4.	Сума - цяло положително число в интервала [1…1000];
Изход
Да се отпечатат на конзолата всички комбинации от дадените номинали, образуващи сумата, форматирани по следния начин:
o	"{бр. 1лв.} * 1 lv. + {бр. 2лв.} * 2 lv. + {бр. 5лв.} * 5 lv. = {сума} lv."*/

public class P10Profit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1coins = Integer.parseInt(scanner.nextLine());
        int num2coins = Integer.parseInt(scanner.nextLine());
        int num5coins = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        int sumFromCoins = 0;
        for (int i = 0; i <= num1coins; i++) {
            for (int j = 0; j <= num2coins; j++) {
                for (int k = 0; k <= num5coins; k++) {
                    sumFromCoins = i + j * 2 + k * 5;
                    if(sumFromCoins == sum){
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sum);
                    }
                }
            }
        }
    }
}
