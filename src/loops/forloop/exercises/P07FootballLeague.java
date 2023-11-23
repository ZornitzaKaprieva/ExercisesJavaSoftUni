package loops.forloop.exercises;

import java.util.Scanner;

/*Екипът на СофтУни си организира футболен турнир. Първоначално прочитаме от конзолата капацитета на стадиона и броят на всички фенове. След това за всеки фен се чете секторът, в който се намира. Феновете на първия отбор са в сектор А и Б, а на втория – В и Г. Да се напише програма, която изчислява процентите на феновете във всеки сектор, спрямо общия брой фенове на стадиона, както и общият процент на феновете за двата отбора, спрямо капацитета на стадиона. Общият брой на феновете НЕ надвишава капацитета на стадиона.
Вход
От конзолата се четат поредица от числа, всяко на отделен ред:
1.	Капацитетът на стадиона – цяло число в интервала [1 … 10000];
2.	Броят на всички фенове – цяло число в интервала [1 … 10000].
За всеки един фен, на отделен ред се прочита:
1.	Секторът, на който се намира – текст – "A", "B", "V" и "G".
Изход
Да се отпечатат на конзолата 5 реда, всеки от които съдържа процент между 0.00% и 100.00%, форматирани до втората цифра след десетичната запетая:
1.	Процентът на феновете в сектор А
2.	Процентът на феновете в сектор Б
3.	Процентът на феновете в сектор В
4.	Процентът на феновете в сектор Г
5.	Процентът на всички фенове, спрямо капацитета на стадиона.
Примерен вход1: 76 10 A V V V G B A V B B
Примерен изход1:
    20.00%
    30.00%
    40.00%
    10.00%
    13.16%
Примерен вход2: 1000 12 A A V V A G A A V G V A
Примерен изход2:
    50.00%
    0.00%
    33.33%
    16.67%
    1.20%*/

public class P07FootballLeague {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int numFans  = Integer.parseInt(scanner.nextLine());

        int aCount = 0;
        int bCount = 0;
        int vCount = 0;
        int gCount = 0;

        for(int i = 1; i <= numFans; i++){
            String sector = scanner.nextLine();

            switch (sector){
                case "A":
                    aCount++;
                    break;
                case "B":
                    bCount++;
                    break;
                case "V":
                    vCount++;
                    break;
                case "G":
                    gCount++;
                    break;
            }
        }

        double percentA = 1.0 * aCount / numFans * 100;
        double percentB = 1.0 * bCount / numFans * 100;
        double percentV = 1.0 * vCount / numFans * 100;
        double percentG = 1.0 * gCount / numFans * 100;
        int allFans = aCount + bCount + vCount + gCount;
        double percentAll = 1.0 * allFans / capacity * 100;

        System.out.printf("%.2f%%%n", percentA);
        System.out.printf("%.2f%%%n", percentB);
        System.out.printf("%.2f%%%n", percentV);
        System.out.printf("%.2f%%%n", percentG);
        System.out.printf("%.2f%%%n", percentAll);
    }
}
