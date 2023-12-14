package loops.nestedloops.exercises;

import java.util.Scanner;

/*Напишете програма която проверява всички възможни комбинации от двойка числа в интервала от две дадени числа.
На изхода се отпечатва, коя поред е комбинацията чиито сбор от числата е равен на дадено магическо число.
Ако няма нито една комбинация отговаряща на условието се печата съобщение, че не е намерено.
Вход
Входът се чете от конзолата и се състои от три реда:
•	Първи ред – начало на интервала – цяло число в интервала [1...999]
•	Втори ред – край на интервала – цяло число в интервала [по-голямо от първото число...1000]
•	Трети ред – магическото число – цяло число в интервала [1...10000]
Изход
На конзолата трябва да се отпечата един ред, според резултата:
•	Ако е намерена комбинация чиито сбор на числата е равен на магическото число:
o	"Combination N:{пореден номер} ({първото число} + {второ число} = {магическото число})"
•	Ако не е намерена комбинация отговаряща на условието:
o	"{броят на всички комбинации} combinations - neither equals {магическото число}"
Примерен вход1: 1  10  5
Примерен изход1: Combination N:4 (1 + 4 = 5)
Примерен вход2: 23 24 20
Примерен изход2: 4 combinations - neither equals 20*/

public class P09SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++){
                count++;
                sum = i + j;
                if(sum == magic){
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", count, i, j, magic);
                    return;
                }
            }
        }

        if(sum != magic){
            System.out.printf("%d combinations - neither equals %d%n", count, magic);
        }
    }
}
