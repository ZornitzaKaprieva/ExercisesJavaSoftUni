package nested.loops.lab;

import java.util.Scanner;

/*Напишете програма която проверява всички възможни комбинации от двойка числа в интервала от две дадени числа.
На изхода се отпечатва, коя поред е комбинацията чиито сбор от числата е равен на дадено магическо число.
Ако няма нито една комбинация отговаряща на условието се отпечатва съобщение, че не е намерено.
Вход
Входът се чете от конзолата и се състои от три реда:
•	Първи ред – начало на интервала – цяло число в интервала [1...999]
•	Втори ред – край на интервала – цяло число в интервала [по-голямо от първото число...1000]
•	Трети ред – магическото число – цяло число в интервала [1...10000]
Изход
На конзолата трябва да се отпечата един ред, според резултата:
•	Ако е намерена комбинация чиито сбор на числата е равен на магическото число
o	"Combination N:{пореден номер} ({първото число} + {второ число} = {магическото число})"
•	Ако не е намерена комбинация отговаряща на условието
o	"{броят на всички комбинации} combinations - neither equals {магическото число}"
*/
public class P04SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        boolean isValid = false;
        int counter = 0;
        for (int i = firstNum; i <= secondNum; i++) {
            for (int j = firstNum; j <= secondNum; j++) {
                counter++;

                int sum = i + j;
                if (magicNum == sum){
                    isValid = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)\n", counter, i, j, magicNum);
                    break;
                }
            }
            if (isValid){  // == if (isValid=true ){
                break;
            }
        }

        if (!isValid){
            System.out.printf("%d combinations - neither equals %d\n", counter, magicNum);
        }
    }
}
