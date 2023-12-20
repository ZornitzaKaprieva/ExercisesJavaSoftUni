package loops.nestedloops.practice;

import java.util.Scanner;

/*Напишете програма, която чете от конзолата цели числа в диапазона, докато не се получи команда "stop".
Да се намери сумата на всички въведени прости и сумата на всички въведени непрости числа.
Тъй като по дефиниция от математиката отрицателните числа не могат да бъдат прости,
ако на входа се подаде отрицателно число да се изведе следното съобщение "Number is negative.".
В този случай въведено число се игнорира и не се прибавя към нито една от двете суми,
а програмата продължава своето изпълнение, очаквайки въвеждане на следващо число.
На изхода да се отпечатат на два реда двете намерени суми в следния формат:
•	"Sum of all prime numbers is: {prime numbers sum}"
•	"Sum of all non prime numbers is: {nonprime numbers sum}"
Примерен вход1: 3  9  0  7  19  4  stop
Примерен изход1:
    Sum of all prime numbers is: 29
    Sum of all non prime numbers is: 13
Примерен вход2:30  83  33  -1  20  stop
Примерен изход2:
    Number is negative.
    Sum of all prime numbers is: 83
    Sum of all non prime numbers is: 83*/

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); // numbers + stop

        int sumPrimeNumbers = 0;
        int sumNonPrimeNumbers = 0;

        while (!input.equals("stop")){
            int currentNumber = Integer.parseInt(input);
            boolean isPrime = true;
            if (currentNumber < 0){
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue; //не прекратяваме целия цикъл както с break;, а само тази итерация
            }

            //откриваме кои числа не са прости (те са делят не само на едно или на себе си => тези стойности не ги включваме)
            for (int thisCurrentNum = 2; thisCurrentNum <= (currentNumber-1); thisCurrentNum++) {
                if (currentNumber % thisCurrentNum == 0){
                    isPrime = false;
                    sumNonPrimeNumbers += currentNumber;
                    break;
                }
            }

            if (isPrime){
                sumPrimeNumbers += currentNumber;
            }

            input = scanner.nextLine(); // да не го забравим, за да можем да прочетем следващите числа
        }

        System.out.printf("Sum of all prime numbers is: %d\n" +
                "Sum of all non prime numbers is: %d\n",
                sumPrimeNumbers, sumNonPrimeNumbers);
    }
}
