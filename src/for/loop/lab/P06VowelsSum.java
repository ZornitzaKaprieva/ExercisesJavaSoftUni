package forLoop.forLoopLab;

import java.util.Scanner;

/*Да се напише програма, която чете текст (стринг), въведен от потребителя,
изчислява и отпечатва сумата от стойностите на гласните букви според таблицата по-долу:
буква	    a	e	i	o	u
стойност	1	2	3	4	5
*/
public class P06VowelsSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int sum = 0; // 2. за гласните

        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            //System.out.println(currentSymbol); // 1. до тук извеждаме всички букви от стринга, но ние искаме само гласните!

            switch (currentSymbol) { //3. задаваме стойностите на гласните със switch
                case 'a': //char е с единчна кавичка
                    sum = sum + 1;
                    break;
                case 'e':
                    sum = sum + 2;
                    break;
                case 'i':
                    sum = sum + 3;
                    break;
                case 'o':
                    sum = sum + 4;
                    break;
                case 'u':
                    sum = sum + 5;
                    break;
            }

           // 5 //внимаваме къде принтираме: във for цикъла, но след като затоврим суич, ще се принтират всички букви със техните стойности (0 за съгласни) и след това сбора
            //System.out.println(sum); //!принтира сумата след всяка итерация
        }

        //4. внимаваме къде принтираме: след for цикъла след като затоврим суич
        System.out.println(sum);
    }
}
