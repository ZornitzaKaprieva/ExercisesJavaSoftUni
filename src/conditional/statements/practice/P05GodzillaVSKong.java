package conditional.statements.practice;


import java.util.Scanner;

/*Снимките за дългоочаквания филм "Годзила срещу Конг" започват.
Сценаристът Адам Уингард ви моли да напишете програма,
която да изчисли дали предвидените средства са достатъчни за снимането на филма. //бюджет - средства
За снимките  ще бъдат нужни определен брой статисти, облекло за всеки един статист и декор. // средства = дрехи*статисти + декор
Известно е, че:
•	Декорът за филма е на стойност 10% от бюджета.
•	При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.
Вход
От конзолата се четат 3 реда:
Ред 1.	Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
Ред 2.	Брой на статистите – цяло число в интервала [1 … 500]
Ред 3.	Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]
Изход
На конзолата трябва да се отпечатат два реда:
•	Ако  парите за декора и дрехите са повече от бюджета:
o	"Not enough money!"
o	"Wingard needs {парите недостигащи за филма} leva more."
•	Ако парите за декора и дрехите са по малко или равни на бюджета:
o	"Action!"
o	"Wingard starts filming with {останалите пари} leva left."
Резултатът трябва да е форматиран до втория знак след десетичната запетая.
*/
public class P05GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmBudget = Double.parseDouble(scanner.nextLine());
        int actors = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());

        double decor = filmBudget * 0.1;
        double clothesOverallSum = actors * clothes;
        if (actors > 150) {
          clothesOverallSum = (clothesOverallSum * 0.9);
        }

        double overalSum = decor + clothesOverallSum;

        double differnce = Math.abs(filmBudget - overalSum); //взимаме абсолютна стойност

        if (overalSum > filmBudget) {
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.\n", differnce);
        } else {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.\n", differnce);
        }




    }
}
