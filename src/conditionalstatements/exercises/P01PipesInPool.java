package conditionalstatements.exercises;

import java.util.Scanner;

/*Басейн с обем V има две тръби от които се пълни. Всяка тръба има определен дебит (литрите вода минаващи през една тръба за един час).
Работникът пуска тръбите едновременно и излиза за N часа. Напишете програма, която изкарва състоянието на басейна, в момента, когато работникът се върне.
Вход
От конзолата се четат четири реда:
•	Първият ред съдържа числото V – Обем на басейна в литри – цяло число в интервала [1…10000].
•	Вторият ред съдържа числото P1 – дебит на първата тръба за час – цяло число в интервала [1…5000].
•	Третият ред съдържа числото P2 – дебит на втората тръба за час– цяло число в интервала [1…5000].
•	Четвъртият ред съдържа числото H – часовете които работникът отсъства – реално число в интервала [1.0…24.00]
Изход
Да се отпечата на конзолата едно от двете възможни състояния:
•	До колко се е запълнил басейна и коя тръба с колко процента е допринесла.
o	"The pool is {запълненост на басейна в проценти}% full. Pipe 1: {процент вода от първата тръба}%. Pipe 2: {процент вода от втората тръба}%."
Aко басейнът се е препълнил – с колко литра е прелял за даденото време.
o	"For {часовете, които тръбите са пълнили вода} hours the pool overflows with {литрите вода в повече} liters."
Примерен вход1: 1000  100  120  3
Примерен изход1: The pool is 66.00% full. Pipe 1: 45.45%. Pipe 2: 54.55%.
Примерен вход2: 100  100  100  2.5
Примерен изход2: For 2.50 hours the pool overflows with 400.00 liters.*/

public class P01PipesInPool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double vP1 = p1 * h;
        double vP2 = p2 * h;
        double vPipes = vP1 + vP2;

        double poolFullnessPercent = (vPipes / v) * 100;
        double p1Percent = (vP1 / vPipes) * 100;
        double p2Percent = (vP2 / vPipes) * 100;

        if(v >= vPipes){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",
                    poolFullnessPercent, p1Percent, p2Percent);
        } else {
            double diff = vPipes - v;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.\n", h,  diff);
        }
    }
}

