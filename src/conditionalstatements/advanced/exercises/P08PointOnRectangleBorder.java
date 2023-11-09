package conditionalstatements.advanced.exercises;

import java.util.Scanner;

/*Напишете програма, която проверява дали точка {x, y} се намира върху някоя от страните на правоъгълник {x1, y1} – {x2, y2}.
Входните данни се четат от конзолата и се състоят от 6 реда въведени от потребителя:
десетичните числа x1, y1, x2, y2, x и y (като се гарантира, че x1 < x2 и y1 < y2).
Да се отпечата "Border" (точката лежи на някоя от страните) или "Inside / Outside" (в противен случай).
Примерен вход1: 2  -3  12  3  8  -1
Примерен изход1: Inside / Outside
Примерен вход2: 2  -3  12  3  12  -1
Примерен изход2: Border*/

public class P08PointOnRectangleBorder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean aLine = x == x1 && y >= y1 && y <= y2;
        boolean bLine = x == x2 && y >= y1 && y <= y2;
        boolean cLine = y == y1 && x >= x1 && x <= x2;
        boolean dLine = y == y2 && x >= x1 && x <= x2;

        if (aLine || bLine || cLine || dLine) {
            System.out.printf("Border");
        } else {
            System.out.printf("Inside / Outside");
        }
    }
}
