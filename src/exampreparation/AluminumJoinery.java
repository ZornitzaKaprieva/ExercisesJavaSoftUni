package exampreparation;

import java.util.Scanner;

/*Фирма-производител на алуминиева дограма приема поръчки за изработката и монтаж със следния ценоразпис за един брой.
Фирмата приема само поръчки на едро (над 10 бр.). В зависимост от поръчания брой дограми, фирмата прави различна отстъпка на своите клиенти.
Фирмата предлага също и доставка на поръчките си срещу 60 лв.
Размер	    Единична цена	    Отстъпка от цената
90X130	    110 лв.	            Над 30 броя – 5%
                                Над 60 броя – 8%
100X150	    140 лв.	            Над 40 броя – 6%
                                Над 80 броя – 10%
130X180	    190 лв.	            Над 20 броя – 7%
                                Над 50 броя – 12%
200X300	    250 лв.	            Над 25 броя – 9%
                                Над 50 броя – 14%
Ако поръчката надвишава 99 броя – върху крайната цена се начисляват допълнителни 4% отстъпка (след като се начисли цената за доставка, ако има такава).
При поръчка под 10 бр. на конзолата да бъде изписано "Invalid order"
Вход:
Потребителят въвежда 3 реда:
1.	Брой дограми – цяло число в интервала [0..1000];
2.	Вид на дограмите – текст "90X130" или "100X150" или "130X180" или "200X300";
3.	Начин на получаване – текст
•	С доставка - "With delivery"
•	Без доставка - "Without delivery"
Изход:
Извежда се едно число – стойността на поръчката, в следния формат:
o	"{Обща стойност на поръчката} BGN"
Резултатът да се форматира до втори знак след десетичната запетая.*/

public class AluminumJoinery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int framesNum = Integer.parseInt(scanner.nextLine());
        String framesType = scanner.nextLine();
        String receiptMethod = scanner.nextLine();

        double framePrice = 0;
        switch (framesType){
            case "90X130":
                framePrice = 110;
                if (framesNum >= 30 && framesNum < 60){
                    framePrice = framePrice * 0.95;
                } else if (framesNum >= 60){
                    framePrice = framePrice * 0.92;
                }
                break;
            case "100X150":
                framePrice = 140;
                if (framesNum >= 40 && framesNum < 80){
                    framePrice = framePrice * 0.94;
                } else if (framesNum >= 80){
                    framePrice = framePrice * 0.9;
                }
                break;
            case "130X180":
                framePrice = 190;
                if (framesNum >= 20 && framesNum < 50){
                    framePrice = framePrice * 0.93;
                } else if (framesNum >= 50){
                    framePrice = framePrice * 0.88;
                }
                break;
            case "200X300":
                framePrice = 250;
                if (framesNum >= 25 && framesNum < 50){
                    framePrice = framePrice * 0.91;
                } else if (framesNum >= 50){
                    framePrice = framePrice * 0.86;
                }
                break;
        }

        double sum = 0;
        if (receiptMethod.equals("Without delivery")){
            sum = framePrice * framesNum;
        } else if (receiptMethod.equals("With delivery")){
            sum = (framePrice * framesNum) + 60;
        }


        if (framesNum < 10){
            System.out.println("Invalid order");
        } else if (framesNum <= 99){
            System.out.printf("%.2f BGN%n", sum);
        } else {
            sum = sum * 0.96;
            System.out.printf("%.2f BGN%n", sum);
        }
    }
}
