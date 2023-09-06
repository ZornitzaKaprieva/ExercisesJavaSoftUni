package loops.nestedloops.exercises;

import java.util.Scanner;

/*Напишете програма, която генерира и принтира на конзолата четирицифрени числа,
в които първата и втората двойка цифри образуват двуцифрени прости числа (пример за такова число 1723).
Крайната стойност, до която трябва да се генерират двойките, се определя от други 2 цифри, подадени като вход,
които определят с колко крайната стойност е по-голяма от началната.
Вход
От конзолата се четат четири реда:
•	На първия ред – началната стойност на първата двойка числа – цяло положително число в диапазона [10… 90]
•	На втория ред – началната стойност на втората двойка числа – цяло положително число в диапазона [10… 90]
•	На третия ред – разликата между началната и крайната стойност на  първата двойка числа – цяло положително число в диапазона [1… 9]
•	На четвъртия ред – разликата между началната и крайната стойност на  втората двойка числа – цяло положително число в диапазона [1… 9]
Изход:
Да се отпечатат на конзолата четирицифрените числа, в които първите две и вторите две цифри са прости двуцифрени числа.*/

public class P13PrimePairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingValueFirst2 = Integer.parseInt(scanner.nextLine());
        int startingValueSecond2 = Integer.parseInt(scanner.nextLine());
        int differenceFirst2 = Integer.parseInt(scanner.nextLine());
        int differenceSecond2 = Integer.parseInt(scanner.nextLine());

        for (int first2 = startingValueFirst2; first2 <= startingValueFirst2 + differenceFirst2; first2++) {
                if (first2 % 2 != 0 && first2 % 3 != 0 && first2 % 5 != 0 && first2 % 7 != 0) {
                    for (int second2 = startingValueSecond2; second2 <= startingValueSecond2 + differenceSecond2; second2++) {
                            if (second2 % 2 != 0 && second2 % 3 != 0 && second2 % 5 != 0 && second2 % 7 != 0) {
                                System.out.printf("%d%d%n", first2, second2);
                            }
                        }
                    }
                }
            }
        }


