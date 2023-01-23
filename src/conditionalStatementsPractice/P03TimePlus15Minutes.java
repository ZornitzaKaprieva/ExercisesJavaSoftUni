package conditionalStatementsPractice;


import java.util.Scanner;

/*Да се напише програма, която чете час и минути от 24-часово денонощие, въведени от потребителя
и изчислява колко ще е часът след 15 минути.
Резултатът да се отпечата във формат часове:минути.
Часовете винаги са между 0 и 23, а минутите винаги са между 0 и 59.
Часовете се изписват с една или две цифри.
Минутите се изписват винаги с по две цифри, с водеща нула, когато е необходимо. */
public class P03TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int totalMinutes =(hour * 60) + (minutes + 15); //така се прибавят минутите към часовете
        int finalHours = totalMinutes / 60;
        int finalMinutes = totalMinutes % 60;

        if (finalHours <24) { //така например 23:59 + 15 мин ще излезе 00:14, а не 24:14
            System.out.printf("%d:%02d\n", finalHours, finalMinutes); //така казваме, че ако минутите са едноцифрено число, искаме да се сложи една 0 отпред
        } else {
            finalHours = 0;
        System.out.printf("%d:%02d\n", finalHours, finalMinutes);}


    }
}
