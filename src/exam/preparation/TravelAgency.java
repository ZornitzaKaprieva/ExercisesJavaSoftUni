package exam.preparation;

import java.util.Scanner;

/*Туристическа агенция има нужда от система за изчисляване на дължимата сума при резервация.
В зависимост от различните дестинации и различните пакети, цената е различна.
Цените за ден са следните:
                    Банско/Боровец	                                    Варна/Бургас
                с екипировка	без екипировка	                 със закуска     	без закуска
Цена за ден	        100лв.	        80лв	                        130лв.	            100лв.
VIP отстъпка	    10%	            5%	                            12%	                7%
Ако клиентът е заявил престой повече от 7 дни, получава единия ден безплатно.
Вход:
От конзолата се четат 4 реда:
1.	Име на града - текст с възможности ("Bansko",  "Borovets", "Varna" или "Burgas")
2.	Вид на пакета - текст с възможности ("noEquipment",  "withEquipment", "noBreakfast" или "withBreakfast")
3.	Притежание на VIP отстъпка - текст с възможности  "yes" или "no"
4.	Дни за престой - цяло число в интервала [1 … 10000]
Изход:
На конзолата се отпечатва 1 ред:
•	Когато потребителят е въвел всички данни правилно, отпечатваме:
"The price is {цената, форматирана до втория знак}lv! Have a nice time!"
•	Ако потребителят е въвел по-малко от 1 ден за престой, отпечатваме:
"Days must be positive number!"
•	Когато при въвеждането на града или вида на пакета се въведат невалидни данни, отпечатваме: "Invalid input!"
*/
public class TravelAgency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //enter:
        String city = scanner.nextLine(); //"Bansko",  "Borovets", "Varna" или "Burgas"
        String packageType = scanner.nextLine(); //"noEquipment",  "withEquipment", "noBreakfast" или "withBreakfast"
        String vip = scanner.nextLine(); //"yes" или "no"
        int daysOfStay = Integer.parseInt(scanner.nextLine());


        //price calculation:
        double priceADay = 0;

        switch (city){
            case "Bansko":
            case "Borovets":

                switch (packageType){
                    case "noEquipment":
                        priceADay += 80.0;

                        if (vip.equals("yes")){
                            priceADay = 80 * 0.95;
                        }
                        break;

                    case "withEquipment":
                        priceADay = 100.0;

                        if (vip.equals("yes")){
                            priceADay = 100 * 0.90;
                        }
                        break;
                }
                break;

            case "Varna":
            case "Burgas":

                switch (packageType){
                    case "noBreakfast":
                        priceADay += 100.0;

                        if (vip.equals("yes")){
                            priceADay = 100 * 0.93;
                        }
                        break;

                    case "withBreakfast":
                        priceADay += 130.0;

                        if (vip.equals("yes")){
                            priceADay = 130 * 0.88;
                        }
                        break;
                }
                break;
        }

        //exit:
        double overallPrice = priceADay * daysOfStay;
        if (daysOfStay > 7){
            overallPrice = overallPrice - priceADay;
        }


        //isValid check
        boolean isValidDAysOfStay = (daysOfStay >= 1);
        boolean isValidCity = city.equals("Bansko") || city.equals("Borovets") || city.equals("Varna") || city.equals("Burgas");
        boolean isValidPackageType = packageType.equals("noEquipment") || packageType.equals("withEquipment") || packageType.equals("noBreakfast") || packageType.equals("withBreakfast");
        boolean isValidInput = isValidCity && isValidPackageType && isValidDAysOfStay;

        if (!isValidDAysOfStay){
            System.out.println("Days must be positive number!");
        } else if (!isValidCity || !isValidPackageType) {
            System.out.println("Invalid input!");
        } else if (isValidInput) {
            System.out.printf("The price is %.2flv! Have a nice time!", overallPrice);
        }


    }
}
