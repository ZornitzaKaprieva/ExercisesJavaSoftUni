package loops.nestedloops.exercises;

import java.util.Scanner;

/*Прапраправнукът на Сали Яшар е получил наследство - сейф с парола - четири цифри.
В него е заключена тайната на пеещите каруци.
Той има автосервиз и се нуждае от реклама, затова е решил да направи такава каруца.
Проблемът е, че паролата е скрита в следната задача:
„Парола ще получиш, ако знаеш  едно цяло число, контролна стойност се нарича то,
почива в интервала от 4 до 144 включително, но да го откриеш може би ще е мъчително. ”
Паролата има формат: "abcd" и контролната стойност трябва да е равна на  a*b + c*d ,
но трябва да бъдат спазени следните условия:
•	при намирането на а и b: a < b
•	при намиране на  c и d: c > d
•	a, b, c и d са числа в интервала [1 - 9]
Каруцата  има четири колела, затова паролата ще е четвърто число, което трябва да се отпечата.
В случай, че НЕ се намери такова число,  отпечатва се „No!“.
Вход
От конзолата се чете едно цяло число (контролната стойност): M – цяло число в интервала [4 … 144];
Изход
Отпечатването на конзолата зависи от резултата:
•	Ако са намерени четворки числа (аbcd), отговарящи на условието, ги отпечатваме всичките с разделител интервал: “{а}{b}{c}{d} ”
•	Отпечатва се един от двата реда на нов ред:
•	Ако съществува четвърта четворка се отпечатва: „Password: {а}{b}{c}{d}“
•	Ако НЕ са намерени такива числа или няма  четвърта четворка отпечатваме: “No!”*/

public class P12TheSongOfTheWheels {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int controlValue = Integer.parseInt(scanner.nextLine());

        int combinationsCount = 0;
        String password = "";
        String sumCombinations = "";
        int sum = 0;
        if (controlValue >= 4 && controlValue <= 144) {
            for (int a = 1; a <= 9; a++) {
                for (int b = 1; b <= 9; b++) {
                    for (int c = 1; c <= 9; c++) {
                        for (int d = 1; d <= 9; d++) {
                            sum = a * b + c * d;
                            if (a < b && c > d && sum == controlValue) {
                                combinationsCount++;
                                sumCombinations += "" + a + b + c + d + " ";

                                if (combinationsCount == 4) {
                                    password = "" + a + b + c + d;
                                }
                            }
                        }
                    }
                }
            }

            System.out.printf("%s %n", sumCombinations);

            if (combinationsCount >= 4) {
                System.out.printf("Password: %s%n", password);
            } else {
                System.out.println("No!");
            }
        }
    }
}