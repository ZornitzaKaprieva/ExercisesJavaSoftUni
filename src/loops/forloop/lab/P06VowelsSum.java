package loops.forloop.lab;

import java.util.Scanner;

/*Да се напише програма, която чете текст (стринг), въведен от потребителя,
изчислява и отпечатва сумата от стойностите на гласните букви според таблицата по-долу:
буква	    a	e	i	o	u
стойност	1	2	3	4	5
Примерен вход1: hello
Примерен изход1: 6
Примерен вход2: bamboo
Примерен изход2: 9*/

public class P06VowelsSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int sum = 0; // за гласните

        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            //System.out.println(currentSymbol); // до тук извеждаме всички букви от стринга, но ние искаме само гласните!

            switch (currentSymbol) { //задаваме стойностите на гласните със switch
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

           // Внимаваме къде принтираме: във for цикъла, но след като затоврим суич, ще се принтират всички букви с техните стойности (0 за съгласни) и след това сбора.
            //System.out.println(sum); //принтира сумата след всяка итерация
        }

        //Внимаваме къде принтираме: след for цикъла, след като затоврим суич.
        System.out.println(sum);
    }
}
