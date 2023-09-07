package loops.nestedloops.exercises;

import java.util.Scanner;

/*Да се напише програма, която чете две цели числа n и l, въведени от потребителя,
и генерира по азбучен ред всички възможни  пароли, които се състоят от следните 5 символа:
•	Символ 1: цифра от 1 до n.
•	Символ 2: цифра от 1 до n.
•	Символ 3: малка буква измежду първите l букви на латинската азбука.
•	Символ 4: малка буква измежду първите l букви на латинската азбука.
•	Символ 5: цифра от 1 до n, по-голяма от първите 2 цифри.
Вход
Входът се чете от конзолата и се състои от две цели числа n и l в интервала [1…9], по едно на ред.
Изход
На конзолата трябва да се отпечатат всички пароли по азбучен ред, разделени с интервал.*/

public class P14PasswordGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int d1 = 1; d1 <= n ; d1++) {
            for (int d2 = 1; d2 <= n ; d2++) {
                for (char l1 = 'a'; l1 < 'a' + l ; l1++) {
                    for (char l2 = 'a'; l2 < 'a' + l ; l2++) {
                        for (int d3 = Math.max(d1, d2) + 1; d3 <= n ; d3++) {
                            System.out.printf("%d%d%c%c%d ", d1, d2, l1, l2, d3);
                        }
                    }
                }
            }
        }
    }
}
