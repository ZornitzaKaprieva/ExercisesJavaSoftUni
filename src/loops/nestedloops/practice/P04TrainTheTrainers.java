package loops.nestedloops.practice;

import java.util.Scanner;

/*Курсът "Train the trainers" е към края си и финалното оценяване наближава.
Вашата задача е да помогнете на журито което ще оценява презентациите,
като напишете програма в която да изчислява средната оценка от представянето на всяка една презентация от даден студент,
а накрая средният успех от всички тях.
От конзолата на първият ред се прочита броят на хората в журито n - цяло число в интервала [1…20]
След това на отделен ред се прочита името на презентацията - текст
За всяка една презентация на нов ред се четат n - на брой оценки - реално число в интервала [2.00…6.00]
След изчисляване на средната оценка за конкретна презентация, на конзолата се печата
 "{името на презентацията} - {средна оценка}."
След получаване на команда "Finish" на конзолата се печата
"Student's final assessment is {среден успех от всички презентации}." и програмата приключва.
Всички оценки трябва да бъдат форматирани до втория знак след десетичната запетая.
Примерен вход1:
    2
    While-Loop
    6.00
    5.50
    For-Loop
    5.84
    5.66
    Finish
Примерен изход1:
    While-Loop - 5.75.
    For-Loop - 5.75.
    Student's final assessment is 5.75.
Примерен вход2:
    3
    Arrays
    4.53
    5.23
    5.00
    Lists
    5.83
    6.00
    5.42
    Finish
Примерен изход2:
    Arrays - 4.92.
    Lists - 5.75.
    Student's final assessment is 5.34.*/

public class P04TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberJury = Integer.parseInt(scanner.nextLine()); //[1…20]
        String input = scanner.nextLine();

        double totalGradesSum = 0;
        int countPresentations = 0;

        while (!input.equals("Finish")){
            String presentationTitle = input; //това е за по-добра четимост, не е задължително
            double sumGrades = 0;
            for (int i = 1; i <= numberJury; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine()); //[2.00…6.00]
                sumGrades += currentGrade;
            }

            double averageGradePerPresentation = sumGrades / numberJury;
            totalGradesSum += averageGradePerPresentation;
            countPresentations++;
            System.out.printf("%s - %.2f.\n", presentationTitle, averageGradePerPresentation);

            input = scanner.nextLine();
        }

        double averageGradeAllStudents = totalGradesSum / countPresentations;
        System.out.printf("Student's final assessment is %.2f.\n", averageGradeAllStudents);
    }
}
