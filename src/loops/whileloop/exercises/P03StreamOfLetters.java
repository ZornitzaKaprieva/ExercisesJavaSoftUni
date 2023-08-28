package loops.whileloop.exercises;

import java.util.Scanner;

/*Напишете програма, която прочита скрито съобщение в поредица от символи.
Те се получават по един на ред до получаване на командата "End".
Думите се образуват от буквите в реда на четенето им.
Символите, които не са латински букви трябва да бъдат игнорирани.
Думите скрити в потока са разделени от тайна команда от три букви – "c", "o" и "n".
При първото получаване на една от тези букви, тя се маркира като срещната, но не се запазва в думата.
При всяко следващо нейно срещане се записва нормално в думата.
След като са налични и трите символа от командата, се печата думата и интервал " ".
Започва се нова дума, която по същия начин чака тайната команда, за да бъде отпечатана.
Вход
От конзолата се чете поредица от редове с един символ на всеки до получаване на командата "End".
Изход
На конзолата се печата на един ред всяка дума след тайната команда, следвана от интервал.*/

public class P03StreamOfLetters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int counterC = 0;
        int counterO = 0;
        int counterN = 0;
        String word = "";
        String secretWord = "";


        while (!input.equals("End")) {
            String letter = input;

            if(letter.matches(".*[a-z].*") || letter.matches(".*[A-Z].*")){
                if (input.equals("c") && counterC == 0) {
                    counterC++;
                } else if (input.equals("o") && counterO == 0) {
                    counterO++;
                } else if (input.equals("n") && counterN == 0) {
                    counterN++;
                } else {
                    word += letter;
                }

                if (counterC + counterN + counterO == 3) {
                    secretWord += word;
                    secretWord += ' ';
                    word = "";
                    counterO = 0;
                    counterC = 0;
                    counterN = 0;
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(secretWord);
    }
}

