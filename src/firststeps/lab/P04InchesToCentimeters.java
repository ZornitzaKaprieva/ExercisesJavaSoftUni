package firststeps.lab;

import java.util.Scanner;

/*Да се напише програма, която чете от конзолата реално число и го преобразува от инчове в сантиметри.
За целта умножете инчовете по 2.54 (1 инч = 2.54 сантиметра).
Примерен вход1: 5
Примерен изход1: 12.5
Примерен вход2: 7
Примерен изход2: 17.78*/

public class P04InchesToCentimeters {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double inch = Double.parseDouble(scanner.nextLine());
        double cm = inch * 2.54d;

        System.out.println(cm);
    }
}
