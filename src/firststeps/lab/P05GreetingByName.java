package firststeps.lab;

import java.util.Scanner;

/*Да се напише програма, която чете от конзолата текст (име на човек) и отпечатва "Hello, <name>!",
където <name> е въведеното име от конзолата.*/

public class P05GreetingByName {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.printf("Hello, %s!", name);
    }
}
