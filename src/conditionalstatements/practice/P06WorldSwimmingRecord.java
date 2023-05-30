package conditionalstatements.practice;

import java.util.Scanner;

/*Иван решава да подобри Световния рекорд по плуване на дълги разстояния.
На конзолата се въвежда:
рекордът в секунди, който Иван трябва да подобри, 60
разстоянието в метри, което трябва да преплува    100
и времето в секунди, за което плува разстояние от 1 м. 60/100 = 0.6

Да се напише програма, която изчислява дали се е справил със задачата, като се има предвид, че:
съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди.
Когато се изчислява колко пъти Иван ще се забави, в резултат на съпротивлението на водата,
резултатът трябва да се закръгли надолу до най-близкото цяло число.

Да се изчисли времето в секунди, за което Иван ще преплува разстоянието и разликата спрямо Световния рекорд.
Вход
От конзолата се четат 3 реда:
1.	Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
2.	Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
3.	Времето в секунди, за което плува разстояние от 1 м. - реално число в интервала [0.00 … 1000.00]
Изход
Отпечатването на конзолата зависи от резултата:
•	Ако Иван е подобрил Световния рекорд (времето му е по-малко от рекорда) отпечатваме:
o	"Yes, he succeeded! The new world record is {времето на Иван} seconds."
•	Ако НЕ е подобрил рекорда (времето му е по-голямо или равно на рекорда) отпечатваме:
o	"No, he failed! He was {недостигащите секунди} seconds slower."
Резултатът трябва да се форматира до втория знак след десетичната запетая.
*/

//Стъпки за изпълнение:
//1. Прочитаме от конзолата
//2. пресмятаме заабвянето
//3. Резултатът, за който Иван преплува разстоянието: разстоянието + времето за 1 м. + забавянето
//4. Проверка дали е подобрил рекорда

public class P06WorldSwimmingRecord { //2:20 от курса
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecondsFor1m  = Double.parseDouble(scanner.nextLine());

        double delay = (Math.floor(distanceInMeters/15))* 12.5; //на всеки 15 изплувани метра, добавяме 12.5 сек и закръгляме надолу.

        double result = distanceInMeters * timeInSecondsFor1m + delay;

        if (recordInSeconds > result) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", result);
        } else {
            double neededSecond = result - recordInSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", neededSecond);
        }
    }
}
