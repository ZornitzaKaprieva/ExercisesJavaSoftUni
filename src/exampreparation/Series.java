package exampreparation;

import java.util.Scanner;

/*От телевизионна компания ви наемат да създадете програма, която да изчислява дали за клиентите ще е възможно да си закупят желаните сериали.
Разполагате с бюджет и брой сериали, които потребителят ще желае да закупи. Всеки сериал съответно има заглавие и цена.
Някои от сериалите имат намаление:
•	Thrones – 50%
•	Lucifer – 40%
•	Protector – 30%
•	TotalDrama – 20%
•	Area – 10%
Вход
От конзолата се четат:
•	Бюджет  - реално  число в интервала [10.0… 100.0]
•	Брой сериали - n - цяло положително число в интервала [1… 10]
За всеки сериал се четат по два реда:
o	Име на сериал - текст
o	Цена за сериал -  реално  число в интервала [1.0… 15.0]
Изход
На конзолата да се изпише един ред:
•	Ако бюджета ви е по-голям или равен на цената на сериалите:
	"You bought all the series and left with {останали пари} lv."
•	Ако бюджета ви е по-малък от цената на сериалите:
	"You need {нужни пари} lv. more to buy the series!"
Резултатът да бъде закръглен до втората цифра след десетичния знак.*/

public class Series {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int seriesNum = Integer.parseInt(scanner.nextLine());

        double sumPrice = 0;
        for (int i = 1; i <= seriesNum; i++){
            String name = scanner.nextLine();
            double seriesPrice = Double.parseDouble(scanner.nextLine());

            switch (name){
                case "Thrones":
                    sumPrice += seriesPrice * 0.5;
                    break;
                case "Lucifer":
                    sumPrice += seriesPrice * 0.6;
                    break;
                case "Protector":
                    sumPrice += seriesPrice * 0.7;
                    break;
                case "TotalDrama":
                    sumPrice += seriesPrice * 0.8;
                    break;
                case "Area":
                    sumPrice += seriesPrice * 0.9;
                    break;
                default:
                    sumPrice += seriesPrice;
                    break;
            }
        }

        double diff = Math.abs(budget - sumPrice);
        if (budget >= sumPrice){
            System.out.printf("You bought all the series and left with %.2f lv.", diff);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", diff);
        }
    }
}
