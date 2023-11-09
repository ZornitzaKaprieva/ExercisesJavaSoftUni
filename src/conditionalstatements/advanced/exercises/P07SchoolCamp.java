package conditionalstatements.advanced.exercises;

import java.util.Scanner;

/*Частно училище организира лагери за учениците по време на ваканциите.
В зависимост от вида на ваканцията (пролетна, лятна или зимна) и вида на групата (момчета/момичета или смесена)
цената на нощувката в хотела е различна, както и спортът, който ще практикуват учениците.
	                Зимна ваканция	Пролетна ваканция	Лятна ваканция
момчета/момичета	9.60	        7.20	            15
смесена група	    10	            9.50	            20
Училището получава отстъпка от крайната цена, в зависимост от броя на настанените в хотела ученици:
•	Ако броят на учениците е 50 или повече, училището получава 50% отстъпка
•	Ако броят на учениците е 20 или повече и в същото време по-малък от 50, училището получава 15% отстъпка
•	Ако броят на учениците е 10 или повече и в същото време по-малък от 20, училището получава 5% отстъпка
В таблицата по-долу са дадени спортовете, които ще се практикуват в зависимост от вида на ваканцията и групата:
	            Зимна ваканция	    Пролетна ваканция	    Лятна ваканция
момичета	    Gymnastics	        Athletics	            Volleyball
момчета	        Judo	            Tennis	                Football
смесена група	Ski	                Cycling	                Swimming
Да се напише програма, която пресмята цената, която ще заплати училището за нощувките и принтира спорта, който ще се практикува от учениците.
Вход
От конзолата се четат 4 реда:
1.	Сезонът – текст - “Winter”, “Spring” или “Summer”;
2.	Видът на групата – текст - “boys”, “girls” или “mixed”;
3.	Брой на учениците – цяло число в интервала [1 … 10000];
4.	Брой на нощувките – цяло число в интервала [1 … 100].
Изход
На конзолата се отпечатва 1 ред:
•	Спортът, който са практикували учениците и цената за нощувките, която е заплатило училището, форматирана до втория знак след десетичната запетая, в следния формат:
"{спортът} {цената} lv.“
Примерен вход1: Spring  girls  20  7
Примерен изход1: Athletics 856.80 lv.
Примерен вход2: Winter  mixed  9  15
Примерен изход2: Ski 1350.00 lv.*/

public class P07SchoolCamp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int studentsNum = Integer.parseInt(scanner.nextLine());
        int staysNum = Integer.parseInt(scanner.nextLine());

        double pricePerNight = 0;
        String sport = "";

        switch (season){
            case "Winter":

                switch (groupType){
                    case "girls":
                        pricePerNight = 9.60;
                        sport = "Gymnastics";
                        break;
                    case "boys":
                        pricePerNight = 9.60;
                        sport = "Judo";
                        break;
                    case "mixed":
                        pricePerNight = 10;
                        sport = "Ski";
                        break;
                }
                break;
            case "Spring":

                switch (groupType){
                    case "girls":
                        pricePerNight = 7.20;
                        sport = "Athletics";
                        break;
                    case "boys":
                        pricePerNight = 7.20;
                        sport = "Tennis";
                        break;
                    case "mixed":
                        pricePerNight = 9.5;
                        sport = "Cycling";
                        break;
                }
                break;
            case "Summer":

                switch (groupType){
                    case "girls":
                        pricePerNight = 15;
                        sport = "Volleyball";
                        break;
                    case "boys":
                        pricePerNight = 15;
                        sport = "Football";
                        break;
                    case "mixed":
                        pricePerNight = 20;
                        sport = "Swimming";
                        break;
                }
                break;
        }

        double price = studentsNum * staysNum * pricePerNight;

        if(studentsNum >= 10 && studentsNum < 20){
            price = price * 0.95;
        } else if(studentsNum >= 20 && studentsNum < 50){
            price = price * 0.85;
        } else if(studentsNum >= 50){
            price = price * 0.5;
        }

        System.out.printf("%s %.2f lv.", sport, price);
    }
}
