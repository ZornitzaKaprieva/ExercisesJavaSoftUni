package conditionalstatements.exercises;

import java.util.Scanner;

/*Напишете програма, която да изчислява, колко ще струва на един шофьор да напълни резервоара на автомобила си,
като знаете – какъв тип гориво зарежда, каква е цената за литър гориво и дали разполага с карта за отстъпки.
Цените на горивата са както следва:
•	Бензин – 2.22 лева за един литър,
•	Дизел – 2.33 лева за един литър
•	Газ – 0.93 лева за литър
Ако водача има карта за отстъпки,  той се възползва от следните намаления за литър гориво:
18 ст. за литър бензин, 12 ст. за литър дизел и 8 ст. за литър газ.
Ако шофьора е заредил между 20 и 25 литра включително, той получава 8 процента отстъпка от крайната цена,
при повече от 25 литра гориво, той получава 10 процента отстъпка от крайната цена.
Вход
Входът се чете от конзолата и се състои от 3 реда:
•	Типа на горивото – текст с възможности: "Gas", "Gasoline" или "Diesel"
•	Количество гориво – реално число в интервала [1.00 … 50.00]
•	Притежание на клубна карта – текст с възможности: "Yes" или "No"
Изход
На конзолата трябва да се отпечата един ред.
•	"{крайната цена на горивото} lv."
Цената на горивото да бъде форматираната до втората цифра след десетичния знак.*/

public class P08FuelTank2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double price = 0;
        switch (fuel){
            case "Gasoline":
                price = amount * 2.22;
                if(clubCard.equals("Yes")){
                    price = amount * 2.04;
                }
                break;
            case "Diesel":
                price = amount * 2.33;
                if(clubCard.equals("Yes")){
                    price = amount * 2.21;
                }
                break;
            case "Gas":
                price = amount * 0.93;
                if(clubCard.equals("Yes")){
                    price = amount * 0.85;
                }
                break;
        }

        if (amount >= 20 && amount <= 25){
            price = price * 0.92;
        }  else if (amount > 25){
            price = price * 0.9;
        }

        System.out.printf("%.2f lv.", price);
    }
}
