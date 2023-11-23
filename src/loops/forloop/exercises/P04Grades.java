package loops.forloop.exercises;

import java.util.Scanner;

/*Напишете програма, която да пресмята статистика на оценки от изпит.
В началото програмата получава броят на студентите явили се на изпита и за всеки студент неговата оценка.
На края програмата трябва да изпечата процента на студенти с оценка между 2.00 и 2.99, между 3.00 и 3.99, между 4.00 и 4.99, 5.00 или повече. Също така и средният успех на изпита.
Вход
От конзолата се четат поредица от числа, всяко на отделен ред:
•	На първия ред – броя на студентите явили се на изпит – цяло число в интервала [1...1000]
•	За всеки един студент на отделен ред – оценката от изпита – реално число в интервала [2.00...6.00]
Изход
Да се отпечатат на конзолата 5 реда, които съдържат следната информация:
Ред 1 -	"Top students: {процент студенти с успех 5.00 или повече}%"
Ред 2 -	"Between 4.00 and 4.99: {между 4.00 и 4.99 включително}%"
Ред 3 -	"Between 3.00 and 3.99: {между 3.00 и 3.99 включително}%"
Ред 4 -	"Fail: {по-малко от 3.00}%"
Ред 5 -	"Average: {среден успех}"
Всички числа трябва да са форматирани до вторият знак след десетичната запетая.
Примерен вход1: 10  3.00  2.99  5.68  3.01  4  4  6.00  4.50  2.44  5
Примерен изход1:
    Top students: 30.00%
    Between 4.00 and 4.99: 30.00%
    Between 3.00 and 3.99: 20.00%
    Fail: 20.00%
    Average: 4.06
Примерен вход2: 6  2  3  4  5  6  2.2
Примерен изход2:
    Top students: 33.33%
    Between 4.00 and 4.99: 16.67%
    Between 3.00 and 3.99: 16.67%
    Fail: 33.33%
    Average: 3.70*/

public class P04Grades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numStudents = Integer.parseInt(scanner.nextLine());

        double numStudentsD = numStudents;
        double sumGrades = 0;
        int students5PlusCount = 0;
        int students4PlusCount = 0;
        int students3PlusCount = 0;
        int students3MinusCount = 0;

        for (int i = 1; i <= numStudents; i++){

            double grade = Double.parseDouble(scanner.nextLine());

            sumGrades += grade;

            if(grade < 3){
                students3MinusCount++;
            } else if(grade < 4) {
                students3PlusCount++;
            }else if(grade < 5) {
                students4PlusCount++;
            } else if(grade >= 5) {
                students5PlusCount++;
            }
        }

        double percentStudents5Plus = students5PlusCount / numStudentsD * 100;
        double percentStudents4Plus = students4PlusCount / numStudentsD * 100;
        double percentStudents3Plus = students3PlusCount / numStudentsD * 100;
        double percentStudents3Minus = students3MinusCount / numStudentsD * 100;
        double avgGrade = sumGrades / numStudents;

        System.out.printf("Top students: %.2f%%%n", percentStudents5Plus);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percentStudents4Plus);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percentStudents3Plus);
        System.out.printf("Fail: %.2f%%%n", percentStudents3Minus);
        System.out.printf("Average: %.2f%n", avgGrade);
    }
}
