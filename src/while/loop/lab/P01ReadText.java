package whileLoop.whileLoopLab;

import java.util.Scanner;

/*Напишете програма, която чете текст от конзолата (стринг) и го принтира, докато не получи командата "Stop".*/
public class P01ReadText {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputSomeString = scanner.nextLine();

        while (!(inputSomeString.equals("Stop"))) {

            System.out.println(inputSomeString);

            inputSomeString = scanner.nextLine();
        }
    }
}
