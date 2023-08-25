package loops.forloop.exercises;

/*Напишете програма, която отпечатва часовете в денонощието от 0:0 до 23:59, всеки на отделен ред.
Часовете трябва да се изписват във формат "{час} : {минути}". */

public class P09Clock {
    public static void main(String[] args) {

        for(int h = 0; h <= 23; h++){
            for(int m = 0; m <= 59; m++){
                System.out.printf("%d : %d%n", h, m);
            }
        }
    }
}
