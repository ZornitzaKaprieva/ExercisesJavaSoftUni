package additionalExercisesConditionalStatementsAdvanced;

import java.util.Scanner;

/*Предстои Вело състезание за благотворителност в което участниците са разпределени в младша("juniors") и старша("seniors") група. Парите се набавят от таксата за участие на велосипедистите. Според възрастовата група и вида на трасето на което ще се провежда състезанието, таксата е различна.
Група	  trail	        cross-country	downhill	road
juniors 	5.50	           8	    12.25	        20
seniors	    7	            9.50	    13.75	        21.50
Ако в "cross-country" състезанието се съберат 50 или повече участника(общо младши и старши), таксата  намалява с 25%. Организаторите отделят 5% процента от събраната сума за разходи.
Вход
От конзолата се четат 2 числа и един стринг, всяко на отделен ред:
•	Първият ред – броят младши велосипедисти. Цяло число в интервала [1…100]
•	Вторият ред – броят старши велосипедисти. Цяло число в интервала [1… 100]
•	Третият ред – вид трасе – "trail", "cross-country", "downhill" или "road"
Изход
Да се отпечата на конзолата едно число:
"{дарената сума}" - форматирана с точност до 2 знака след десетичната запетая.
*/
public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine()); //[1…100]
        int seniors = Integer.parseInt(scanner.nextLine()); //[1…100]
        String trace = scanner.nextLine(); //"trail", "cross-country", "downhill" или "road"

        double payTaxJuniors =  0;//juniors * trialTax
        double payTaxSeniors =  0;//seniors * trialTax
        double payTax = payTaxJuniors + payTaxSeniors;


        switch (trace){
            case "trail":
                if (juniors >=1 && juniors <= 100 && seniors >=1 && seniors <= 100){
                    payTaxJuniors = juniors * 5.50;
                    payTaxSeniors = seniors * 7.0;
                    payTax = payTaxJuniors + payTaxSeniors;
                }
                break;
            case "cross-country":
                if (((juniors >=1 && juniors < 50) && (seniors >=1 && seniors < 50)) && ((juniors + seniors) < 50)  ){
                    payTaxJuniors = juniors * 8.0;
                    payTaxSeniors = seniors * 9.5;
                    payTax = payTaxJuniors + payTaxSeniors;
                } else if ((juniors + seniors) >= 50) {
                    payTaxJuniors = juniors * 8.0;
                    payTaxSeniors = seniors * 9.5;
                    payTax = (payTaxJuniors + payTaxSeniors) * 0.75;
                }
                break;
            case "downhill":
                if (juniors >=1 && juniors <= 100 && seniors >=1 && seniors <= 100){
                    payTaxJuniors = juniors * 12.25;
                    payTaxSeniors = seniors * 13.75;
                    payTax = payTaxJuniors + payTaxSeniors;
                }
                break;
            case "road":
                if (juniors >=1 && juniors <= 100 && seniors >=1 && seniors <= 100){
                    payTaxJuniors = juniors * 20.0;
                    payTaxSeniors = seniors * 21.5;
                    payTax = payTaxJuniors + payTaxSeniors;
                }
                break;
        }



        double expenses = payTax * 0.05;
        double moneyForCharity = payTax - expenses;

        System.out.printf("%.2f", moneyForCharity);

    }
}
