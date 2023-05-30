package loops.whileloop.practice;

import java.util.Scanner;

/*Напишете програма,
в която Марин решава задачи от изпити, докато не получи съобщение "Enough" от лектора си.
При всяка решена задача, той получава оценка.
Програмата трябва да приключи прочитането на данни при команда "Enough"
или ако Марин получи определеният брой незадоволителни оценки.
Незадоволителна е всяка оценка, която е по-малка или равна на 4.
Вход
•	На първи ред - брой незадоволителни оценки - цяло число в интервала [1…5]
•	След това многократно се четат по два реда:
o	Име на задача - текст
o	Оценка - цяло число в интервала [2…6]
Изход
•	Ако Марин стигне до командата "Enough", отпечатайте на 3 реда:
o	"Average score: {средна оценка}"
o	"Number of problems: {броя на всички задачи}"
o	"Last problem: {името на последната задача}"
•	Ако получи определения брой незадоволителни оценки:
o	"You need a break, {брой незадоволителни оценки} poor grades."
Средната оценка да бъде форматирана до втория знак след десетичната запетая.
*/
public class P02ExamPreparation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int poorGradesLimit = Integer.parseInt(scanner.nextLine()); //[1…5]


        int counterPoorGrades = 0; //брояч за незадоволителни оценки
        int counterSolvedProblems = 0; //брояч за решените упражнения
        double sumGrades = 0; //сумата на всички оценки
        String lastProblem = ""; //коя е последната задача
        boolean isPoorGrade = true; // <= 4

        while(counterPoorGrades < poorGradesLimit){
            String problemName = scanner.nextLine();

            if (problemName.equals("Enough")) {
                isPoorGrade = false;
                break;
            }

            int gradeForParticularProblem = Integer.parseInt(scanner.nextLine());

            if (gradeForParticularProblem <= 4){
                counterPoorGrades++;
            }

            sumGrades += gradeForParticularProblem;
            counterSolvedProblems++;
            lastProblem = problemName;
            }

        double averageScore = sumGrades/(counterSolvedProblems * 1.0);

        if (!isPoorGrade) {
            System.out.printf("Average score: %.2f\n" +
                            "Number of problems: %d\n" +
                            "Last problem: %s",
                    averageScore, counterSolvedProblems, lastProblem);
        } else {
            System.out.printf("You need a break, %d poor grades.", counterPoorGrades);
        }

    }
}

