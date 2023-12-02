package loops.nestedloops.exercises;

import java.util.Scanner;

/*Ани се страхува от това, да не й бъде хакнат някой от профилите в социалните мрежи,
затова решава да направи генератор за пароли, които да бъдат достатъчно сигурни.
Вашата задача е да й помогнете да напише програма, която ще генерира тези пароли,
разделени една от друга от знака "|".
Да се напише програма, която генерира серия от символи като в шаблона: ABxyBA
като при всяко генериране на нов код, стойностите на символите се увеличават с 1.
Ако A надхвърли 55, се връща на 35. Ако B надхвърли 96, се връща на 64.
Вход
От конзолата се чете 1 ред:
•	На първия ред a – цяло число в интервала [1 … 1000]
•	На втория ред b – цяло число в интервала [1 … 1000]
•	На третия ред максимален брой генерирани пароли – цяло число в интервала [1 … 1000000]
Ограничения:
•	A е символ с ASCII стойност в диапазона [35… 55]
•	B е символ с ASCII стойност в диапазона [64 … 96]
•	x e цяло число в диапазона [1… a]
•	y e цяло число в диапазона [1… b]
Примерен вход1: 2  3  10
Примерен изход1: #@11@#|$A12A$|%B13B%|&C21C&|'D22D'|(E23E(|
Примерен вход2: 20  50  10
Примерен изход2:#@11@#|$A12A$|%B13B%|&C14C&|'D15D'|(E16E(|)F17F)|*G18G*|+H19H+|,I110I,|*/

public class P07SafePasswordsGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxGeneratedPass = Integer.parseInt(scanner.nextLine());
        int passCount = 0;
        int firstSymbolA = 35;
        int secondSymbolB = 64;
        boolean isLimit = false;

        for (int thirdSymbolX = 1; thirdSymbolX <= a; thirdSymbolX++) {
            for (int forthSymbolY = 1; forthSymbolY <= b; forthSymbolY++) {

                if (firstSymbolA > 55) {
                    firstSymbolA = 35;
                }
                if (secondSymbolB > 96) {
                    secondSymbolB = 64;
                }

                if (passCount >= maxGeneratedPass) {
                    isLimit = true;
                    break;
                }

                passCount++;

                System.out.printf("%c%c%d%d%c%c|", firstSymbolA, secondSymbolB, thirdSymbolX, forthSymbolY, secondSymbolB,firstSymbolA);

                firstSymbolA++;
                secondSymbolB++;
            }
            if (isLimit) {
                break;
            }
        }
    }
}
