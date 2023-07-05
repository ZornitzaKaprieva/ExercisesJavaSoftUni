package exampreparation;

import java.util.Scanner;

/*От кино ви наемат да напишете програма, чрез която да разберете дали на една прожекцията ще се запълни залата и колко пари ще се изкарат от нея.
Получавате места в залата и на всеки следващ ред до команда "Movie time!", колко хора влизат в залата. Цената на един билет е 5 лв.
Ако текущия брой хора влезли в залата се дели на 3 без остатък, се прави отстъпка 5лв от общата им сметка.
Ако в залата се опитат да влязат повече хора от колкото места са останали, то се счита че местата са изчерпани и програмата трябва да приключи четенето на вход.
Вход
От конзолата се четат:
•	На първия ред - капацитет на залата - цяло число в интервала [50... 150]
На всеки следващ ред до команда "Movie time!":
o	Брой хора влизащи в киното - цяло число в интервала [1… 15]
Изход
На конзолата първо да се отпечата един ред:
•	При получена команда "Movie time!":
 "There are {останали места} seats left in the cinema."
•	При изчерпване на местата в залата:
	"The cinema is full."
След това да се отпечата:
	"Cinema income - {приходи от залата} lv."*/

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        boolean isFull = false;

        int peopleCount = 0;
        while (!command.equals("Movie time!")){
            int people = Integer.parseInt(command);

            capacity -= people;


            if (capacity < 0){
                isFull = true;
                break;
            }

            if (people % 3 == 0){
                peopleCount += people - 1;
            } else {
                peopleCount += people;
            }

            command = scanner.nextLine();
        }

        if (isFull){
            System.out.println("The cinema is full.");
        } else {
            System.out.printf("There are %d seats left in the cinema.%n", capacity);
        }

        int income = peopleCount * 5;
        System.out.printf("Cinema income - %d lv.", income);
    }
}
