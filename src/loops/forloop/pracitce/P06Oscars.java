package loops.forloop.pracitce;

import java.util.Scanner;

/*Поканени сте от академията да напишете софтуер, който да пресмята точките за актьор/актриса.
Академията ще ви даде първоначални точки за актьора.
След това всеки оценяващ ще дава своята оценка.
Точките, които актьора получава се формират от:
дължината на името на оценяващия умножено по точките, които дава делено на две.
Ако резултатът в някой момент надхвърли 1250.5 програмата трябва да прекъсне и да се отпечата,
че дадения актьор е получил номинация.
Вход
•	Име на актьора - текст
•	Точки от академията - реално число в интервала [2.0... 450.5]
•	Брой оценяващи n - цяло число в интервала[1… 20]
На следващите n-на брой реда:
o	Име на оценяващия - текст
o	Точки от оценяващия - реално число в интервала [1.0... 50.0]
Изход
Да се отпечата на конзолата един ред:
•	Ако точките са над 1250.5:
"Congratulations, {име на актьора} got a nominee for leading role with {точки}!"
•	Ако точките не са достатъчни:
	"Sorry, {име на актьора} you need {нужни точки} more!"
Резултатът да се форматирана до първата цифра след десетичния знак!
Примерен вход1:
    Zahari Baharov
    205
    4
    Johnny Depp
    45
    Will Smith
    29
    Jet Lee
    10
    Matthew Mcconaughey
    39
Примерен изход1: Sorry, Zahari Baharov you need 247.5 more!
Примерен вход2:
    Sandra Bullock
    340
    5
    Robert De Niro
    50
    Julia Roberts
    40.5
    Daniel Day-Lewis
    39.4
    Nicolas Cage
    29.9
    Stoyanka Mutafova
    33
Примерен изход2: Congratulations, Sandra Bullock got a nominee for leading role with 1268.5!*/

public class P06Oscars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine()); //[2.0... 450.5]
        int numberEvaluators = Integer.parseInt(scanner.nextLine()); //[1… 20] (n)

        boolean isValidName = !(actorName.isEmpty()) && !(actorName.isBlank());
        boolean isValidPoints = academyPoints >= 2.0 && academyPoints <= 450.5;
        boolean isValidNumberEvaluators = numberEvaluators >= 1 && numberEvaluators <= 20;
        boolean isValidInput = isValidName && isValidPoints && isValidNumberEvaluators;

        double allPoints = academyPoints; //academyPoints + allEvaluatorPoints

        for (int i = 1; i <= numberEvaluators; i++) {
            String nameEvaluator = scanner.nextLine();
            double evaluatorPoints = Double.parseDouble(scanner.nextLine());

            double overallPointsFromAEvaluator = (nameEvaluator.length() * evaluatorPoints)/2.0;
            allPoints += overallPointsFromAEvaluator;

            if (allPoints >= 1250.5 && isValidInput){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, allPoints);
                break; //в случая така прекратяваме, защото се е изпълнило условието актьорът да получи 1250.5 точки, без да е свършило самото оценяване
            }
        }

        if (allPoints < 1250.5 && isValidInput){ //вече имаме if (allPoints >= 1250.5 && isValidInput){ в for цикъла, затова е ненужен тук
            double diff = Math.abs(1250.5 - allPoints);
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff );
        }
    }
}


