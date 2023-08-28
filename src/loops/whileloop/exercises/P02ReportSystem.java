package loops.whileloop.exercises;

import java.util.Scanner;

/*На благотворително събитие плащанията за закупените продукти винаги се редуват:
плащане в брой и плащане с карта. Установени са следните правила за заплащане:
•	Ако продуктът надвишава 100лв., за него не може да се плати в брой
•	Ако продуктът е на цена под 10лв., за него не може да се плати с кредитна карта
Програмата приключва или след като получим команда "End" или след като средствата бъдат събрани.
Вход
От конзолата се четат:
•	Сумата, която се очаква да бъде събрана от продажбите - цяло число в интервала [1 ... 10000]
На всеки следващ ред, до получаване на командата "End" или докато не се съберат нужните средства: цените на предметите, които ще бъдат закупени - цяло число в интервала [1 ... 500]
Изход
На конзолата да се отпечата:
•	При успешна транзакция: "Product sold!"
•	При неуспешна транзакция: "Error in transaction!"
•	Ако сумата на всички закупени продукти надвиши или достигне очакваната сума, програмата трябва да приключи и на конзолата да се изпишат два реда:
o	"Average CS: {средно плащане в кеш на човек}"
o	"Average CC: {средно плащане с карта на човек}"
              Плащанията трябва да бъдат форматирани до втората цифра след десетичния знак.
•	При получаване на команда "End", да се изпише един ред:
o	"Failed to collect required money for charity."
*/
public class P02ReportSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int neededSum = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int sum = 0;
        double sumCash = 0;
        double sumCard = 0;
        double purchaseCount = 1;
        double purchaseCashCount = 0;
        double purchaseCardCount = 0;

        boolean isEnough = false;

        while(!(input.equals("End"))){
            int currentSum = Integer.parseInt(input);

            if(purchaseCount % 2 != 0){

                if (currentSum > 100){
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    sum += currentSum;
                    sumCash += currentSum;
                    purchaseCashCount++;
                }

            } else {

                if (currentSum < 10){
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    sum += currentSum;
                    sumCard += currentSum;
                    purchaseCardCount ++;
                }
            }

            if (sum >= neededSum){
                isEnough = true;
                break;
            }

            purchaseCount++;
            input = scanner.nextLine();

        }

        double avgCash = sumCash / purchaseCashCount;
        double avgCard = sumCard / purchaseCardCount;
        if(isEnough){
            System.out.printf("Average CS: %.2f%n", avgCash);
            System.out.printf("Average CC: %.2f%n", avgCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
