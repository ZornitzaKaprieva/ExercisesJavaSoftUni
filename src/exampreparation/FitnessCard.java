package exampreparation;

import java.util.Scanner;

/*Да се напише програма, която проверява дали първоначално налична сума е достатъчна,
за да се заплати карта за месечен достъп във фитнес.
Цената на картата зависи от пола на клиента и спорта, който практикува:
Пол	    Gym	    Boxing      Yoga	Zumba	Dances	    Pilates
мъж	    $42	    $41	        $45	    $34	    $51     	$39
жена	$35	    $37     	$42	    $31	    $53	        $37
Всички цени на карти за ученици (възраст под 19 години вкл.) са с 20% намаление.
Вход
От конзолата се прочитат 4 реда:
•	Сумата, с която разполагаме - реално число в интервала [10.00…1000.00]
•	Пол - символ ('m' за мъж и 'f' за жена)
•	Възраст - цяло число в интервала [5…105]
•	Спорт - текст (една от възможностите в таблицата)
Изход
На конзолата се отпечатва 1 ред:
•	Ако сумата е достатъчна:
"You purchased a 1 month pass for {sport}."
където {sport} е въведения тип спорт
•	Ако сумата не е достатъчна трябва да се пресметне колко още пари са необходими, за да се закупи карта:
"You don't have enough money! You need ${money} more."
където {money} e оставащата сума нужна, за да се закупи картата, форматирана до втория знак след десетичната запетая.*/

public class FitnessCard {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double price = 0;
        switch (gender) {
            case "m":
                if (sport.equals("Gym")) {
                    price = 42;
                } else if (sport.equals("Boxing")) {
                    price = 41;
                } else if (sport.equals("Yoga")) {
                    price = 45;
                } else if (sport.equals("Zumba")) {
                    price = 34;
                } else if (sport.equals("Dances")) {
                    price = 51;
                } else if (sport.equals("Pilates")) {
                    price = 39;
                }
                break;
            case "f":
                if (sport.equals("Gym")) {
                    price = 35;
                } else if (sport.equals("Boxing")) {
                    price = 37;
                } else if (sport.equals("Yoga")) {
                    price = 42;
                } else if (sport.equals("Zumba")) {
                    price = 31;
                } else if (sport.equals("Dances")) {
                    price = 53;
                } else if (sport.equals("Pilates")) {
                    price = 37;
                }
                break;
        }

        if (age <= 19) {
            price = price * 0.8;
        }

        if (budget >= price) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            double diff = price - budget;
            System.out.printf("You don't have enough money! You need $%.2f more.", diff);
        }
    }
}
