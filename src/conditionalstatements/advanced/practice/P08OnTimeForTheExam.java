package conditionalstatements.advanced.practice;

import java.util.Scanner;

/*От конзолата се четат 4 цели числа (по едно на ред), въведени от потребителя:
•	Първият ред съдържа час на изпита – цяло число от 0 до 23.
•	Вторият ред съдържа минута на изпита – цяло число от 0 до 59.
•	Третият ред съдържа час на пристигане – цяло число от 0 до 23.
•	Четвъртият ред съдържа минута на пристигане – цяло число от 0 до 59.
Изход
На първият ред отпечатайте:
•	"Late", ако студентът пристига по-късно от часа на изпита.
•	"On time", ако студентът пристига точно в часа на изпита или до 30 минути по-рано.
•	"Early", ако студентът пристига повече от 30 минути преди часа на изпита.
Ако студентът пристига с поне минута разлика от часа на изпита, отпечатайте на следващия ред:
•	"mm minutes before the start" за идване по-рано с по-малко от час.
•	"hh:mm hours before the start" за подраняване с 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:05.
•	 "mm minutes after the start" за закъснение под час.
•	"hh:mm hours after the start" за закъснение от 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:03.*/

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine()); //от 0 до 23.
        int examMinutes = Integer.parseInt(scanner.nextLine()); //от 0 до 59.
        int arrivalHour = Integer.parseInt(scanner.nextLine()); //от 0 до 23.
        int arrivalMinutes = Integer.parseInt(scanner.nextLine()); //от 0 до 59.

        boolean isValidExamHour = examHour >= 0 && examHour <= 23;
        boolean isValidExamMinutes = examMinutes >= 0 && examMinutes <= 59;
        boolean isValidArrivalHour = examHour >= 0 && examHour <= 23;


        //прехвърляме часовете в минути
        int examTotalMinutes = (examHour * 60) + examMinutes;
        int arrivalTotalMinutes = (arrivalHour * 60) + arrivalMinutes;

        int diff = Math.abs(arrivalTotalMinutes - examTotalMinutes);

        if (examTotalMinutes < arrivalTotalMinutes) {
            System.out.println("Late");

            if (diff < 60){
                System.out.printf("%d minutes after the start", diff);
            } else {
                int hour = diff/60; //получаваме часа
                int min = diff % 60; //получаваме минутите
                System.out.printf("%d:%02d hours after the start", hour, min);
            }

        } else if (diff <= 30 ){ //&& !(examTime - arrivalTime <= 30)
            System.out.println("On time");

            if (examTotalMinutes != arrivalTotalMinutes) {
                System.out.printf("%d minutes before the start", diff);
            }

        } else {
            System.out.println("Early");
            if (diff < 60) {
                System.out.printf("%d minutes before the start", diff);
            } else {
                int hour = diff/60; //получаваме часа
                int min = diff%60; //получаваме минутите
                System.out.printf("%d:%02d hours before the start", hour, min);
            }
        }
    }
}
