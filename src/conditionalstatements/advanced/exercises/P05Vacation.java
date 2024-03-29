package conditionalstatements.advanced.exercises;

import java.util.Scanner;

/*Напишете програма, която спрямо даден бюджет и сезон да пресмята цената, локацията и мястото на настаняване за ваканция. Сезоните са лято и зима – "Summer" и "Winter". Локациите са – "Alaska" и "Morocco". Възможните места за настаняване – "Hotel", "Hut" или "Camp".
•	При бюджет по-малък или равен от 1000лв.:
o	Настаняване в "Camp"
o	Според сезона локацията ще е една от следните и ще струва определен процент от бюджета:
	Лято – Аляска – 65% от бюджета
	Зима – Мароко – 45% от бюджета
•	При бюджет по-голям от 1000лв. и по-малък или равен от 3000лв.:
o	Настаняване в "Hut"
o	Според сезона локацията ще е една от следните и ще струва определен процент от бюджета:
	Лято – Аляска – 80% от бюджета
	Зима – Мароко – 60% от бюджета
•	При бюджет по-голям от 3000лв.:
o	Настаняване в "Hotel"
o	Според сезона локацията ще е една от следните и ще струва 90% от бюджета:
	Лято – Аляска
	Зима – Мароко
Вход
Входът се чете от конзолата и се състои от два реда:
•	Първи ред – Бюджет – реално число в интервала [10.00...10000.00]
•	Втори ред –  Сезон – текст "Summer" или "Winter"
Изход
На конзолата трябва да се отпечатат един ред.
"{локацията} – {мястото за настаняване} – {цената}"
Цената трябва да е форматирана до вторият знак след десетичната запетая.
Примерен вход1: 800 Summer
Примерен изход1: Alaska - Camp - 520.00
Примерен вход2: 5000 Winter
Примерен изход2: Morocco - Hotel - 4500.00*/

public class P05Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String location = "";
        String accommodation = "";
        double price = 0;
        if (budget <= 1000){
            accommodation = "Camp";

            switch (season){
                case "Summer":
                    location = "Alaska";
                    price = budget * 0.65;
                    break;
                case "Winter":
                    location = "Morocco";
                    price = budget * 0.45;
                    break;
            }

        } else if (budget <= 3000){
            accommodation = "Hut";

            switch (season){
                case "Summer":
                    location = "Alaska";
                    price = budget * 0.8;
                    break;
                case "Winter":
                    location = "Morocco";
                    price = budget * 0.6;
                    break;
            }

        }else if (budget > 3000){
            accommodation = "Hotel";

            switch (season){
                case "Summer":
                    location = "Alaska";
                    price = budget * 0.9;
                    break;
                case "Winter":
                    location = "Morocco";
                    price = budget * 0.9;
                    break;
            }
        }

        System.out.printf("%s - %s - %.2f\n", location, accommodation, price);
    }
}
