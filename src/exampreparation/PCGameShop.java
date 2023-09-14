package exampreparation;

import java.util.Scanner;

/*Магазин за компютърни игри ви наема за да направите статистика на процента продажби на игрите от последния месец,
 като изчислите по колко процента от общите продажби са за някоя от игрите.
Процентите трябва да бъдат разделени на четири части, три заглавия на игри и всички останали :
•	Hearthstone
•	Fornite
•	Overwatch
•	Others
Вход
От конзолата се четат:
•	Брой продадени игри- n - цяло положително число в интервала [1… 100]
За следващите n реда се чете по един ред:
o	Име на игра - текст
Изход
На конзолата да се изпишат четири реда:
	"Hearthstone - {процент продажби на Hearthstone}%"
	"Fornite - {процент продажби на Fornite}%"
	"Overwatch - {процент продажби на Overwatch}%"
	"Others - {процент продажби на всички останали игри}%"
Резултатът да бъде закръглен до втората цифра след десетичния знак.*/

public class PCGameShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       int numbGamesSold = Integer.parseInt(scanner.nextLine());

       int hearthstoneCount = 0;
       int forniteCount = 0;
       int overwatchCount = 0;
       int othersCount = 0;

        for (int i = 1; i <= numbGamesSold; i++) {

            String gameName = scanner.nextLine();

            switch (gameName){
                case "Hearthstone":
                    hearthstoneCount++;
                    break;
                case "Fornite":
                    forniteCount++;
                    break;
                case "Overwatch":
                    overwatchCount++;
                    break;
                default:
                    othersCount++;
                    break;
            }
        }

        double percentHearthstone = 1.0 * hearthstoneCount / numbGamesSold * 100;
        double percentFornite = 1.0 * forniteCount / numbGamesSold * 100;
        double percentOverwatch = 1.0 * overwatchCount / numbGamesSold * 100;
        double percentOthers = 1.0 * othersCount / numbGamesSold * 100;

        System.out.printf("Hearthstone - %.2f%%%n", percentHearthstone);
        System.out.printf("Fornite - %.2f%%%n", percentFornite);
        System.out.printf("Overwatch - %.2f%%%n", percentOverwatch);
        System.out.printf("Others - %.2f%%%n", percentOthers);
    }
}
