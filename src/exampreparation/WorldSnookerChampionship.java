package exampreparation;

import java.util.Scanner;

/*С наближаването на световното първенство по снукър в театъра Крусибъл в Шефилд, Англия, феновете нямат търпение да се сдобият с ценните билети.
Заради големия наплив от хора, организаторите ви молят да напишете програма за продаване на билети, като се има предвид следния ценоразпис:
	             Четвъртфинал   Полуфинал      Финал
Стандартен	      55.50 £/бр.	75.88 £/бр.	   110.10 £/бр.
Премиум	          105.20 £/бр.	125.22 £/бр.   160.66 £/бр.
ВИП	              118.90 £/бр.	300.40 £/бр.   400 £/бр.
При закупуване на билет, зрителят може да избере опция, снимка с трофея, на цена 40 лири.
При достигане на определена сума има отстъпки:
•	Над 4000 лири има 25% отстъпка и безплатни снимки с трофея (ако  опцията за снимки е избрана, таксата от 40 лири за билет не се включва)
•	Над 2500 лири има 10% отстъпка
При избрана опция за снимки с трофея, цената се начислява след изчисляването на отстъпките.
Вход
От конзолата се четат 3 реда:
1.	Етап на първенството – текст - “Quarter final ”, “Semi final” или “Final”
2.	Вид на билета – текст - “Standard”, “Premium” или “VIP”
3.	Брой билети – цяло число в интервала [1 … 30]
4.	Снимка с трофея – символ – 'Y' (да) или 'N' (не)
Изход
На конзолата се отпечатва 1 ред:
•	"Цената, която трябва да се заплати, форматирана до втората цифра след десетичния знак"*/

public class WorldSnookerChampionship {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String championshipStage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int ticketsNum = Integer.parseInt(scanner.nextLine());
        String trophyPhoto = scanner.nextLine();

        double pricePerTicket = 0;
        switch (championshipStage){
            case "Quarter final":
                switch (ticketType){
                    case "Standard":
                        pricePerTicket = 55.5;
                        break;
                    case "Premium":
                        pricePerTicket = 105.2;
                        break;
                    case "VIP":
                        pricePerTicket = 118.9;
                        break;
                }
                break;
            case "Semi final":
                switch (ticketType){
                    case "Standard":
                        pricePerTicket = 75.88;
                        break;
                    case "Premium":
                        pricePerTicket = 125.22;
                        break;
                    case "VIP":
                        pricePerTicket = 300.4;
                        break;
                }
                break;
            case "Final":
                switch (ticketType){
                    case "Standard":
                        pricePerTicket = 110.1;
                        break;
                    case "Premium":
                        pricePerTicket = 160.66;
                        break;
                    case "VIP":
                        pricePerTicket = 400;
                        break;
                }
                break;
        }

        double ticketsPrice = ticketsNum * pricePerTicket;
        double pricePerPhoto = 0;

        if (ticketsPrice > 4000){
            ticketsPrice = ticketsPrice * 0.75;
        } else if (ticketsPrice > 2500){
            ticketsPrice = ticketsPrice * 0.9;
            if (trophyPhoto.equals("Y")){
                pricePerPhoto = 40;
            }
        } else {
            if (trophyPhoto.equals("Y")){
                pricePerPhoto = 40;
            }
        }

        double photoPrice = pricePerPhoto * ticketsNum;
        double sum = ticketsPrice + photoPrice;
        System.out.printf("%.2f", sum);
    }
}
