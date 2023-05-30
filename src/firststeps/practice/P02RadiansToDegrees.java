package firststeps.practice;

import java.util.Scanner;

/*Напишете програма, която чете ъгъл в радиани (десетично число) и го преобразува в градуси.
Използвайте формулата: градус = радиан * 180 / π.
Числото π в Java програми е достъпно чрез Math.PI.*/
public class P02RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radian = Double.parseDouble(scanner.nextLine());
        double degrees = (radian * 180)/ Math.PI;

        System.out.println(degrees);
    }
}
