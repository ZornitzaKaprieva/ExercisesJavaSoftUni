package firststeps.exercises;

import java.util.Scanner;

/*Напишете програма, която чете градуси по скалата на Целзий (°C) и ги преобразува до градуси по скалата на Фаренхайт (°F).
Потърсете в Интернет подходяща формула, с която да извършите изчисленията.
Форматирате изхода до втория знак след десетичната запетая.*/

public class P03CelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double celsius  = Double.parseDouble(scanner.nextLine());
        double fahrenheit = celsius * 1.8 + 32;

        System.out.printf("%.2f", fahrenheit);
    }
}

