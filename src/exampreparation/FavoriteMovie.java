package exampreparation;

import java.util.Scanner;

/*Петък вечер е и се чудите кой филм да си пуснете да гледате. Решавате да напишете програма, която да избере това вместо вас.
До команда "STOP" получавате заглавия на любими ваши филми. Най-добрият филм за вас ще бъде този, който има най-много точки.
Точките се изчисляват като сбор от ASCII стойностите на символите в заглавието на филма. (няма да има случай, в който имаме два филма с равен брой точки)
При изчислението на точките трябва да се има предвид следното:
•	За всяка малка буква в заглавието, от сумата трябва да се извади два пъти дължината на заглавието на филма.
•	За всяка главна буква в заглавието, от сумата трябва да се извади дължината на заглавието на филма.
Може да имате максимум 7 заглавия на филми.
Вход
От конзолата се четат редове до команда "STOP" или до достигането на лимита от 7 филма:
•	Заглавие на филм  – текст;
Изход
На конзолата да се отпечата:
•	Ако сте достигнали лимита от 7 филма, трябва да отпечатате:
"The limit is reached."
Да се отпечата най-добрият филм за вас:
"The best movie for you is {заглавие на филм} with {сума на символите} ASCII sum."*/

public class FavoriteMovie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        String bestMovie = "";
        int maxScore = Integer.MIN_VALUE;
        int movieCount = 0;
        while(!command.equals("STOP")){
            String movie = command;
            int points = 0;
            for (int i = 0; i < movie.length(); i++) {
                int charAscii = movie.charAt(i);
                char currentChar = movie.charAt(i);

                if(Character.isUpperCase(currentChar)){
                    points += charAscii - movie.length();
                } else if(Character.isLowerCase(currentChar)){
                    points += charAscii - (2 * movie.length());
                } else {
                    points += charAscii;
                }
            }

            if (points > maxScore){
                maxScore = points;
                bestMovie = movie;
            }

            movieCount++;
            if(movieCount >= 7){
                System.out.println("The limit is reached.");
                break;
            }

            command = scanner.nextLine();
        }

        System.out.printf("The best movie for you is %s with %d ASCII sum.%n", bestMovie, maxScore);
    }
}
