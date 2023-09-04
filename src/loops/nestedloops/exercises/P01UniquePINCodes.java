package loops.nestedloops.exercises;

import java.util.Scanner;

/*Да се напише програма, която генерира трицифрени PIN кодове, като цифрите на всеки PIN код са в определен интервал.
За да бъде валиден един PIN код той трябва да отговаря на следните условия:
•	Първата и третата цифра трябва да бъдат четни.
•	Втората цифра трябва да бъде просто число в диапазона [2...7].
Вход
От конзолата се четат 3 реда:
•	Горната граница на първото число - цяло число в диапазона [1...9]
•	Горната граница на второто число - цяло число в диапазона [1...9]
•	Горната граница на третото число - цяло число в диапазона [1...9]
Изход
Да се отпечатат на конзолата всички валидни трицифрени PIN кодове, чиито цифри отговарят на съответните интервали.*/

public class P01UniquePINCodes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxFirst = Integer.parseInt(scanner.nextLine());
        int maxSecond = Integer.parseInt(scanner.nextLine());
        int maxThird= Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= maxFirst; i++){
            if (i % 2 == 0){
                for (int j = 1; j <= maxSecond; j++){
                    if (j == 2 || j == 3 || j == 5 || j == 7){
                        for(int k = 1; k <= maxThird; k++){
                            if (k % 2 == 0){
                                System.out.printf("%d %d %d%n", i, j, k);
                            }
                        }
                    }
                }
            }
        }
    }
}
