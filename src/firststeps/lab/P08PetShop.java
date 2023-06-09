package firststeps.lab;

import java.util.Scanner;

/*Напишете програма, която пресмята нужните разходи за закупуването на храна за кучета и котки.
Храната се пазарува от зоомагазин, като една опаковка храна за кучета е на цена 2.50 лв,
а опаковка храна за котки струва 4 лв.
Вход: От конзолата се четат 2 реда:
1.	Броят на опаковките храна за кучета – цяло число в интервала [0… 100]
2.	Броят на опаковките храна за котки –  цяло число в интервала [0… 100]
Изход: На конзолата се отпечатва: "{крайната сума} lv."*/

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());

        double dogFoodPrice = dogFood * 2.5;
        double catFoodPrice = catFood * 4.0;

        double sum = dogFoodPrice + catFoodPrice;

        System.out.printf(" %.2f lv.", sum);
    }
}
