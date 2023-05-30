package loops.forloop.lab;

import java.util.Scanner;

/*Напишете програма, която чете число n, въведено от потребителя и отпечатва числата от 1 до n през 3.*/

public class P03Numbers1ToNWithStep3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i+= 3) { //==i = i + 3
            System.out.println(i);
        }
    }
}
