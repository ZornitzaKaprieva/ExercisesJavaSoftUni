package exampreparation;

import java.util.Scanner;

/*Предстои Великден и едно от най-вълнуващите неща е боядисването на яйца. Наличните цветове за боядисване са:
•	червено (red)
•	оранжев (orange)
•	син (blue)
•	зелен (green)
Напишете програма, която изчислява какъв е броят на яйцата от всеки цвят и от кой цвят яйцата са най - много,
като знаете общия им брой и цвета на всяко яйце.
Вход
От конзолата се чете 1 ред:
•	 Броят на боядисаните яйца – цяло число в интервала [1 ... 100]
За всяко яйце се чете:
o	Цветът на яйцето – текст с възможности: "red", "orange", "blue", "green"
Изход
Да се отпечатат на конзолата 5 реда:
•	"Red eggs: {брой на червените яйца}"
•	"Orange eggs: {брой на оранжевите яйца}"
•	"Blue eggs: {брой на сините яйца}"
•	"Green eggs: {брой на зелените яйца}"
•	"Max eggs: {максимален брой на яйцата от цвят} -> {цвят}"*/

public class EasterEggs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int eggsNum = Integer.parseInt(scanner.nextLine());

        int maxEggsCount = 0;
        String maxEggsColor = "";
        int redCounter = 0;
        int orangeCounter = 0;
        int blueCounter = 0;
        int greenCounter = 0;

        for(int i = 1; i <= eggsNum; i++){
            String eggColor = scanner.nextLine();

            switch (eggColor){
                case "red":
                    redCounter++;

                    if (redCounter > maxEggsCount){
                        maxEggsCount = redCounter;
                        maxEggsColor = "red";
                    } else {
                        maxEggsCount = maxEggsCount;
                        maxEggsColor = maxEggsColor;
                    }
                    break;
                case "orange":
                    orangeCounter++;

                    if (orangeCounter > maxEggsCount){
                        maxEggsCount = orangeCounter;
                        maxEggsColor = "orange";
                    } else {
                        maxEggsCount = maxEggsCount;
                        maxEggsColor = maxEggsColor;
                    }
                    break;
                case "blue":
                    blueCounter++;

                    if (blueCounter > maxEggsCount){
                        maxEggsCount = blueCounter;
                        maxEggsColor = "blue";
                    } else {
                        maxEggsCount = maxEggsCount;
                        maxEggsColor = maxEggsColor;
                    }
                    break;
                case "green":
                    greenCounter++;

                    if (greenCounter > maxEggsCount){
                        maxEggsCount = greenCounter;
                        maxEggsColor = "green";
                    } else {
                        maxEggsCount = maxEggsCount;
                        maxEggsColor = maxEggsColor;
                    }
                    break;
            }
        }

        System.out.printf("Red eggs: %d%n", redCounter);
        System.out.printf("Orange eggs: %d%n", orangeCounter);
        System.out.printf("Blue eggs: %d%n", blueCounter);
        System.out.printf("Green eggs: %d%n", greenCounter);
        System.out.printf("Max eggs: %d -> %s%n", maxEggsCount, maxEggsColor);
    }
}
