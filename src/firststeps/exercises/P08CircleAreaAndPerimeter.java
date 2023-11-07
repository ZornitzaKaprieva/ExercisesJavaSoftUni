package firststeps.exercises;

import java.util.Scanner;

/*Напишете програма, която чете от конзолата число r и пресмята и отпечатва лицето и периметъра на кръг / окръжност с радиус r,
като форматирате изхода в следния вид: "<calculated area>" "<calculated parameter>".
Форматирайте изходните данни до втория знак след десетичната запетая.
Примерен вход1: 3
Примерен изход1: 28.27  18.85
Примерен вход2: 4.5
Примерен изход2: 63.62 28.27 */

public class P08CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double area = Math.PI * r * r;
        double param = 2 * Math.PI * r;

        System.out.printf("%.2f\n", area);
        System.out.printf("%.2f\n", param);
    }
}
