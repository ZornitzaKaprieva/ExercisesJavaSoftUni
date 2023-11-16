package conditionalstatements.exercises;

import java.util.Scanner;

/*От лозе с площ X квадратни метри се заделя 40% от реколтата за производство на вино.
От 1 кв.м лозе се изкарват Y килограма грозде. За 1 литър вино са нужни 2,5 кг. грозде.
Желаното количество вино за продан е Z литра.
Напишете програма, която пресмята колко вино може да се произведе и дали това количество е достатъчно.
Ако е достатъчно, остатъкът се разделя по равно между работниците на лозето.
Вход
Входът се чете от конзолата и се състои от точно 4 реда:
•	1ви ред: X кв.м е лозето – цяло число в интервала [10 … 5000]
•	2ри ред: Y грозде за един кв.м – реално число в интервала [0.00 … 10.00]
•	3ти ред: Z нужни литри вино – цяло число в интервала [10 … 600]
•	4ти ред: брой работници – цяло число в интервала [1 … 20]
Изход
На конзолата трябва да се отпечата следното:
•	Ако произведеното вино е по-малко от нужното:
o	“It will be a tough winter! More {недостигащо вино} liters wine needed.”
	Резултатът трябва да е закръглен към по-ниско цяло число
•	Ако произведеното вино е колкото или повече от нужното:
o	“Good harvest this year! Total wine: {общо вино} liters.”
	Резултатът трябва да е закръглен към по-ниско цяло число
o	“{Оставащо вино} liters left -> {вино за 1 работник} liters per person.”
	И двата резултата трябва да са закръглени към по-високото цяло число
Примерен вход1: 650  2  175  3
Примерен изход1:
    Good harvest this year! Total wine: 208 liters.
    33 liters left -> 11 liters per person.
Примерен вход2: 1020 1.5  425  4
Примерен изход2: It will be a tough winter! More 180 liters wine needed.*/

public class P03Harvest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int vineyardSqM = Integer.parseInt(scanner.nextLine());
        double grapesFor1SqM = Double.parseDouble(scanner.nextLine());
        int requiredLitersWine = Integer.parseInt(scanner.nextLine());
        int numWorkers = Integer.parseInt(scanner.nextLine());

        double forVineSqM = vineyardSqM * 0.4;
        double grapesKg = grapesFor1SqM * forVineSqM;
        double vineLitters = grapesKg / 2.5;

        double diff = Math.abs(requiredLitersWine - vineLitters);

        if (requiredLitersWine > vineLitters){
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(diff));
        } else{
            double vinePerWorker = diff / numWorkers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(vineLitters));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(diff), Math.ceil(vinePerWorker));
        }
    }
}
