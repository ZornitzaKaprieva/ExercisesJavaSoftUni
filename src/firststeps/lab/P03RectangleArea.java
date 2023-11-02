package firststeps.lab;

import java.util.Scanner;

/*Да се напише конзолна програма, която въвежда две цели числа (страните на правоъгълника a и b)
и пресмята лицето на правоъгълник с тези страни.
Примерен вход1: 5 7
Примерен изход1: 35
Примерен вход2: 6 8
Примерен изход2: 48*/

public class P03RectangleArea {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int area = a * b;

        System.out.println(area);
    }
}
