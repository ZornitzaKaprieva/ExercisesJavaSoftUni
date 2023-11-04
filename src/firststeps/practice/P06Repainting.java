package firststeps.practice;

import java.util.Scanner;

/*Румен иска да пребоядиса хола и за целта е наел майстори.
Напишете програма, която изчислява разходите за ремонта, предвид следните цени:
•	Предпазен найлон - 1.50 лв. за кв. метър
•	Боя - 14.50 лв. за литър
•	Разредител за боя - 5.00 лв. за литър
За всеки случай, към необходимите материали, Румен иска да добави още
10% от количеството боя и 2 кв.м. найлон, разбира се и 0.40 лв. за торбички.
Сумата, която се заплаща на майсторите за 1 час работа, е равна на 30% от сбора на всички разходи за материали.
Вход: Входът се чете от конзолата и съдържа точно 4 реда:
1.	Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
2.	Необходимо количество боя (в литри) - цяло число в интервала [1…100]
3.	Количество разредител (в литри) - цяло число в интервала [1…30]
4.	Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]
Изход: Да се отпечата на конзолата един ред:
•	"{сумата на всички разходи}"
Примерен вход1: 10 11 4 8
Примерен изход1: 727.09
Примерен вход2: 5 10 10 1
Примерен изход2: 286.52*/

public class P06Repainting {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int neededNylon = Integer.parseInt(scanner.nextLine());
        int neededPaint = Integer.parseInt(scanner.nextLine());
        int neededPaintThinner  = Integer.parseInt(scanner.nextLine());
        int workHours  = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (neededNylon + 2) * 1.5;
        double paintPrice = (neededPaint + (neededPaint * 0.1)) * 14.5;
        double paintThinnerPrice = neededPaintThinner * 5.0;
        double bags = 0.4;

        double purchase = nylonPrice + paintPrice + paintThinnerPrice + bags;
        double payForWork = (purchase * 0.3) * workHours;

        double allCosts = purchase + payForWork;

        System.out.println(allCosts);
    }
}
