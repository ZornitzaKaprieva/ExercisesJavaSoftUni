package firststeps.exercises;

import java.util.Scanner;

/*Напишете програма, която чете от конзолата страна и височина на триъгълник и пресмята неговото лице.
Използвайте формулата за лице на триъгълник: area = a * h / 2.
Форматирате изхода до втория знак след десетичната запетая.
Примерен вход1: 20 30
Примерен изход1: 300.00
Примерен вход2: 1.23456 4.56789
Примерен изход2: 2.82*/

public class P02TriangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double area = a * h / 2;

        System.out.printf("%.2f", area);
    }
}

