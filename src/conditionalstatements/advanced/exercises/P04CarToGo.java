package conditionalstatements.advanced.exercises;

import java.util.Scanner;

/*Напишете програма, която спрямо даден бюджет и сезон да пресмята цената, типа и класа на кола под наем.
Сезоните са лято и зима – "Summer" и "Winter". Типа коли са кабрио и джип – "Cabrio" и "Jeep".
•	При бюджет по-малък или равен от 100лв.:
o	Класът ще е - "Economy class"
o	Според сезона колата и цената ще са:
	Лято – Кабрио – 35% от бюджета
	Зима – Джип – 65% от бюджета
•	При бюджет по-голям от 100лв. и по-малък или равен от 500лв.:
o	Класът ще е - "Compact class"
o	Според сезона колата и цената ще са:
	Лято – Кабрио – 45% от бюджета
	Зима – Джип – 80% от бюджета
•	При бюджет по-голям от 500лв.:
o	Класът ще е – "Luxury class"
o	За всеки сезон колата ще е джип и цената ще е:
	90% от бюджета
Вход
Входът се чете от конзолата и се състои от два реда:
•	Първи ред – Бюджет – реално число в интервала [10.00...10000.00]
•	Втори ред –  Сезон – текст "Summer" или "Winter"
Изход
На конзолата трябва да се отпечатат два реда.
•	Първи ред – "{Вид на класа}"
o	"Economy class", "Compact class" или "Luxury class"
•	Втори ред – "{Вид на колата} - {цена на колата}"
o	Видът на колата – "Cabrio" или "Jeep"
o	Цената трябва да е форматирана до втория знак след запетаята*/

public class P04CarToGo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String carClass = "";
        String carModel = "";
        double carPrice = 0;

        if (budget <= 100){
            carClass = "Economy class";

            switch (season){
                case "Summer":
                    carModel = "Cabrio";
                    carPrice = budget * 0.35;
                    break;
                case "Winter":
                    carModel = "Jeep";
                    carPrice = budget * 0.65;
                    break;
            }

        } else if (budget <= 500){
            carClass = "Compact class";

            switch (season){
                case "Summer":
                    carModel = "Cabrio";
                    carPrice = budget * 0.45;
                    break;
                case "Winter":
                    carModel = "Jeep";
                    carPrice = budget * 0.8;
                    break;
            }

        }else if (budget > 500){
            carClass = "Luxury class";

            switch (season){
                case "Summer":
                case "Winter":
                    carModel = "Jeep";
                    carPrice = budget * 0.9;
                    break;
            }
        }

        System.out.printf("%s\n", carClass);
        System.out.printf("%s - %.2f\n", carModel, carPrice);
    }
}
