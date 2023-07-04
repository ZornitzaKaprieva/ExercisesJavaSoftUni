package exampreparation;

import java.util.Scanner;

/*В кутия имаме неопределен брой топки с различни цветове, които ни носят различен брой точки.
Задачата ни е да извадим Х бр. топки, които ще бъдат въведени от конзолата, като се има в предвид, че всеки различен цвят влияе на точките ни по следния начин:
•	Ако топката е “red” точките ни се повишават с 5.
•	Ако топката е “orange” точките ни се повишават с 10.
•	Ако топката е “yellow” точките ни се повишават с 15.
•	Ако топката е “white” точките ни се повишават с 20.
•	Ако топката е “black” точките ни се делят на 2, като закръгляме към по-малкото цяло число.
Ако топката е с какъвто и да е цвят, различен от по-горните, точките не се манипулират и програмата продължава да работи.
Вход:
1.	От конзолата се чете 1 цяло число N, което е броят на топките в диапазон (0-1000).
2.	След това се четат N на брой цветове.
Изход:
Отпечатват се следните редове:
"Total points: {всичките събрани точки}"
"Red balls: {броят червени топки}"
"Orange balls: {броят оранжеви топки}"
"Yellow balls: {броят жълти топки}"
"White balls: {броят бели топки}"
"Other colors picked: {броят на избраните топки извън зададените цветове}"
"Divides from black balls: {броят на пътите, в които точките са били разделяни на 2}"*/

public class Balls {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ballsNum = Integer.parseInt(scanner.nextLine());

        int redCount= 0;
        int orangeCount= 0;
        int yellowCount= 0;
        int whiteCount= 0;
        int blackCount= 0;
        int otherCount= 0;
        int totalPoints = 0;
        for (int i = 1; i <= ballsNum ; i++) {
            String ballColor = scanner.nextLine();

            switch (ballColor){
                case "red":
                    redCount++;
                    totalPoints += 5;
                    break;
                case "orange":
                    orangeCount++;
                    totalPoints += 10;
                    break;
                case "yellow":
                    yellowCount++;
                    totalPoints += 15;
                    break;
                case "white":
                    whiteCount++;
                    totalPoints += 20;
                    break;
                case "black":
                    blackCount++;
                    totalPoints /= 2;
                    break;
                default:
                    otherCount++;
                    break;
            }
        }

        System.out.printf("Total points: %d%n", totalPoints);
        System.out.printf("Red balls: %d%n", redCount);
        System.out.printf("Orange balls: %d%n", orangeCount);
        System.out.printf("Yellow balls: %d%n", yellowCount);
        System.out.printf("White balls: %d%n", whiteCount);
        System.out.printf("Other colors picked: %d%n", otherCount);
        System.out.printf("Divides from black balls: %d%n", blackCount);
    }
}
