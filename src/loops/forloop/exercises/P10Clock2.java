package loops.forloop.exercises;

/*Напишете програма, която да отпечатва часовете в денонощието от 0:0:0 до 23:59:59, всеки на отделен ред.
Часовете да се изписват във формат "{час} : {минути} : {секунди} ".*/

public class P10Clock2 {
    public static void main(String[] args) {

        for(int h = 0; h <= 23; h++){
            for(int m = 0; m <= 59; m++){
                for (int s = 0; s <= 59; s++) {
                    System.out.printf("%d : %d : %d%n", h, m, s);
                }
            }
        }
    }
}
