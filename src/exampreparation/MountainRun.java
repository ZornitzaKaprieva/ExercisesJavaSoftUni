package exampreparation;

import java.util.Scanner;

/*Георги решава да подобри рекорда за най-бързо изкачване на връх Монблан.
На конзолата се въвежда рекордът в секунди, който Георги трябва да подобри,
разстоянието в метри, което трябва да изкачи и времето в секунди, за което той изкачва 1 метър.
Да се напише програма, която изчислява дали се е справил със задачата, като се има предвид, че:
наклонът на терена го забавя на всеки 50 м. с 30 секунди.
Да се изчисли времето в секунди, за което Георги ще изкачи разстоянието до върха и разликата спрямо рекорда.
Когато се изчислява колко пъти Георги ще се забави в резултат на наклона на терена, резултатът трябва да се закръгли надолу до най-близкото цяло число.
Вход
От конзолата се четат 3 реда:
1.	Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
2.	Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
3.	Времето в секунди, за което изкачва 1 м. – реално число в интервала [0.00 … 1000.00]
Изход
Отпечатването на конзолата зависи от резултата:
•	Ако Георги е подобрил рекорда отпечатваме:
o	" Yes! The new record is {времето на Георги} seconds."
•	Ако НЕ е подобрил рекорда отпечатваме:
o	"No! He was {недостигащите секунди} seconds slower."
Резултатът трябва да се форматира до втория знак след десетичната запетая.*/

public class MountainRun {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double secForMeter = Double.parseDouble(scanner.nextLine());

        double goergiTimeWithoutDelay = distanceInMeters * secForMeter;
        double delay = Math.floor(distanceInMeters / 50) * 30;
        double georgiTime = goergiTimeWithoutDelay + delay;

        if (recordInSec > georgiTime) {
            System.out.printf("Yes! The new record is %.2f seconds.", georgiTime);
        } else {
            double diff = georgiTime - recordInSec;
            System.out.printf("No! He was %.2f seconds slower.", diff);
        }
    }
}
