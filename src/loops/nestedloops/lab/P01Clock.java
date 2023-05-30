package loops.nestedloops.lab;


/*Напишете програма, която отпечатва часовете в денонощието от 0:0 до 23:59, всеки на отделен ред.
Часовете трябва да се изписват във формат "{час}:{минути}".*/
public class P01Clock {
    public static void main(String[] args) {

        for (int hour = 0; hour <= 23; hour++) {
            for (int min = 0; min <= 59; min++) {
                System.out.printf("%d:%d\n", hour, min); // System.out.printf("%d:%02d\n", hour, min);
            }
        }
    }
}
