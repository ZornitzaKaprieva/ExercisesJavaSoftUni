package whileLoop.whileLoopPractice;

import java.util.Scanner;

/*Джеси е решила да събира пари за екскурзия
и иска от вас да ѝ помогнете да разбере дали ще успее да събере необходимата сума.
Тя спестява или харчи част от парите си всеки ден.
Ако иска да похарчи повече от наличните си пари,
то тя ще похарчи всичките и ще ѝ останат 0 лева.
Вход
От конзолата се четат:
•	Пари нужни за екскурзията - реално число в интервала [1.00…25000.00]
•	Налични пари - реално число в интервала [0.00...25000.00]
След това многократно се четат по два реда:
•	Вид действие - текст с възможности "spend" и "save"
•	Сумата, която ще спести/похарчи - реално число в интервала [0.01…25000.00]
Изход
Програмата трябва да приключи при следните случаи:
•	Ако 5 последователни дни Джеси само харчи, на конзолата да се изпише:
o	"You can't save the money."
o	"{Общ брой изминали дни}"
•	Ако Джеси събере парите за почивката на конзолата се изписва:
o	"You saved the money for {общ брой изминали дни} days."
*/
public class P03Vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double neededMoneyForTrip = Double.parseDouble(scanner.nextLine()); //[1.00…25000.00]
        double availableMoney = Double.parseDouble(scanner.nextLine()); //[1.00…25000.00]

//        boolean isValidMoneyForTrip = neededMoneyForTrip >= 1.00 && neededMoneyForTrip <= 25000.00;
//        boolean isValidAvailableMoney = availableMoney >= 1.00 && availableMoney <= 25000.00;
//        boolean isValidInput = isValidMoneyForTrip && isValidAvailableMoney;

        int countDays = 0;
        int spendCount = 0;

        while (availableMoney < neededMoneyForTrip) { //логиката тук: докато парите, които имаме налични са по-малко от парите за екскурзията. Защо да продължаваме да събираме, ако имамедостратъчно пари. Тогава ще излезем от цикъла

            if (spendCount == 5) {
                break;
            }

            String action = scanner.nextLine(); //"spend" и "save"
            double money = Double.parseDouble(scanner.nextLine()); // [0.01…25000.00]
            //boolean isValidMoney = money >= 0.01 && money <= 25000.00;

            countDays++; //слагаме го тук, за да хваща и спестените и изхарчените пари

            if (action.equals("spend")){
                spendCount += 1;
                availableMoney -= money;
            } else if (action.equals("save")) {
                availableMoney += money;
                spendCount = 0; //зануляваме командата за spendCount, защото започваме да ги броим наново (вече не са последователни)
            }

            if (availableMoney < 0) {
                availableMoney = 0;
            }
        }

        if (spendCount == 5) {
            System.out.printf("You can't save the money.\n%d", countDays);
        }else {
            System.out.printf("You saved the money for %d days.\n", countDays);
        }
    }
}

