package exam.preparation;

import java.util.Scanner;

/*Великденските празници наближават и местната пекарна започва да набавя продуктите,
които ще са ѝ нужни за изработка на великденските сладкиши.
Вашата задача е да напишете програма, която да изчислява нужната сума за закупуване на продуктите.
Нужните продукти са: брашно, захар, яйца и мая.
От конзолата се въвежда цената на брашното за килограм, нужните килограми брашно, килограмите захар, броя на корите с яйца и пакетите мая.
•	цената на килограм захар е с 25% по-ниска от тази на килограм брашно
•	цената на една кора с яйца е с 10% по-висока от цената на килограм брашно
•	цената на един пакет мая е с 80% по-ниска от цената на килограм захар
Вход
От конзолата се четат 5 реда:
1.	Цена на брашното за един килограм – реално число в интервала [0.00 … 10000.00]
2.	Килограми на брашното – реално число в интервала [0.00 … 10000.00]
3.	Килограми на захарта – реално число в интервала [0.00 … 10000.00]
4.	Брой кори с яйца – цяло число в интервала [0 … 10000]
5.	Пакети мая  – цяло число в интервала [0 … 10000]
Изход
Да се отпечата на конзолата едно число:
•	Сумата, която ще им е необходима, форматирана до втория знак след десетичната запетая
*/
public class EasterBakery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double priceFlourKg = Double.parseDouble(scanner.nextLine());
        double kilogramsFlour = Double.parseDouble(scanner.nextLine());
        double kilogramSugar = Double.parseDouble(scanner.nextLine());
        int numberEggsPack = Integer.parseInt(scanner.nextLine());
        int packetsYeast = Integer.parseInt(scanner.nextLine());

        double priceSugarKg = priceFlourKg * 0.75;//25% по-ниска от тази на килограм брашно
        double priceEggsPack = priceFlourKg + (priceFlourKg * 0.1); //с 10% по-висока от цената на килограм брашно
        double pricePacketYeast = priceSugarKg * 0.2; //с 80% по-ниска от цената на килограм захар

        double priceFlour = priceFlourKg * kilogramsFlour;
        double priceSugar = priceSugarKg * kilogramSugar;
        double priceEggsPacks = numberEggsPack * priceEggsPack;
        double priceYeast = packetsYeast * pricePacketYeast;

        double sum = priceFlour + priceSugar + priceEggsPacks + priceYeast;

        System.out.printf("%.2f", sum);
    }
}
