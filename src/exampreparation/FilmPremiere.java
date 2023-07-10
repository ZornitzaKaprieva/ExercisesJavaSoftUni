package exampreparation;

import java.util.Scanner;

/*За предстояща премиера на три известни продукции, местно кино ви наема да напишете софтуер,
който да изчислява цената, която клиентите трябва да заплатят, според филма и пакета, който са избрали.
	            John Wick	    Star Wars	    Jumanji
Напитка	        12 лв./бр.	    18 лв. /бр.	    9 лв. /бр.
Пуканки     	15 лв. /бр.	    25 лв. /бр. 	11 лв. /бр.
Меню	        19 лв. /бр.	    30 лв. /бр.	    14 лв. /бр.
Напишете програма, която изчислява цената, която трябва да се заплати, като имате в предвид следните отстъпки:
•	При избран филм "Star Wars" и закупени поне четири билета, има 30% семейна отстъпка.
•	При избран филм "Jumanji" и закупени точно два билета, има 15% отстъпка за двама.
Вход
Входът се чете от конзолата и се състои от три реда:
•	Първи ред - прожекция - текст с възможности"John Wick", "Star Wars" или "Jumanji"
•	Втори ред - пакет за филм - текст  с възможности "Drink", "Popcorn" или "Menu"
•	Трети ред - брой билети - цяло число в интервала [1… 30]
Изход
На конзолата трябва да се отпечата един ред:
"Your bill is {крайна цена} leva."
Цената да бъде закръглена до втората цифра след десетичния знак.*/

public class FilmPremiere {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String moviePack = scanner.nextLine();
        int ticketNum = Integer.parseInt(scanner.nextLine());

        double pricePer1 = 0;

        switch (movie){
            case "John Wick":
                switch (moviePack){
                    case "Drink":
                        pricePer1 = 12;
                        break;
                    case "Popcorn":
                        pricePer1 = 15;
                        break;
                    case "Menu":
                        pricePer1 = 19;
                        break;
                }
                break;
            case "Star Wars":
                switch (moviePack){
                    case "Drink":
                        pricePer1 = 18;
                        break;
                    case "Popcorn":
                        pricePer1 = 25;
                        break;
                    case "Menu":
                        pricePer1 = 30;
                        break;
                }
                break;
            case "Jumanji":
                switch (moviePack){
                    case "Drink":
                        pricePer1 = 9;
                        break;
                    case "Popcorn":
                        pricePer1 = 11;
                        break;
                    case "Menu":
                        pricePer1 = 14;
                        break;
                }
                break;
        }

        double ticketsPrice = ticketNum * pricePer1;

        if(movie.equals("Star Wars") && ticketNum >= 4){
            ticketsPrice = ticketsPrice * 0.7;
        }

        if (movie.equals("Jumanji") && ticketNum == 2){
            ticketsPrice = ticketsPrice * 0.85;
        }

        System.out.printf("Your bill is %.2f leva.", ticketsPrice);
    }
}
