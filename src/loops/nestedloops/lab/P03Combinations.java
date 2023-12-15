package loops.nestedloops.lab;

import java.util.Scanner;

/*Напишете програма, която изчислява колко решения в естествените числа (включително и нулата) има уравнението:
x1 + x2 + x3 = n
Числото n е цяло число и се въвежда от конзолата.
Примерен вход1: 25
Примерен изход1: 351
Примерен вход2: 5
Примерен изход2: 21*/

public class P03Combinations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    int sum = i + j + k;
                    if (sum == n){
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}

