package conditionalStatementsAdvanced.conditionalStatementsAdvancedLab;

import java.util.Scanner;

/*Магазин за плодове през работните дни работи на следните цени:
плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
цена	2.50	1.20	0.85	1.45	   2.70	     5.50	     3.85
Събота и неделя магазинът работи на по-високи цени:
плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
цена	2.70	1.25	0.90	1.60	    3.00	5.60	    4.20
Напишете програма, която чете от конзолата плод (banana / apple / orange / grapefruit / kiwi / pineapple / grapes),
ден от седмицата (Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday)
и количество (десетично число) , въведени от потребителя, и пресмята цената според цените от таблиците по-горе.
При невалиден ден от седмицата или невалидно име на плод да се отпечата "error".
*/
public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        boolean isValidFruit = fruit.equals("banana") ||
                fruit.equals("apple") ||
                fruit.equals("orange") ||
                fruit.equals("grapefruit") ||
                fruit.equals("kiwi") ||
                fruit.equals("pineapple") ||
                fruit.equals("grapes");

        boolean isValidDay = day.equals("Monday") ||
                day.equals("Tuesday") ||
                day.equals("Wednesday") ||
                day.equals("Thursday") ||
                day.equals("Friday") ||
                day.equals("Saturday") ||
                day.equals("Sunday");

        boolean isWorkDay = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                day.equals("Thursday") ||  day.equals("Friday");



        if (isWorkDay) {

            if (fruit.equals("banana")){
                price = quantity * 2.50;
            } else if (fruit.equals("apple")) {
                price = quantity * 1.2;
            } else if (fruit.equals("orange")) {
                price = quantity * 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = quantity * 1.45;
            } else if (fruit.equals("kiwi")) {
                price = quantity * 2.7;
            } else if (fruit.equals("pineapple")) {
                price = quantity * 5.5;
            } else if (fruit.equals("grapes")) {
                price = quantity * 3.85;
            }

        } else if (!isWorkDay) {
            if (fruit.equals("banana")) {
                price = quantity * 2.7;
            } else if (fruit.equals("apple")) {
                price = quantity * 1.25;
            } else if (fruit.equals("orange")) {
                price = quantity * 0.9;
            } else if (fruit.equals("grapefruit")) {
                price = quantity * 1.6;
            } else if (fruit.equals("kiwi")) {
                price = quantity * 3.0;
            } else if (fruit.equals("pineapple")) {
                price = quantity * 5.6;
            } else if (fruit.equals("grapes")) {
                price = quantity * 4.2;
            }
        }


        if (!isValidFruit || !isValidDay) {
            System.out.println("error");

    } else {
            System.out.printf("%.2f", price);
        }
    }
}

