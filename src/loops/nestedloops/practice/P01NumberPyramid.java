package loops.nestedloops.practice;

import java.util.Scanner;

/*Напишете програма, която чете цяло число n, въведено от потребителя, и отпечатва пирамида от числа като в примерите:*/

public class P01NumberPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int counter = 1;
        boolean isBigger = false;
        String output = "";

        for (int rows = 1; rows <= num; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                if (counter > num) {
                    isBigger = true;
                    break;
                }

                output += counter + " ";
                counter++;
            }

            System.out.println(output);

            output = "";

            if (isBigger) {
                break;
            }
        }
    }
}
