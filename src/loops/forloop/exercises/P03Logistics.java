package loops.forloop.exercises;

import java.util.Scanner;

/*Отговаряте за логистиката на различни товари. В зависимост от теглото на товара е нужно различно превозно средство. Цената на тон, за която се превозва товара е различна за всяко превозно средство:
•	До 3 тона – микробус (200 лева на тон)
•	От 4 до 11 тона – камион (175 лева на тон)
•	12 и повече тона – влак (120 лева на тон)
Вашата задача е да изчислите средната цена на тон превозен товар, както и процента на тоновете  превозвани с всяко превозно средство, спрямо общото тегло(в тонове) на всички товари.
Вход
От конзолата се четат поредица от числа, всяко на отделен ред:
•	На първия ред – броя на товарите за превоз – цяло число в интервала [1...1000]
•	За всеки един товар на отделен ред – тонажа на товара – цяло число в интервала [1...1000]
Изход
Да се отпечатат на конзолата 4 реда, както следва:
•	Първи ред – средната цена на тон превозен товар (закръглена до втория знак след дес. запетая);
•	Втори ред – процентът тона превозвани с микробус (процент между 0.00% и 100.00%);
•	Трети ред – процентът  тона превозвани с камион (процент между 0.00% и 100.00%);
•	Четвърти ред – процентът тона превозвани с влак (процент между 0.00% и 100.00%).*/

public class P03Logistics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numLoads = Integer.parseInt(scanner.nextLine());

        double tonnageCount = 0;

        double vanTonnage = 0;
        double truckTonnage = 0;
        double trainTonnage = 0;

        double sum = 0;

        for(int i = 1; i <= numLoads; i++){

            int loadTonnage = Integer.parseInt(scanner.nextLine());

            tonnageCount += loadTonnage;

            if(loadTonnage <= 3){
                vanTonnage += loadTonnage;
                sum += 200 * loadTonnage;
            } else  if(loadTonnage <= 11){
                truckTonnage += loadTonnage;
                sum += 175 * loadTonnage;

            } else  if(loadTonnage >= 12){
                trainTonnage += loadTonnage;
                sum += 120 * loadTonnage;
            }
        }

        double avgPricePerTon = sum / tonnageCount; //ok
        double vanPercentage = vanTonnage / tonnageCount * 100;
        double truckPercentage = truckTonnage / tonnageCount * 100;
        double trainPercentage = trainTonnage / tonnageCount * 100;

        System.out.printf("%.2f%n", avgPricePerTon);//ok
        System.out.printf("%.2f%%%n", vanPercentage);
        System.out.printf("%.2f%%%n", truckPercentage);
        System.out.printf("%.2f%%%n", trainPercentage);
    }
}
