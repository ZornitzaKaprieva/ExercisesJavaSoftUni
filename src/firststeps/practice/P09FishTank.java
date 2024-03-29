package firststeps.practice;

import java.util.Scanner;

/*За рождения си ден Любомир получил аквариум с формата на паралелепипед.
Първоначално прочитаме от конзолата на отделни редове размерите му – дължина, широчина и височина в сантиметри.
Трябва да се пресметне колко литра вода ще събира аквариума,
ако се знае, че определен процент от вместимостта му е заета от пясък, растения, нагревател и помпа.
Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/.
Да се напише програма, която изчислява литрите вода, която са необходими за напълването на аквариума.
Вход: От конзолата се четат 4 реда:
1.	Дължина в см – цяло число в интервала [10 … 500]
2.	Широчина в см – цяло число в интервала [10 … 300]
3.	Височина в см – цяло число в интервала [10… 200]
4.	Процент  – реално число в интервала [0.000 … 100.000]
Изход: Да се отпечата на конзолата едно число:
•	литрите вода, които ще събира аквариума.
Примерен вход1: 85 75 47 17
Примерен изход1: 248.68875
Примерен вход2: 105 77 89 18.5
Примерен изход2: 586.445475*/

public class P09FishTank {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double occupiedPercentage = Double.parseDouble(scanner.nextLine());

        double fishTankVolumeInLiters = (length * width * height)/1000.0; // //или *0,001 - получавам обема в литри

        double occupiedSpase = occupiedPercentage * 0.01;

        double neededLiters = fishTankVolumeInLiters * (1 - occupiedSpase); //1 е цялото количество. Вадим от цялото количество

        System.out.println(neededLiters);
    }
}
