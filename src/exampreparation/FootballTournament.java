package exampreparation;

import java.util.Scanner;

/*Задачата ви е да напишете програма, която приема името на отбор и прави статистика за него.
През един сезон всеки отбор изиграва определен брой футболни срещи, като за всяка среща на отбора се дават точки в зависимост от изхода от срещата.
Има три възможни изхода от една среща:
	W - Отборът е победител и получава 3 точки
	D - Срещата е завършила без победител и отборът получава 1 точка
	L - Отборът е загубил срещата и не получава точки
Напишете програма, която приема името на футболен отбор и извежда неговата статистика, на база на изиграните срещи през този сезон.
Неговата статистика трябва да включва общия брой спечелени точки през настоящия сезон, подробна статистика за изхода на изиграните игри и процент победи през сезона.
Ако отборът по някаква причина не е играл мачове през настоящия сезон се извежда специално съобщение.
Вход
От конзолата се четат два реда:
•	Името на футболния отбор, за който водим статистика - текст
•	Броя изиграни срещи през настоящия сезон - цяло число в интервала [0… 100]
 За всяка изиграна среща се прочита отделен ред:
o	Резултатът от изиграната среща в един от горепосочените формати – символ с възможности 'W', 'D' и 'L'
Изход
В зависимост от това дали отборът е играл мачове през настоящия сезон се извеждат два вида изход.
•	Ако отборът не е изиграл нито един мач през настоящия сезон се извежда точно един ред в следния формат:
o	"{името на отбора} hasn't played any games during this season."
•	Ако отборът е изиграл един мач или повече се извеждат шест реда в следния формат:
o	"{името на отбора} has won {брой спечелени точки} points during this season"
o	"Total stats:"
o	"## W: {брой спечелени игри}"
o	"## D: {брой игри, завършили наравно}"
o	"## L: {брой загубени игри}"
o	"Win rate: {процент спечелени игри}%"
Процентът спечелени игри трябва да бъде форматиран до втората цифра след десетичния знак.*/

public class FootballTournament {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        int matches = Integer.parseInt(scanner.nextLine());

        int countW = 0;
        int countD = 0;
        int countL = 0;
        int score = 0;

        for (int i = 1; i <= matches; i++) {

            String result = scanner.nextLine();

            switch (result){
                case "W":
                    countW++;
                    score += 3;
                    break;
                case "D":
                    countD++;
                    score++;
                    break;
                case "L":
                    countL++;
                    break;
            }
        }

        if(countW == 0 && countD == 0 && countL == 0){
            System.out.printf("%s hasn't played any games during this season.%n", team);
        } else {
            System.out.printf("%s has won %d points during this season.%n", team, score);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", countW);
            System.out.printf("## D: %d%n", countD);
            System.out.printf("## L: %d%n", countL);
            double percentW = 1.0 * countW / matches * 100;
            System.out.printf("Win rate: %.2f%%%n", percentW);
        }
    }
}
