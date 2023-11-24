package loops.forloop.lab;

import java.util.Scanner;

/*Напишете програма, която чете число n, въведено от потребителя и отпечатва числата от 1 до n през 3.
Примерен вход1: 10
Примерен изход1: 1 4 7 10
Примерен вход2: 15
Примерен изход2: 1  4  7  10  13*/

public class P03Numbers1ToNWithStep3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i+= 3) {
            System.out.println(i);
        }
    }
}
