package loops.nestedloops.exercises;

import java.util.Scanner;

/*Провокирани от сватбата си, Михаела и Иван решават да предоставят нова услуга на клиенти на ресторанта си,
а именно вечеря за запознанства - "Предизвикай Сватбата".
Напишете програма, която отпечатва всички възможни срещи на клиентите на ресторанта.
При настаняване всеки мъж и всяка жена получават талончета с поредни номера, стартирайки от 1.
Ако бъдат заети всички маси, програмата трябва да приключи. Всяка маса има две места.
Вход
От конзолата се четат точно 3 числа, всяко на отделен ред:
•	Броят клиенти мъже - цяло число в интервала [1...100]
•	Броят клиенти жени - цяло число в интервала [1...100]
•	Максималният брой маси - цяло число в интервала [1...100]
Изход
На конзолата се принтират на един ред, разделени с интервал всички срещи в следният формат:
•	({№ клиент} <-> {№ клиент}) ({№ клиент} <-> {№ клиент}) ...*/

public class P05ChallengeTheWedding {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tablesMax = Integer.parseInt(scanner.nextLine());

        int tableCount = 0;
        for (int m = 1; m <= men; m++) {
            for (int f = 1; f <= women ; f++) {
                System.out.printf("(%d <-> %d) ", m, f);
                tableCount++;
                if (tableCount == tablesMax) {
                    return;
                }
            }
        }
    }
}
