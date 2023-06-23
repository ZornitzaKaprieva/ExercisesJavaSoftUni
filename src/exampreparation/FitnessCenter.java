package exampreparation;

import java.util.Scanner;

/*Напишете програма, която да изчислява броя на посетителите в един фитнес център.
В началото програмата получава броя на посетителите на фитнеса и за всеки човек - дейността, която извършва във фитнеса.
Накрая програмата трябва да отпечата броя трениращи за всяка една дейност ("Back", "Chest", 'Legs", "Abs")
и броя клиенти, закупили продукт ("Protein shake", "Protein bar").
Също така - процента трениращи (спрямо общия брой посетители) и процента на клиентите, закупили продукт от фитнеса.
Вход
От конзолата се чете число, след това поредица от низове, всяко на отделен ред:
•	На първия ред – броят на посетителите във фитнеса – цяло число в интервала [1...1000]
•	За всеки един посетител на отделен ред – дейността във фитнеса – текст ("Back", "Chest", "Legs", "Abs", "Protein shake" или "Protein bar")
Изход
Да се отпечатат на конзолата 8 реда, които съдържат следната информация:
Ред 1 -	"{брой хора трениращи гръб} - back"
Ред 2 -	"{брой хора трениращи гърди} - chest"
Ред 3 -	"{брой хора трениращи крака} - legs"
Ред 4 -	"{брой хора трениращи коремни мускули} - abs"
Ред 5 -	"{брой хора закупили протеинов шейк} - protein shake"
Ред 6 -	"{брой хора закупили протеинов блок} - protein bar"
Ред 7 -	"{процент на хората дошли да тренират}% - work out"
Ред 8 -	"{процент на хората дошли да купят протеин}% - protein"
Всички проценти трябва да са форматирани до втората цифра след десетичния знак.*/

public class FitnessCenter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfVisitors = Integer.parseInt(scanner.nextLine());

        int counterBack = 0;
        int counterChest = 0;
        int counterLegs = 0;
        int counterAbs = 0;
        int counterProteinShake = 0;
        int counterProteinBar = 0;

        for (int i = 0; i < numberOfVisitors ; i++) {
            int currentNumberOfVisitors = numberOfVisitors;
            String activity = scanner.nextLine(); //("Back", "Chest", "Legs", "Abs", "Protein shake" или "Protein bar"
            if (activity.equals("Back")){
                counterBack++;
            } else if (activity.equals("Chest")) {
                counterChest++;
            }  else if (activity.equals("Legs")) {
            counterLegs++;
            }else if (activity.equals("Abs")) {
                counterAbs++;
            }else if (activity.equals("Protein shake")) {
                counterProteinShake++;
            }else if (activity.equals("Protein bar")) {
                counterProteinBar++;
            }

            currentNumberOfVisitors ++;
        }

        int counterWorkoutVisitors = counterBack + counterChest + counterLegs + counterAbs;
        int counterProteinBuyer = counterProteinBar + counterProteinShake;

        System.out.printf("%d - back\n", counterBack);
        System.out.printf("%d - chest\n", counterChest);
        System.out.printf("%d - legs\n", counterLegs);
        System.out.printf("%d - abs\n", counterAbs);
        System.out.printf("%d - protein shake\n", counterProteinShake);
        System.out.printf("%d - protein bar\n", counterProteinBar);

        double percentWorkoutVisitors = (counterWorkoutVisitors*1.0/numberOfVisitors) * 100;
        double percentProteinBuyer = (counterProteinBuyer * 1.0/numberOfVisitors ) * 100;

        System.out.printf("%.2f%% - work out\n", percentWorkoutVisitors);
        System.out.printf("%.2f%% - protein\n", percentProteinBuyer);
    }
}
