package exampreparation;

import java.util.Scanner;

/*Трябва да напишете програма, която чете три цели числа  a1, a2, n, въведени от потребителя
и генерира номера за билети, които се състоят от следните 4 символа:
•	Символ 1: символ с ASCII код от а1 до а2 - 1
•	Символ 2: цифра от 1 до n - 1
•	Символ 3: цифра от 1 до n / 2 - 1
•	Символ 4: цифрова репрезентация (ASCII код) на символ 1
След като са изпълнени условията, се генерира следният билет:
"{Символ 1}-{Символ 2}{Символ 3}{Символ  4}"
Вход
•	a1 – цяло число в интервала [65… 89]
•	a2 – цяло число в интервала [66… 91]
•	n – цяло число в интервала [1… 10]
Изход
На конзолата трябва да се отпечатат всички билетни номера,
на които числовата репрезентация на символ 1 е нечетна и сборът на символ 2, символ 3 и символ 4 е нечетен.*/

public class MovieTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int symbol1 = a1; symbol1 <= a2 - 1; symbol1++){
           if(symbol1 % 2 != 0){
               for(int symbol2 = 1; symbol2 <= n - 1; symbol2++){
                   for(int symbol3 = 1; symbol3 <= n / 2 - 1; symbol3++){
                       for (int symbol4 = a1; symbol4 <= a2 - 1; symbol4++){
                           if (symbol4 == symbol1) {
                               if((symbol2 + symbol3 + symbol4) % 2 != 0){
                                   char asciiSymbol = (char) symbol1;
                                   System.out.printf("%s-%d%d%d%n", asciiSymbol, symbol2, symbol3, symbol4);
                               }
                           }
                       }
                   }
               }
           }
        }
    }
}


