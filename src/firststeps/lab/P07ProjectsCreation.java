package firststeps.lab;

import java.util.Scanner;

/*Напишете програма, която изчислява колко часа ще са необходими на един архитект,
за да изготви проектите на няколко строителни обекта.
Изготвянето на един проект отнема три часа.
Вход:
От конзолата се четат 2 реда:
1.	Името на архитекта - текст
2.	Брой на проектите, които трябва да изготви - цяло число в интервала [0 … 100]
Изход:
На конзолата се отпечатва: "The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."
Примерен вход1: George 4
Примерен изход1: The architect George will need 12 hours to complete 4 project/s.
Примерен вход2: Sanya 9
Примерен изход2: The architect Sanya will need 27 hours to complete 9 project/s.*/

public class P07ProjectsCreation {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());

        int hours = projects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hours, projects);
    }
}
