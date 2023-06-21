package loops.whileloop.lab;

import java.util.Scanner;

/*Напишете програма, която изчислява средната оценка на ученик от цялото му обучение.
На първия ред ще получите името на ученика,
а на всеки следващ ред неговите годишни оценки.
Ученикът преминава в следващия клас, ако годишната му оценка е по-голяма или равна на 4.00.
Ако ученикът бъде скъсан повече от един път, то той бива изключен и програмата приключва, като се отпечатва името на ученика и в кой клас бива изключен.
 При успешно завършване на 12-ти клас да се отпечата :
"{име на ученика} graduated. Average grade: {средната оценка от цялото обучение}"
В случай, че ученикът е изключен от училище, да се отпечата:
"{име на ученика} has been excluded at {класа, в който е бил изключен} grade"
Стойността трябва да бъде форматирана до втория знак след десетичната запетая.*/

public class P08Graduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();

        int poorGradeCount = 0; //каунтър за годините с оценки под 3
        double sumGrade = 0;
        int year = 1;

        while (year <= 12) {
            if (poorGradeCount > 1) { //каунтър за годините с оценки под 4 (не повече от 2 по условие)
                break;
            }
         
            double annualGrade = Double.parseDouble(scanner.nextLine());

            if (annualGrade < 4) {
                poorGradeCount++; //каунтър за годините с оценки под 4 нараства с едно
                continue; //оператор, който прекратява операцията (няма да изпълним следващите редове на while цикъла, ако не отговаря на условието и връща цикъла отначало (повтяря текущата итерация)
            }

            sumGrade +=  annualGrade;
            year++;
        }

        if (poorGradeCount > 1) {
            System.out.printf("%s has been excluded at %d grade", studentName, year);
        } else {
            double avgGrade = sumGrade / 12;
            System.out.printf("%s graduated. Average grade: %.2f%n", studentName, avgGrade);
        }
    }
}
