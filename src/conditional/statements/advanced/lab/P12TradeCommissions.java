package conditional.statements.advanced.lab;

import java.util.Scanner;

/*Фирма дава следните комисионни на търговците си според града, в който работят и обема на продажбите s:
Град	0 ≤ s ≤ 500	    500 < s ≤ 1 000	        1 000 < s ≤ 10 000	    s > 10 000
Sofia	5%	                7%	                    8%	                    12%
Varna	4.5%	            7.5%	                10%	                    13%
Plovdiv	5.5%	            8%	                    12%	                    14.5%
Напишете конзолна програма, която чете
име на град (текст) и обем на продажби (реално число) , въведени от потребителя,
и изчислява и извежда размера на търговската комисионна според горната таблица.
Резултатът да се изведе форматиран до 2 цифри след десетичната точка.
При невалиден град или обем на продажбите (отрицателно число) да се отпечата "error".
*/
public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine()); //обем на продажбите

        boolean validCity = city.equals("Sofia") || city.equals("Varna") || city.equals("Varna") || city.equals("Plovdiv");
        boolean validNumberSales = s > 0;

        double commission = 0;

        if (city.equals("Sofia")) {
            if (s <= 500) {
                commission = s * 0.05;
            } else if (s > 500 && s <= 1000) {
                commission = s * 0.07;
            } else if (s > 1000 && s <= 10000) {
                commission = s * 0.08;
            } else {
                commission = s * 0.12;
            }

        } else if (city.equals("Varna")) {

            if (s <= 500) {
                commission = s * 0.045;
            } else if (s > 500 && s <= 1000) {
                commission = s * 0.075;
            } else if (s > 1000 && s <= 10000) {
                commission = s * 0.10;
            } else {
                commission = s * 0.13;
            }

        } else if (city.equals("Plovdiv")) {

            if (s <= 500) {
                commission = s * 0.055;
            } else if (s > 500 && s <= 1000) {
                commission = s * 0.08;
            } else if (s > 1000 && s <= 10000) {
                commission = s * 0.12;
            } else {
                commission = s * 0.145;
            }
        }

        if (!validCity || !validNumberSales) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", commission);
        }


    }
}
