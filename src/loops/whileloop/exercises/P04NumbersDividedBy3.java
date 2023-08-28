package loops.whileloop.exercises;

/*Напишете програма, която печата всички числа в интервала от 1 до 100, който се делят на 3 без остатък, по едно на ред.*/

public class P04NumbersDividedBy3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++){

            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
