package conditionalstatements.lab;

import java.util.Scanner;

/*Да се напише програма, която чете скорост (реално число), въведена от потребителя
и отпечатва информация за скоростта.
•	При скорост до 10 (включително) отпечатайте "slow"
•	При скорост над 10 и до 50 (включително) отпечатайте "average"
•	При скорост над 50 и до 150 (включително) отпечатайте "fast"
•	При скорост над 150 и до 1000 (включително) отпечатайте "ultra fast"
•	При по-висока скорост отпечатайте "extremely fast"
Примерен вход1: 8
Примерен изход1: slow
Примерен вход2: 126
Примерен изход2: fast
Примерен вход3: 160
Примерен изход3: ultra fast*/

public class P06SpeedInfo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double speed = Double.parseDouble(scanner.nextLine());

        if (speed <= 10) {
            System.out.println("slow");
        } else if (speed > 10 && speed <= 50) {
            System.out.println("average");
        } else if (speed > 50 && speed <=150) {
            System.out.println("fast");
        } else if (speed > 150 && speed <= 1000) {
            System.out.println("ultra fast");
        } else {
            System.out.println("extremely fast");
        }
    }
}
