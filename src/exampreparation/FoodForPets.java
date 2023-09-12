package exampreparation;

import java.util.Scanner;

/*Ани има два домашни любимеца - куче и котка.
Напишете програма, която изготвя статистика за храната на домашните любимци за определен брой дни.
Всеки ден кучето и котката изяждат различно количество от общата им храна.
На всеки трети ден получават награда - бисквитки.
Количеството на бисквитките е 10% от общо изядената храна за деня.
Вашата програма трябва да отпечатва статистика за количеството бисквитки, които са изяли,
колко процента от първоначалното количество обща храна са изяли
и колко процента от изядената храна е изяло кучето и колко е изяла котката.
Вход
Първоначално се чете един ред:
•	Брой дни – цяло число в диапазона [1…30]
•	Общо количество храна – реално число в диапазона [0.00…10000.00]
След това за всеки ден се чете:
o	Количество изядена храна от кучето – цяло число в диапазона [10…500]
o	Количество изядена храна от котката – цяло число в диапазона [10…500]
Изход
На конзолата да се отпечатват четири реда:
•	"Total eaten biscuits: {количество изядени бисквитки}gr."
•	"{процент изядена храна}% of the food has been eaten."
•	"{процент изядена храна от кучето}% eaten from the dog."
•	"{процент изядена храна от котката}% eaten from the cat."
Количеството изядени бисквитки трябва да бъде закръглено до най – близкото цяло число, а процентът храна трябва да бъде форматиран до втората цифра след десетичния знак.*/

public class FoodForPets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());

        int eatenFood = 0;
        int eatenDogFood = 0;
        int eatenCatFood = 0;
        int daysCount = 0;
        double eatenBiscuits = 0;
        for (int i = 1; i <= days; i++) {
            int foodEatenByDog = Integer.parseInt(scanner.nextLine());
            int foodEatenByCat = Integer.parseInt(scanner.nextLine());

            eatenDogFood += foodEatenByDog;
            eatenCatFood += foodEatenByCat;
            eatenFood += foodEatenByDog + foodEatenByCat;

            daysCount++;
            if(daysCount % 3 == 0){
                eatenBiscuits += (foodEatenByDog + foodEatenByCat) * 0.1;
            }
        }

        double allBiscuits = Math.round(eatenBiscuits);
        double percentEatenFood = (1.0 * eatenFood / totalFood) * 100;
        double percentEatenFoodByDog = (1.0 * eatenDogFood / eatenFood) * 100;
        double percentEatenFoodByCat = (1.0 * eatenCatFood / eatenFood) * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.%n", allBiscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", percentEatenFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentEatenFoodByDog);
        System.out.printf("%.2f%% eaten from the cat.%n", percentEatenFoodByCat);
    }
}
