package whileLoop.whileLoopPractice;

import java.util.Scanner;

/*Габи иска да започне здравословен начин на живот и си е поставила за цел да върви 10 000 стъпки всеки ден.
Някои дни обаче е много уморена от работа и ще иска да се прибере преди да постигне целта си.
Напишете програма, която чете от конзолата
по колко стъпки изминава тя всеки път като излиза през деня
и когато постигне целта си да се изписва "Goal reached! Good job!"
и колко стъпки повече е извървяла "{разликата между стъпките} steps over the goal!".
Ако иска да се прибере преди това, тя ще въведе командата "Going home"
и ще въведе стъпките, които е извървяла докато се прибира.
След което, ако не е успяла да постигне целта си, на конзолата трябва да се изпише:
"{разликата между стъпките} more steps to reach goal."
*/
public class P04Walking {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int stepsGoal = 10000;
        String stepsDay = scanner.nextLine(); //"Going home" //1. прочитаме входните данни
        int countSteps = 0;//4. да видим колко стъпки е изминала (в while цикъла)

        while (!stepsDay.equals("Going home")) { // 2.добавяме while за stepsDay
            int currentSteps = Integer.parseInt(stepsDay); //преобразуваме стъпките от Стринг в инт, за да можем да ги сметмем след това

            countSteps += currentSteps;


            if (countSteps >= stepsGoal) { //може и да принтираме тук (соуф), но в случая няма смисъл, защото ще дублираме с принта в края.
                break;
            }

            stepsDay = scanner.nextLine();//3.
        }

        if (stepsDay.equals("Going home")){  //когато тръгне да се прибира, трябва да извърви някакви стъпки до вкъщи. този if е за тях и ги добавя към останалите
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            countSteps += stepsToHome;
        }

        //дори да не е събрала 10000 стъпки преди going home, може да ги събере, докато стигне. затова слагаме следващия if..else

        if (countSteps < stepsGoal) {
            int leftStepsForDay = stepsGoal - countSteps;
            System.out.printf("%d more steps to reach goal.", leftStepsForDay);
        } else {
            int stepsOverTheGoal = countSteps - stepsGoal;
            System.out.printf("Goal reached! Good job!\n%d steps over the goal!\n", stepsOverTheGoal);

        }


    }
}
