package conditionalstatements.advanced.lab;

import java.util.Scanner;

/*Напишете програма, която чете цяло число, въведено от потребителя, и отпечатва ден от седмицата (на английски език), 
в граници [1...7] или отпечатва "Error" в случай, че въведеното число е невалидно.
Примерен вход и изход:
1	Monday
2	Tuesday
3	Wednesday
4	Thursday
5	Friday
6	Saturday
7	Sunday
-1	Error*/

public class P01DayOfWeek {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int dayNumber = Integer.parseInt(scanner.nextLine());

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
        }
    }
}
