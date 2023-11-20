package conditionalstatements.lab;

import java.util.Scanner;

/*Да се напише програма, която чете парола (текст), въведена от потребителя
и проверява дали въведената парола съвпада с фразата "s3cr3t!P@ssw0rd".
При съвпадение да се изведе "Welcome". При несъвпадение да се изведе "Wrong password!".
Примерен вход1: qwerty
Примерен изход1: Wrong password!
Примерен вход2: s3cr3t!P@ssw0rd
Примерен изход2:Welcome*/

public class P04PasswordGuess {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String passVerification = scanner.nextLine();

        if (passVerification.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }
    }
}
