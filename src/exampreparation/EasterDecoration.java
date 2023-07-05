package exampreparation;

import java.util.Scanner;

/*За великденските празници, магазин започва да продава три вида великденска украса –
кошнички за яйца (basket), великденски венци (wreath) и шоколадови зайци (chocolate bunny).
Вашата задача е да напишете програма, която да изчислява каква сметка трябва да плати всеки един клиент на магазина,
като се има в предвид, че всеки клиент закупил четен брой продукти, ще получи 20% отстъпка от крайната цена.
След като всички клиенти приключат с покупките, трябва да се отпечата средно по колко пари е похарчил всеки човек.
Цените на продуктите са:
•	кошничка за яйца (basket) – 1.50 лв.
•	великденски венец (wreath) – 3.80 лв.
•	шоколадов заек (chocolate bunny) – 7 лв.
Вход
От конзолата първоначално се чете един ред:
•	Брой на клиентите в магазина – цяло число [1… 100]
•	След това за всеки един клиент на нов ред до получаване на командата "Finish" се чете:
o	Покупката която клиента е избрал – текст ("basket", "wreath" или "chocolate bunny")
Изход
•	При получаване на командата "Finish" да се отпечата един ред:
o	"You purchased {броя на покупките} items for {крайната цена} leva."
•	Накрая, след като всички клиенти приключат с покупките, да се отпечата на един ред
o	"Average bill per client is: {средно аритметично на парите които е похарчил всеки един клиент} leva."
Всички пари трябва да бъдат форматирани до втората цифра след десетичния знак.*/

public class EasterDecoration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numClients = Integer.parseInt(scanner.nextLine());

        double overallSum = 0;

        for(int i = 1; i <= numClients; i++){
            String purchase = scanner.nextLine();

            double sum = 0;
            int itemCount = 0;
            while(!purchase.equals("Finish")){
                purchase = purchase;
                itemCount++;
                switch (purchase){
                    case "basket":
                        sum += 1.5;
                        break;
                    case "wreath":
                        sum += 3.8;
                        break;
                    case "chocolate bunny":
                        sum += 7;
                        break;
                }
                purchase = scanner.nextLine();
            }

            if (itemCount % 2 == 0){
                sum = sum * 0.8;
            }

            overallSum += sum;
            System.out.printf("You purchased %d items for %.2f leva.%n", itemCount, sum);
        }
        double avgSum = overallSum / numClients;
        System.out.printf("Average bill per client is: %.2f leva.%n", avgSum);
    }
}
