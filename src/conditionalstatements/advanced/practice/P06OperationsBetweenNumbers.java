package conditionalstatements.advanced.practice;

import java.util.Scanner;

/*Напишете програма, която чете две цели числа (N1 и N2)
и оператор, с който да се извърши дадена математическа операция с тях.
Възможните операции са: Събиране (+), Изваждане (-), Умножение (*), Деление (/) и Деление с остатък (%).
При събиране, изваждане и умножение на конзолата трябва да се отпечата резултатът и дали той е четен или нечетен.
При обикновеното деление – резултатът.
При модулното деление – остатъка.
Трябва да се има предвид, че делителят може да е равен на 0(нула), а на нула не се дели.
В този случай трябва да се отпечата специално съобщениe.
Вход
От конзолата се прочитат 3 реда, въведени от потребителя:
•	N1 – цяло число в интервала [0...40 000]
•	N2 – цяло число в интервала [0...40 000]
•	Оператор – един символ измеду: "+", "-", "*", "/", "%"
Изход
Да се отпечата на конзолата един ред:
•	Ако операцията е събиране, изваждане или умножение:
o	 "{N1} {оператор} {N2} = {резултат} – {even/odd}"
•	Ако операцията е деление:
o	"{N1} / {N2} = {резултат}" – резултатът е форматиран до вторият знак след дес.запетая
•	Ако операцията е деление с остатък:
o	"{N1} % {N2} = {остатък}"
•	В случай на деление с 0 (нула):
o	"Cannot divide {N1} by zero"
*/
public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine()); //[0...40 000]
        int number2 = Integer.parseInt(scanner.nextLine()); //[0...40 000]
        String operator = scanner.nextLine();//"+", "-", "*", "/", "%"

        double result = 0;

        if (operator.equals("+") && !(number2 ==0)) {
            result = number1 + number2;
        } else if (operator.equals("-") && !(number2 ==0)) {
            result = number1 - number2;
        } else if (operator.equals("*") && !(number2 ==0)) {
            result = number1 * number2;
        } else if (operator.equals("/") && !(number2 ==0)) {
            result = number1 / (number2 * 1.0);
        } else if (operator.equals("%") && !(number2 ==0)) {
            result = number1 % number2;
        }

        switch (operator) {
            case "+":
            case "-":
            case "*":
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %.0f - even\n", number1, operator, number2, result);
                } else {
                    System.out.printf("%d %s %d = %.0f - odd\n", number1, operator, number2, result);
                }
                break;

            case "/":
                if (!(number2 == 0)) {
                    System.out.printf("%d %s %d = %.2f", number1, operator, number2, result);
                } else {
                    System.out.printf("Cannot divide %d by zero\n", number1);
                }
                break;

            case "%":
                if (!(number2 == 0)) {
                    System.out.printf("%d %s %d = %.0f", number1, operator, number2, result);
                } else {
                    System.out.printf("Cannot divide %d by zero\n", number1);
                }
                break;
        }
    }
}