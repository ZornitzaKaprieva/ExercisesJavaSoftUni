package loops.whileloop.lab;

import java.util.Scanner;

//https://pastebin.com/u/veronikaaa86

/*Напишете програма, която първоначално прочита име и парола на потребителски профил.
След това чете парола за вход.
•	при въвеждане на грешна парола: потребителя да се подкани да въведе нова парола.
•	при въвеждане на правилна парола: отпечатваме "Welcome {username}!".
*/
public class P02Password {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //solution 1:
        String name = scanner.nextLine();
        String password = scanner.nextLine();
        String confirmPass = scanner.nextLine();

        while(!confirmPass.equals(password)) {
            confirmPass = scanner.nextLine();
        }

        System.out.printf("Welcome %s!\n", name);

        }
    }
