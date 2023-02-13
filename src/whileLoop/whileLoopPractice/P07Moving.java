package whileLoop.whileLoopPractice;

import java.util.Scanner;

/*На осемнадесетия си рожден ден на Хосе взел решение, че ще се изнесе да живее на квартира.
Опаковал багажа си в кашони и намерил подходяща обява за апартамент под наем.
Той започва да пренася своя багаж на части, защото не може да пренесе целия наведнъж.
Има ограничено свободно пространство в новото си жилище, където може да разположи вещите,
така че мястото да бъде подходящо за живеене.
Напишете програма, която изчислява свободния обем от жилището на Хосе,
който остава след като пренесе багажа си.
Бележка: Един кашон е с точни размери:  1m. x 1m. x 1m.
Вход
Потребителят въвежда следните данни на отделни редове:
1.	Широчина на свободното пространство - цяло число в интервала [1...1000]
2.	Дължина на свободното пространство - цяло число в интервала [1...1000]
3.	Височина на свободното пространство - цяло число в интервала [1...1000]
4.	На следващите редове (до получаване на команда "Done") -
брой кашони, които се пренасят в квартирата - цяло число в интервала [1...10000]
Програмата трябва да приключи прочитането на данни при команда "Done" или ако свободното място свърши.
Изход
Да се отпечата на конзолата един от следните редове:
•	Ако стигнете до командата "Done" и има още свободно място:
"{брой свободни куб. метри} Cubic meters left."
•	Ако свободното място свърши преди да е дошла команда "Done":
"No more free space! You need {брой недостигащи куб. метри} Cubic meters more."
*/
public class P07Moving {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int availableSpace = width * length * height;

        String command = scanner.nextLine(); // int / "Done"
        int countBoxes = 0;
        double freeSpace = (availableSpace * 1.0) - countBoxes;
        double neededSpace = 0;

        while (!command.equals("Done")) {
            int currentBoxes = Integer.parseInt(command);//!!!
            freeSpace -= currentBoxes; //получаваме колко свободно пространство има след като е вкарал кашоните
            countBoxes += currentBoxes;

            if (availableSpace < countBoxes) {
                break;
            }

            neededSpace = countBoxes - availableSpace;

            command = scanner.nextLine();
        }

        double leftSpase = Math.abs(countBoxes - (availableSpace * 1.0));

        if (availableSpace > countBoxes){
            System.out.printf("%.0f Cubic meters left.\n", leftSpase);
        } else {
            System.out.printf("No more free space! You need %.0f Cubic meters more.", leftSpase);

        }
    }
}
