package loops.nestedloops.exercises;

import java.util.Scanner;

/*Младоженците искат да направят списък кой на кое място ще седи на сватбената церемония.
Местата са разделени на различни сектори. Секторите са главните латински букви като започват от A.
Във всеки сектор има определен брой редове. От конзолата се чете броят на редовете в първия сектор (A),
като във всеки следващ сектор редовете се увеличават с 1.
На всеки ред има определен брой места - тяхната номерация е представена с малките латински букви.
Броят на местата на нечетните редове се прочита от конзолата, а на четните редове местата са с 2 повече.
Вход
От конзолата се четaт 3 реда:
•	Последният сектор от секторите - символ (B-Z)
•	Броят на редовете в първия сектор - цяло число (1-100)
•	Броят на местата на нечетен ред - цяло число (1-24)
Изход
Да се отпечата на конзолата всяко място на отделен ред по следния формат:
{сектор}{ред}{място}
Накрая трябва да отпечата броя на всички места.
Примерен вход1: B 3 2
Примерен изход1:
A1a
A1b
A2a
A2b
A2c
A2d
A3a
A3b
B1a
B1b
B2a
B2b
B2c
B2d
B3a
B3b
B4a
B4b
B4c
B4d
20*/

public class P06WeddingSeats {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String lastSector = scanner.nextLine();
        int initialRowNum = Integer.parseInt(scanner.nextLine());
        int seatOddNum = Integer.parseInt(scanner.nextLine());

        String firstSector = "A";
        char firstSectorChar = firstSector.charAt(0);
        char lastSectorChar = lastSector.charAt(0);
        int totalSeats = 0;

        for (char i = firstSectorChar; i <= lastSectorChar; i++) {
            for (int row = 1; row <= initialRowNum; row++) {
                String firsSeat = "a";
                char firstSeatChar = firsSeat.charAt(0);
                if (row % 2 != 0) {
                    for (char j = firstSeatChar; j < firstSeatChar + seatOddNum; j++) {
                        char currentSmallLetter = (char) j; //j;
                        System.out.printf("%s%d%c%n", i, row, currentSmallLetter);
                        totalSeats++;
                    }
                } else {
                    for (char j = firstSeatChar; j < firstSeatChar + seatOddNum + 2; j++) {
                        char currentSmallLetter = (char) j;;
                        System.out.printf("%s%d%c%n", i, row, currentSmallLetter);
                        totalSeats++;
                    }
                }
            }

            initialRowNum++;
        }
        System.out.println(totalSeats);
    }
}
