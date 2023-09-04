package conditionalstatements.advanced.exercises;

import java.util.Scanner;

/*Напишете програма, която да умножава положителни числа по 2.
От конзолата се четат поредица от реални числа, всяко на нов ред, докато не се въведе отрицателно.
След всяко умножено число на нов ред да се отпечата "Result: {резултата от умножението}".
Резултата от умножението да бъде форматиран до втория знак след десетичния разделител.
При получаване на негативно число, на конзолата да се отпечата "Negative number!" и програмата да приключи изпълнение.*/

public class P10MultiplyBy2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        while (num >= 0){
            double currentNum = num * 2;

            System.out.printf("Result: %.2f\n", currentNum);

            num = Double.parseDouble(scanner.nextLine());
        }

        if (num < 0){
            System.out.printf("Negative number!");
        }
    }
}
