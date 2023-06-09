package conditionalstatements.advanced.lab;

import java.util.Scanner;

/*Да се напише конзолна програма, която прочита възраст (десетично число) и пол ("m" или "f"), 
въведени от потребителя и отпечатва обръщение измежду следните:
•	"Mr." - мъж (пол "m") на 16 или повече години
•	"Master" - момче (пол "m") под 16 години
•	"Ms." - жена (пол "f") на 16 или повече години
•	"Miss" - момиче (пол "f") под 16 години*/

public class P04PersonalTitles {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        float age = Float.parseFloat(scanner.nextLine());
        String sex = scanner.nextLine();

        //solution1:
        switch (sex) {
            case "m":
                if (age >= 16) {
                    System.out.println("Mr.");
                }else  {
                    System.out.println("Master");
                }
                break;
            case "f":
                if (age >= 16) {
                    System.out.println("Ms.");
                }else  {
                    System.out.println("Miss");
                }
                break;
        }

        //solution 2:
//         if (sex.equals("m")) {
//             if (age >= 16) {
//                 System.out.println("Mr.");
//             } else {
//                 System.out.println("Master");
//             }
//         } else if (sex.equals("f")){
//             if (age >= 16) {
//                 System.out.println("Ms.");
//             } else {
//                 System.out.println("Miss");
//             }
//         }
    }
}
