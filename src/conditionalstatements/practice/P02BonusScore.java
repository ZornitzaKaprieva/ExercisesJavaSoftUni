package conditionalstatements.practice;

import java.util.Scanner;

/*Дадено е цяло число – начален брой точки. Върху него се начисляват бонус точки по правилата, описани по-долу.
Да се напише програма, която пресмята бонус точките, които получава числото и общия брой точки (числото + бонуса).
•	Ако числото е до 100 включително, бонус точките са 5.
•	Ако числото е по-голямо от 100, бонус точките са 20% от числото.
•	Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
•	Допълнителни бонус точки (начисляват се отделно от предходните):
o	За четно число  + 1 т.
o	За число, което завършва на 5  + 2 т.
Примерен вход1: 20
Примерен изход1: 6.0  26.0
Примерен вход2: 175
Примерен изход2: 37.0  212.0
Примерен вход3: 2703
Примерен изход3: 270.3  2973.3*/

public class P02BonusScore {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (number <= 100){
            bonus = 5;
        } else if (number > 100 && number <= 1000) {
            bonus = number * 0.2;
        }else {
            bonus = number * 0.1;
        }


        if (number%2==0){
            bonus = bonus + 1;
        } else if (number % 10 == 5){
            bonus = bonus + 2;
        }

        System.out.println(bonus);
        System.out.println(number + bonus);
    }
}

