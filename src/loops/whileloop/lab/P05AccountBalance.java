package loops.whileloop.lab;

import java.util.Scanner;

/*Напишете програма, която пресмята колко общо пари има в сметката, след като направите определен брой вноски.
На всеки ред ще получавате сумата, която трябва да внесете в сметката, до получаване на команда  "NoMoreMoney ".
При всяка получена сума на конзолата трябва да се извежда "Increase: " + сумата и тя да се прибавя в сметката.
Ако получите число по-малко от 0 на конзолата трябва да се изведе "Invalid operation!"  и програмата да приключи.
Когато програмата приключи трябва да се принтира "Total: " + общата сума в сметката форматирана до втория знак след десетичната запетая. */
public class P05AccountBalance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //5.5; NoMoreMoney

        double sum = 0;

        while (!input.equals("NoMoreMoney")) {

            double amount = Double.parseDouble(input); // така преобразуваме стринг на дабъл

            if (amount < 0) {
                System.out.println("Invalid operation!\n");
                break; // дотук прекратявам, ако е отрицателно число
            }

            sum = sum + amount; // събираме въведените числа

            System.out.printf("Increase: %.2f\n", amount); //сумата, която се прибавя в сметката.
            input = scanner.nextLine();  //продължаваме да въвеждаме сума, докато не се въведе NoMoreMoney
        }

        System.out.printf("Total: %.2f\n", sum); //принтираме сумата
    }
}
