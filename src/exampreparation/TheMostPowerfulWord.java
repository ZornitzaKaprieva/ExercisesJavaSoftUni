package exampreparation;

import java.util.Scanner;

/* За Лора думите притежават голяма сила. Тя те моли да измислиш алгоритъм, с който да откриеш коя е "най-силната" дума.
До получаване на команда "End of words" ще се четат от конзолата думи.
За да се открие силата на всяка една, трябва да се намери сборът от ASCII стойностите на символите, от които се състои думата.
Ако започва с гласна буква - 'a', 'e', 'i', 'o', 'u', 'y' (или техните еквивалентни главни букви),
полученият сбор трябва да се умножи по дължината на думата, в противен случай, да се раздели на дължината и да се закръгли до най-близкото цяло число надолу.
Вход
До получаване на команда "End of words" се чете по един ред от конзолата:
•	дума – текст
Изход
След приключване на програмата се печата на един ред думата с "най-голяма сила":
•	"The most powerful word is {думата с най-голяма сила} - {силата на думата}"*/

public class TheMostPowerfulWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String mostPowerfulWord = "";
        int asciiPower = 0;
        while(!word.equals("End of words")){
            String currentWord = word;

            int charSum = 0;
            for (int i = 0; i < currentWord.length(); i++) {
                int charLetter = word.charAt(i);
                charSum += charLetter;
            }

            char startLetter = word.charAt(0);
            if (startLetter == 'a' || startLetter == 'A' ||
                    startLetter == 'e' || startLetter == 'E' ||
                    startLetter == 'i' || startLetter == 'I' ||
                    startLetter == 'o' || startLetter == 'O' ||
                    startLetter == 'u' || startLetter == 'U' ||
                    startLetter == 'y' || startLetter == 'Y'){
                charSum = charSum * currentWord.length();
            } else {
                charSum = Math.round(charSum / currentWord.length());
            }

            if(charSum > asciiPower){
                asciiPower = charSum;
                mostPowerfulWord = word;
            }

            charSum = 0;
            word = scanner.nextLine();
        }

        System.out.printf("The most powerful word is %s - %d", mostPowerfulWord, asciiPower);
    }
}
