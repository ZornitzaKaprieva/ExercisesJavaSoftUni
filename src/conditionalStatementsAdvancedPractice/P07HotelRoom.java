package conditionalStatementsAdvancedPractice;

import java.util.Scanner;

/*Хотел предлага 2 вида стаи: студио и апартамент. Напишете програма, която изчислява цената за целия престой за студио и апартамент. Цените зависят от месеца на престоя:
Май и октомври	                    Юни и септември	                         Юли и август
Студио – 50 лв./нощувка	        Студио – 75.20 лв./нощувка	        Студио – 76 лв./нощувка
Апартамент – 65 лв./нощувка	    Апартамент – 68.70 лв./нощувка	    Апартамент – 77 лв./нощувка
Предлагат се и следните отстъпки:
•	За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
•	За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
•	За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
•	За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.
Вход
Входът се чете от конзолата и съдържа точно 2 реда, въведени от потребителя:
•	На първия ред е месецът – May, June, July, August, September или October
•	На втория ред е броят на нощувките – цяло число в интервала [0 ... 200]
Изход
Да се отпечатат на конзолата 2 реда:
•	На първия ред: "Apartment: {цена за целият престой} lv."
•	На втория ред: "Studio: {цена за целият престой} lv."
Цената за целия престой форматирана с точност до два знака след десетичната запетая.
*/
public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine(); //May, June, July, August, September или October
        int numberOfOvernight = Integer.parseInt(scanner.nextLine()); //[0 ... 200]

        double priceStudio = 0;
        double priceApartment = 0;

        switch (month) {
            case "May":
            case "October":
                priceStudio = numberOfOvernight * 50;
                priceApartment = numberOfOvernight * 65;

                if (numberOfOvernight > 7 && numberOfOvernight <= 14) {
                    priceStudio = priceStudio * 0.95;
            } else if (numberOfOvernight > 14) {
                    priceStudio = priceStudio * 0.7;
                    priceApartment = priceApartment * 0.9;
                }


                break;
            case "June":
            case "September":
                priceStudio = numberOfOvernight * 75.2;
                priceApartment = numberOfOvernight * 68.7;

                if (numberOfOvernight > 14) {
                    priceStudio = priceStudio * 0.8;
                    priceApartment = priceApartment * 0.9;
                }

                break;
            case "July":
            case "August":
                priceStudio = numberOfOvernight * 76;
                priceApartment = numberOfOvernight * 77;
                if (numberOfOvernight > 14) {
                    priceApartment = priceApartment * 0.9;
                }
                break;
                }

        System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", priceApartment, priceStudio);
        }



    }
