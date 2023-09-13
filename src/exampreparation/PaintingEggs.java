package exampreparation;

import java.util.Scanner;

/*С наближаването на Великденските празници, цех за боядисване на яйца, започва да боядисва различни размери яйца, които след това продава на партиди.
В таблицата са показани размерите на яйцата, различните бои и каква е цената за продажба на една партида яйца, зависеща от размерите и цвета боя.
	               Червено (Red)	Зелено (Green)	Жълто (Yellow)
Големи (Large)	        16 лв.	        12 лв.	        9 лв.
Средни (Medium)	        13 лв.	        9 лв.	        7 лв.
Малки (Small)	        9 лв.	        8 лв.	        5 лв.
Напишете програма, която изчислява какви ще са приходите на цеха от продажбите, като знаете размера на яйцата и техният цвят.
С 35% от крайната цена ще бъдат покрити производствени разходи.
Вход
Входът се чете от конзолата и се състои от три реда:
•	Първи ред – размер на яйцата – текст с възможности "Large", "Medium" или "Small"
•	Втори ред – цвят на яйцата – текст  с възможности "Red", "Green" или "Yellow"
•	Трети ред – брой партиди – цяло число в интервала [1… 350]
Изход
На конзолата трябва да се отпечата един ред:
"{крайната цена} leva."
Резултатът да се форматира до втората цифра след десетичния знак.*/

public class PaintingEggs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String eggSize = scanner.nextLine();
        String eggColor = scanner.nextLine();
        int numBatches = Integer.parseInt(scanner.nextLine());

        double priceBatch = 0;

        switch (eggSize){
            case "Large":
                switch (eggColor){
                    case "Red":
                        priceBatch = 16;
                        break;
                    case "Green":
                        priceBatch = 12;
                        break;
                    case "Yellow":
                        priceBatch = 9;
                        break;
                }
                break;
            case "Medium":
                switch (eggColor){
                    case "Red":
                        priceBatch = 13;
                        break;
                    case "Green":
                        priceBatch = 9;
                        break;
                    case "Yellow":
                        priceBatch = 7;
                        break;
                }
                break;
            case "Small":
                switch (eggColor){
                    case "Red":
                        priceBatch = 9;
                        break;
                    case "Green":
                        priceBatch = 8;
                        break;
                    case "Yellow":
                        priceBatch = 5;
                        break;
                }
                break;
        }

        double finalSum = (numBatches * priceBatch) - (numBatches * priceBatch) * 0.35;
        System.out.printf("%.2f leva.%n", finalSum);
    }
}
