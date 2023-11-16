package conditionalstatements.exercises;

import java.util.Scanner;

/*Марина обича да пътува. Тя има 3 домашни любимеца (куче, котка и костенурка).
Когато заминава на пътешествие трябва да съобрази колко храна да им остави, за да не останат гладни.
Напишете програма, която пресмята колко килограма храна ще изядат всички за времето, в което Марина отсъства и дали оставената храна от нея ще им е достатъчна.
Всяко животно изяжда определено количество храна на ден.
Вход
От конзолата се четат пет реда:
•	Първи ред – брой дни – цяло число в интервал [1…5000]
•	Втори ред – оставена храна в килограми – цяло число в интервал [0…100000]
•	Трети ред – храна на ден за кучето в килограми – реално число в интервал [0.00…100.00]
•	Четвърти ред – храна на ден за котката в килограми– реално число в интервал [0.00…100.00]
•	Пети ред – храна на ден за костенурката в грамове – реално число в интервал [0.00…10000.00]
Изход
На конзолата трябва да се отпечата на един ред:
•	Ако оставената храна Е достатъчна:
o	"{килограма остатък} kilos of food left."
	Резултатът трябва да е закръглен към по-ниското цяло число
•	Ако оставената храна НЕ Е достатъчна:
o	“{килограма недостигат} more kilos of food are needed.”
Примерен вход1: 2  10  1  1  1200
Примерен изход1: 3 kilos of food left.
Примерен вход2: 5  10  2.1  0.8  321
Примерен изход2: 7 more kilos of food are needed.*/

public class P05Pets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodLeftKg  = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDayKg = Double.parseDouble(scanner.nextLine());
        double catFoodPerDayKg = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDayKg = Double.parseDouble(scanner.nextLine()) / 1000;

        double dogFoodNeeded =days * dogFoodPerDayKg;
        double catFoodNeeded =days * catFoodPerDayKg;
        double turtleFoodNeeded =days * turtleFoodPerDayKg;

        double neededFood = dogFoodNeeded + catFoodNeeded + turtleFoodNeeded;

        double diff = Math.abs(foodLeftKg - neededFood);

        if (foodLeftKg >= neededFood){
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));

        }else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));
        }
    }
}
