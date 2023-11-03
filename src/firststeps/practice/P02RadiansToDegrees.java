package firststeps.practice;

import java.util.Scanner;

/*Напишете програма, която чете ъгъл в радиани (десетично число) и го преобразува в градуси.
Използвайте формулата: градус = радиан * 180 / π.
Числото π в Java програми е достъпно чрез Math.PI.
Примерен вход1: 3.1416
Примерен изход1: 180.0004209182994
Примерен вход2: 0.7854
Примерен изход2: 45.00010522957485*/

public class P02RadiansToDegrees {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double radian = Double.parseDouble(scanner.nextLine());
        double degrees = (radian * 180)/ Math.PI;

        System.out.println(degrees);
    }
}
