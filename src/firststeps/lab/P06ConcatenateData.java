package firststeps.lab;

import java.util.Scanner;

/*Напишете програма, която прочита от конзолата име, фамилия, възраст и град и печата следното съобщение:
"You are <firstName> <lastName>, a <age>-years old person from <town>."*/

public class P06ConcatenateData {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", name, surname, age, town);
    }
}
