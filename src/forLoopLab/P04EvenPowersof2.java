package forLoopLab;

import java.util.Scanner;

/*Да се напише програма, която чете число n, въведено от потребителя
и печата четните степени на 2 ≤ 2n: 20, 22, 24, 26, …, 2n. */
public class P04EvenPowersof2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;

        for (int i = 0; i <= n; i +=2) { //i +=2: ще взимам само четни числа, щом почвам от 0 (int i = 0;)
            System.out.println(num); //ако го сложим след фор цикъла, ще принтира само 256 (последната стойност)
            num = num * 2 * 2;
        }



    }
}
