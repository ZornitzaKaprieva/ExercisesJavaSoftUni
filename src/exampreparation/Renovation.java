package exampreparation;

import java.util.Scanner;

/*Пешо решава, че иска да направи ремонт вкъщи. Неговата задача е да боядиса стените в хола, като знаете височината и ширината на една стена.
Холът на Пешо има 4 стени с еднакви размери, определен процент от които се заемат от прозорци и врати, които няма да бъдат боядисвани.
Той не е сигурен дали ще успее наведнъж, затова моли Вас да му помогнете да изчисли дали ще му остава още работа за следващия ден и, ако да, колко кв. м. има да довърши,
а в случай, че успее да боядиса хола, колко боя му е останала (трябва да се има предвид, че с един литър боя се боядисва един квадратен метър от стената).
Вход
От конзолата се четат следните редове:
1.	Височина на стената - цяло число [0… 100]
2.	Ширина на стената - цяло число [0… 100]
3.	Процент от общата площ на стените, който няма да бъде боядисан - цяло число [5… 95]
На следващите редове до получаване на командата "Tired!" или докато не бъдат боядисани всички стени, се чете по едно число:
•	Литри боя – цяло число [0…100]:
Забележка: Площта за боядисване да бъде закръглена нагоре до най-близкото цяло число.
Изход
Да се отпечата на конзолата един от следните редове:
•	При получаване на командата "Tired!":
"{квадратни метри} quadratic m left."
{квадратни метри} е повърхнината, която му остава да боядисана.
•	Aко е останала боя в излишък:
"All walls are painted and you have {литри боя} l
 paint left!"
•	Aко след боядисването на всички стени, не е останала боя:
"All walls are painted! Great job, Pesho!" */

public class Renovation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wallHeight = Integer.parseInt(scanner.nextLine());
        int wallWidth  = Integer.parseInt(scanner.nextLine());
        int notPaintedPercentage  = Integer.parseInt(scanner.nextLine());

        double allArea = wallHeight * wallWidth * 4.0;
        double percentageDecimal = (notPaintedPercentage / 100.0) * allArea;
        double area = Math.ceil(allArea - percentageDecimal);

        String input = scanner.nextLine();

        int sumLitersOfPaint = 0;
        boolean isPainted = false;

        while (!input.equals("Tired!")){

            int litersOfPaint = Integer.parseInt(input);

            sumLitersOfPaint += litersOfPaint;

            if (area <= sumLitersOfPaint){
                isPainted = true;
                break;
            }

            input = scanner.nextLine();
        }

        double diff = Math.abs(area - sumLitersOfPaint);

        if(isPainted && diff == 0){
            System.out.printf("All walls are painted! Great job, Pesho!");
        }else if(isPainted && diff > 0){
            System.out.printf("All walls are painted and you have %.0f l paint left!%n", diff);
        } else {
            System.out.printf("%.0f quadratic m left.%n", diff);
        }
    }
}
