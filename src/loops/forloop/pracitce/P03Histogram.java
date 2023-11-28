package loops.forloop.pracitce;

import java.util.Scanner;

/*Дадени са n цели числа в интервала [1…1000].
От тях някакъв процент p1 са под 200,
друг процент p2 са от 200 до 399,
друг процент p3 са от 400 до 599,
друг процент p4 са от 600 до 799
и останалите p5 процента са от 800 нагоре.
Да се напише програма, която изчислява и отпечатва процентите p1, p2, p3, p4 и p5.
Пример: имаме n = 20 числа: 53, 7, 56, 180, 450, 920, 12, 7, 150, 250, 680, 2, 600, 200, 800, 799, 199, 46, 128, 65. 
Получаваме следното разпределение и визуализация:
Диапазон	    Числа в диапазона	                                 Брой числа	        Процент
< 200	        53, 7, 56, 180, 12, 7, 150, 2, 199, 46, 128, 65	        12	        p1 = 12 / 20 * 100 = 60.00%
200 … 399	    250, 200	                                             2	        p2 = 2 / 20 * 100 = 10.00%
400 … 599	    450	                                                     1	        p3 = 1 / 20 * 100 = 5.00%
600 … 799	    680, 600, 799	                                         3	        p4 = 3 / 20 * 100 = 15.00%
≥ 800	        920, 800	                                             2	        p5 = 2 / 20 * 100 = 10.00%
Вход
На първия ред от входа стои цялото число n (1 ≤ n ≤ 1000) – брой числа. 
На следващите n реда стои по едно цяло число в интервала [1…1000] – числата върху които да бъде изчислена хистограмата.
Примерен вход1: 3  1  2  999
Примерен изход1:
    66.67%
    0.00%
    0.00%
    0.00%
    33.33%
Примерен вход2: 7  800  801  250  199  399  599  799
Примерен изход2:
    14.29%
    28.57%
    14.29%
    14.29%
    28.57%*/

public class P03Histogram {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //Стъпки за решение:
        //1. потребителят ни казва колко числа тряба да прочетем
                // 1.1 правим променливи за всички интервали --> бройката числа за определен интервал
                // 1.2 првим фор цикъл с n на брой поворения
        //2. прочитаме число
        //3. проверяваме в кой диапазон ни е числото
        //4. да пресметнем процента за всеки диапазон
        //5. да принтираме всички тези проценти

        int n = Integer.parseInt(scanner.nextLine()); //1. стъпка

        int p1Count = 0; //1.1 стъпка
        int p2Count = 0;
        int p3Count = 0;
        int p4Count = 0;
        int p5Count = 0;

        for (int i = 1; i <= n; i++) { //1.2 стъпка (започват от 1, за да проброим интерациите

            int currentNum = Integer.parseInt(scanner.nextLine()); //2 стъпка

            //3 стъпка:
            if (currentNum < 200){
                p1Count++; // p1Count = p1Count + 1 ////запазваме числото от съответния диапазон тук
            } else if (currentNum <= 399) {
                p2Count++; //запазваме числото от съответния диапазон тук (=>увеличаваме бройката на числата от този диапазон)
            } else if (currentNum <= 599) {
                p3Count++;//запазваме числото от съответния диапазон тук (=>увеличаваме бройката на числата от този диапазон)
            }else if (currentNum <= 799) {
                p4Count++;//запазваме числото от съответния диапазон тук (=>увеличаваме бройката на числата от този диапазон)
            }else { //ненужно: else if (currentNum >= 800) {
                p5Count++; //запазваме числото от съответния диапазон тук (=>увеличаваме бройката на числата от този диапазон)
            }
        }

        //4 стъпка:
        double percentP1 = (p1Count * 1.0 / n) * 100; //така няма да е правилно: double percentP1 = p1Count / n * 100;, няма да е дабъл
        double percentP2 = (p2Count * 1.0 / n) * 100; // 25 * 1.0 = 25.0 (иначе дава int, а не double
        double percentP3 = (p3Count * 1.0 / n) * 100;
        double percentP4 = (p4Count * 1.0 / n) * 100;
        double percentP5 = (p5Count * 1.0 / n) * 100;

        //5 стъпка:
        System.out.printf("%.2f%%%n", percentP1); //%% за да принтираме процент в souf //==System.out.printf("%.2f%%%n")
        System.out.printf("%.2f%%%n", percentP2);
        System.out.printf("%.2f%%%n", percentP3);
        System.out.printf("%.2f%%%n", percentP4);
        System.out.printf("%.2f%%\n", percentP5);
    }
}
