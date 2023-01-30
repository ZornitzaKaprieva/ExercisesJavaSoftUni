package conditionalStatementsAdvanced.conditionalStatementsAdvancedPractice;

import java.util.Scanner;

/* Марин и Нели си купуват къща не далеч от София.
Нели толкова много обича цветята, че Ви убеждава да напишете програма която да изчисли
колко  ще им струва, да си засадят определен брой цветя и дали наличния бюджет ще им е достатъчен.
Различните цветя са с различни цени.
цвете	                Роза	Далия	Лале	Нарцис	Гладиола
Цена на брой в лева 	5	    3.80	2.80	  3	      2.50

Съществуват следните отстъпки:
•	Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
•	Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
•	Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
•	Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
•	Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%

От конзолата се четат 3 реда:
•	Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
•	Брой цветя - цяло число в интервала [10…1000]
•	Бюджет - цяло число в интервала [50…2500]

Да се отпечата на конзолата на един ред:
•	Ако бюджета им е достатъчен - "Hey, you have a great garden with {броя цвета} {вид цветя} and {останалата сума} leva left."
•	Ако бюджета им е НЕ достатъчен - "Not enough money, you need {нужната сума} leva more."
Сумата да бъде форматирана до втория знак след десетичната запетая.
*/
public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();//"Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        int numberOfFlowers = Integer.parseInt(scanner.nextLine()); //[10…1000]
        if (numberOfFlowers >= 10 && numberOfFlowers <= 1000);
        int budget = Integer.parseInt(scanner.nextLine()); //[50…2500]
        if (budget >= 50 && budget <= 2500);

        double priceRoses = numberOfFlowers * 5; //till here ok
        double priceDahlias = numberOfFlowers * 3.8;
        double priceTulips = numberOfFlowers * 2.8;
        double priceNarcissus = numberOfFlowers * 3;
        double priceGladiolus = numberOfFlowers * 2.5;

        double overalSum = 0;

        switch (flowerType) {
            case "Roses":
                if (numberOfFlowers > 80) {
                    overalSum = priceRoses * 0.9;
                } else {
                    overalSum = priceRoses;
                }
                break;

            case "Dahlias":
                if (numberOfFlowers > 90) {
                    overalSum = priceDahlias * 0.85;
                } else {
                    overalSum = priceDahlias;
                }
                break;

            case "Tulips":
                if (numberOfFlowers > 80) {
                    overalSum = priceTulips * 0.85;
                } else {
                    overalSum = priceTulips;
                }
                    break;

                    case "Narcissus": //Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
                        if (numberOfFlowers < 120) {
                            overalSum = priceNarcissus + (priceNarcissus * 0.15);
                        } else {
                            overalSum = priceNarcissus;
                        }
                            break;

                            case "Gladiolus": //+20
                                if (numberOfFlowers < 80) {
                                    overalSum = priceGladiolus + (priceGladiolus * 0.20);
                                } else {
                                    overalSum = priceGladiolus;
                                    break;
                                }
                        }

        double difference = Math.abs(budget-overalSum);
        if (budget >= overalSum) {
            //double moneyLeft = budget-overalSum;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.\n", numberOfFlowers, flowerType, difference); //or moneyLeft
            } else {
            // double neededMoney = overalSum-budget;
             System.out.printf("Not enough money, you need %.2f leva more.\n", difference); //or neededMoney
                        }


                }
        }
