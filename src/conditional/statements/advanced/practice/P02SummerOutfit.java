package conditional.statements.advanced.practice;

import java.util.Scanner;

/*Лято е с много променливо време и Виктор има нужда от вашата помощ.
Напишете програма която спрямо времето от денонощието и градусите да препоръча на Виктор какви дрехи да си облече.
Вашия приятел има различни планове за всеки етап от деня, които изискват и различен външен вид,
тях може да видите от таблицата.

От конзолата се четат точно два реда:
•	Градусите - цяло число в интервала [10…42]
•	Текст, време от денонощието - с възможности - "Morning", "Afternoon", "Evening"

Време от денонощието / градуси      Morning               Afternoon            Evening
10 <= градуси <= 18     	    Outfit = Sweatshirt     Outfit = Shirt      Outfit = Shirt
                                Shoes = Sneakers        Shoes = Moccasins   Shoes = Moccasins
18 < градуси <= 24              Outfit = Shirt          Outfit = T-Shirt    Outfit = Shirt
                                Shoes = Moccasins       Shoes = Sandals     Shoes = Moccasins
градуси >= 25                   Outfit = T-Shirt        Outfit = Swim Suit  Outfit = Shirt
                                Shoes = Sandals         Shoes = Barefoot    Shoes = Moccasins

Да се отпечата на конзолата на един ред: "It's {градуси} degrees, get your {облекло} and {обувки}."
*/
public class P02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine()); //10-42
        String timeOfDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (timeOfDay.equals("Morning")) {
            if (degrees >= 10 && degrees <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (degrees > 18 && degrees <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degrees >= 25 && degrees <=42) {
                outfit = "T-Shirt";
                shoes = "Sandals";

            }
        } else if (timeOfDay.equals("Afternoon")) {
            if (degrees >= 10 && degrees <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degrees > 18 && degrees <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (degrees >= 25) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        } else if (timeOfDay.equals("Evening")) {
            outfit = "Shirt";
            shoes = "Moccasins";
        }

        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);




    }
}
