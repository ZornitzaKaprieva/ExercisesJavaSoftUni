package conditionalstatements.advanced.exercises;

import java.util.Scanner;

/*Напишете програма която пресмята колко пари ще изкара шофьор на ТИР за един сезон. На входа програмата получава през кой сезон ще работи шофьора, както и колко километра на месец ще кара. Един сезон е 4 месеца. Според зависи сезона и броя километри на месец ще му се заплаща различна сума на километър:

	                            Пролет/Есен	    Лято	        Зима
км на месец <= 5000	            0.75 лв./км	    0.90 лв./км	    1.05 лв./км
5000 < км на месец <= 10000	    0.95 лв./км	    1.10 лв./км	    1.25 лв./км
10000 < км на месец <= 20000	1.45 лв./км – за който и да е сезон

След като са извадени 10% за данъци се отпечатват останалите пари.
Вход
Входът се чете от конзолата и се състои от два реда:
•	Първи ред – Сезон – текст "Spring", "Summer", "Autumn" или "Winter"
•	Втори ред –  Километри на месец – реално число в интервала [10.00...20000.00]
Изход
На конзолата трябва да се отпечатат едно число:
•	Заплатата на шофьора след данъците, форматирана до втория знак след десетичната запетая.
Примерен вход1: Summer  3455
Примерен изход1: 11194.20
Примерен вход2: Spring  16942
Примерен изход2: 88437.24*/

public class P06TruckDriver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());

        double kmPerSeason = kmPerMonth * 4;
        double amountPerKm = 0;
        if (kmPerMonth <= 5000){

            switch (season){
                case "Spring":
                case "Autumn":
                    amountPerKm = 0.75;
                    break;
                case "Summer":
                    amountPerKm = 0.9;
                    break;
                case "Winter":
                    amountPerKm = 1.05;
                    break;
            }

        } else if (kmPerMonth <= 10000){

            switch (season){
                case "Spring":
                case "Autumn":
                    amountPerKm = 0.95;
                    break;
                case "Summer":
                    amountPerKm = 1.1;
                    break;
                case "Winter":
                    amountPerKm = 1.25;
                    break;
            }

        } else if (kmPerMonth <= 20000){
            amountPerKm = 1.45;
        }

        double amount = (kmPerSeason * amountPerKm) * 0.9;

        System.out.printf("%.2f", amount);
    }
}
